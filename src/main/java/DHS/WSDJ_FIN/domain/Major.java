package DHS.WSDJ_FIN.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Major {

	@Id @GeneratedValue
	@Column(name = "major_id")
	private Long id;

	private String name;

	@OneToMany(mappedBy = "major")
	private List<Student> studentList = new ArrayList<>();

}
