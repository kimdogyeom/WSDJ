package DHS.WSDJ.domain.member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Department {

	@Id @GeneratedValue
	@Column(name = "department_id")
	private Long id;

	@Column(nullable = false)
	private String name;

	@OneToMany(mappedBy = "department")
	private List<Member> memberList = new ArrayList<>();

}
