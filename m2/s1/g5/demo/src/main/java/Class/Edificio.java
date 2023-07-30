package Class;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data

public class Edificio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	protected String nome;
	protected String indirizzo;
	@ManyToOne
	protected Citta citta;
}
