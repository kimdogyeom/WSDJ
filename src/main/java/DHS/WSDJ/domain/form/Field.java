package DHS.WSDJ.domain.form;

import DHS.WSDJ.domain.DataType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Field {

	@Id @GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "form_id")
	private Form form;

	private String name;

	@Enumerated(EnumType.STRING)
	private DataType type;
	private String description;


}
