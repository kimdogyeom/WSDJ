package DHS.WSDJ_FIN.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Project {

	@Id @GeneratedValue
	@Column(name = "project_id")
	private Long id;

	private String name;
	private String attribute;
	private String image_url;

	@Enumerated(EnumType.STRING)
	private ProjectStatus status;

	private Date start_date;
	private Date end_date;

	// 지원금 관련 필드
	private int fundingAmount;  // 지원금 액수
	private String fundingSource;  // 지원금 출처 (예: 정부, 기업 등)
	private String fundingDate;    // 지원금 수령일

	@OneToMany(mappedBy = "project")
	private List<ProjectRestriction> restriction = new ArrayList<>();

	@OneToMany(mappedBy = "project")
	private List<StudentProject> stuProejctList;

	@OneToMany(mappedBy = "project")
	private List<AdminProject> adminProjectList;

}
