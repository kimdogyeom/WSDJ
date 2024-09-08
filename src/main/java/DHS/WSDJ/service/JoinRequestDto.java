package DHS.WSDJ.service;

import DHS.WSDJ.domain.member.Role;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoinRequestDto {

	@NotNull(message = "아이디 입력은 필수입니다.")
	private String loginId;

	@NotNull(message = "패스워드 입력은 필수입니다.")
	private String password;

	@NotNull(message = "이름 입력은 필수입니다.")
	private String name;

	private int grade;

	@NotNull(message = "역할 선택은 필수입니다.")
	private Role role;


}
