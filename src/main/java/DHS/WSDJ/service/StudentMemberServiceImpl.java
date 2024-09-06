package DHS.WSDJ.service;

import DHS.WSDJ.domain.member.Student;
import DHS.WSDJ.repository.StudentRepository;
import DHS.WSDJ.security.JwtUtil;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("studentMemberServiceImpl")
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class StudentMemberServiceImpl implements MemberService {

    private final StudentRepository studentRepository;
    private final JwtUtil jwtUtil;
    private final PasswordEncoder encoder;
    private final ModelMapper modelMapper;

    @Override
    @Transactional
    public String login(LoginRequestDto dto) {
        Long id = dto.getId();
        String password = dto.getPassword();
        Optional<Student> student = studentRepository.findById(id);

        if (student.isEmpty()) {
            throw new UsernameNotFoundException("존재하지 않는 아이디입니다.");
        }

        if (!encoder.matches(password, student.get().getPassword())) {
            throw new BadCredentialsException("비밀번호가 일치하지 않습니다.");
        }

        CustomUserInfoDto info = modelMapper.map(student, CustomUserInfoDto.class);

        String accessToken = jwtUtil.createAccessToken(info);
        return accessToken;
    }

    @Override
    public String join(JoinRequestDto dto) {
        return "";
    }
}