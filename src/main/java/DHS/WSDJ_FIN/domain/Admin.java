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
public class Admin {

	@Id @GeneratedValue
	@Column(name = "admin_id")
	private Long id;

	private String name;

	@ManyToOne
	private Department department;

	@OneToMany(mappedBy = "admin")
	private List<AdminProject> projectList = new ArrayList<>();
}
