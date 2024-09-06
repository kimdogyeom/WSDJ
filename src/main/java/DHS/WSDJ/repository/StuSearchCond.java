package DHS.WSDJ.repository;

import DHS.WSDJ.domain.member.Department;
import lombok.Data;


@Data
public class StuSearchCond {    /* 쓸지 안쓸지 모르겠음 */

	private int grade;
	private String department;

	public StuSearchCond() {
	}

	public StuSearchCond(int grade, String department) {
		this.grade = grade;
		this.department = department;
	}
}
