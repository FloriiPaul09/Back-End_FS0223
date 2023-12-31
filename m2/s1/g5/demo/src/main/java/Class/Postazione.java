package Class;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;


@Entity
@Data

public class Postazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	protected String descrizione;

	@Enumerated(EnumType.STRING)
	protected Enum Tipo;

	protected Integer occupanti;
	
	@ManyToOne
	protected Edificio edificio;
	
	
	
}
