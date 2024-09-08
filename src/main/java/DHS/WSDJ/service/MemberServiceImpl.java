package DHS.WSDJ.service;

import DHS.WSDJ.domain.member.Member;
import DHS.WSDJ.repository.memberRepository.MemberRepository;
import DHS.WSDJ.security.JwtUtil;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

	private final MemberRepository memberRepository;
	private final JwtUtil jwtUtil;
	private final PasswordEncoder encoder;
	private final ModelMapper modelMapper;


	@Override
	@Transactional
	public String join(JoinRequestDto dto) {

		// role이 student일때 grade정보가 없으면 안됨
		// 검증로직 추가할 것
		// 서비스에 넣어야되나? 시큐리티에서?

		Member member = Member.builder()    // 소속 department는 가입 후 기입
			.loginId(dto.getLoginId())
			.name(dto.getName())
			.password(dto.getPassword())
			.role(dto.getRole())
			.build();

		memberRepository.save(member);

		CustomUserInfoDto info = modelMapper.map(member, CustomUserInfoDto.class);

		return jwtUtil.createAccessToken(info);
	}


	@Override
	public String login(LoginRequestDto dto) {
		String id = dto.getLoginId();
		String password = dto.getPassword();
		Optional<Member> member = memberRepository.findMemberByLoginId(id);

		if (member.isEmpty()) {
			throw new UsernameNotFoundException("존재하지 않는 아이디입니다.");
		}

		if (!encoder.matches(password, member.get().getPassword())) {
			throw new BadCredentialsException("비밀번호가 일치하지 않습니다.");
		}

		CustomUserInfoDto info = modelMapper.map(member, CustomUserInfoDto.class);

		String accessToken = jwtUtil.createAccessToken(info);
		return accessToken;
	}

}
