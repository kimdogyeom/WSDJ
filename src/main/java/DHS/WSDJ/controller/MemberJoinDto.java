package DHS.WSDJ.controller;

import DHS.WSDJ.domain.member.Role;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import lombok.Value;

/**
 * DTO for {@link DHS.WSDJ.domain.member.Admin}
 */
@Value
public class MemberJoinDto implements Serializable {

	@NotNull(message = "id항목은 필수입니다.")
	Long id;

	@NotNull(message = "name항목은 필수입니다.")
	String name;

	@NotNull(message = "email항목은 필수입니다.")
	String email;

	@NotNull(message = "password항목은 필수입니다.")
	String password;

	@NotNull(message = "role항목은 필수입니다.")
	Role role;

	@NotNull(message = "department항목은 필수입니다.")
	DepartmentDto department;

}