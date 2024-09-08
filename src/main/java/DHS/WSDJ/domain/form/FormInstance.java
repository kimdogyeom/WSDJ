package DHS.WSDJ.domain.form;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FormInstance {

	@Id
	@GeneratedValue
	@Column(name = "form_instance_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "form_id")
	private Form form;

	private LocalDateTime submittedTime;

	@OneToMany(mappedBy = "formInstance")
	private List<FieldInstance> fieldInstances = new ArrayList<>();

}

