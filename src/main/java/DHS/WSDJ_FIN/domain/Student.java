package DHS.WSDJ_FIN.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {

	@Id @GeneratedValue
	@Column(name = "member_id")
	private Long id;

	private String name;

	@ManyToOne
	private Major major;

	private int grade;

}
