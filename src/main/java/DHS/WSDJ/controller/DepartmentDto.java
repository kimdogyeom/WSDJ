package DHS.WSDJ.controller;

import java.io.Serializable;
import lombok.Value;

/**
 * DTO for {@link DHS.WSDJ.domain.member.Department}
 */
@Value
public class DepartmentDto implements Serializable {

	Long id;
	String name;
}