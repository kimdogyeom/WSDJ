package DHS.WSDJ.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class CustomUserInfoDto{

	private Long id;

	private String loginId;

	private String name;

	private String password;

	private String role;

}
