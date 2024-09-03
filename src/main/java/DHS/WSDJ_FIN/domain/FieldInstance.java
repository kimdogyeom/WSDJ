package DHS.WSDJ_FIN.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class FieldInstance {

	@Id @GeneratedValue
	@Column(name = "field_instance_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "form_instance_id")
	private FormInstance formInstance;

	@ManyToOne
	@JoinColumn(name = "field_id")
	private Field field;
}
