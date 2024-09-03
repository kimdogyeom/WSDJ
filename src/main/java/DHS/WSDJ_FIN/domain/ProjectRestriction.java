package DHS.WSDJ_FIN.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ProjectRestriction {

	@Id @GeneratedValue
	@Column(name = "restriction_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "proejct_id")
	private Project project;

	@Enumerated(EnumType.STRING)
	private RestrictionType restrictionType;

	// 조건에 대한 값
	private String restrictionValue;

}
