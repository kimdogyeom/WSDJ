package DHS.WSDJ_FIN.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Form {

	@Id @GeneratedValue
	private Long id;

	private String name;
	private String description;

	@OneToMany(mappedBy = "form")
	private List<Field> fields = new ArrayList<>();

}
