package DHS.WSDJ_FIN.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class AdminProject {

	@Id @GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "admin_id")
	private Admin admin;

	@ManyToOne
	@JoinColumn(name = "project_id")
	private Project project;


}
