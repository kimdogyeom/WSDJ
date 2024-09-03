package DHS.WSDJ_FIN.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {

	@Id @GeneratedValue
	@Column(name = "department_id")
	private Long id;

	private String name;

	@OneToMany(mappedBy = "department")
	private List<Admin> adminList = new ArrayList<>();
}
