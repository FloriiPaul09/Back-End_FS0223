package Class;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data

public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "utente_seq")
	@SequenceGenerator(name = "utente_seq", sequenceName = "utente_seq")
	protected Long id;
	
	protected String nome;
	protected String cognome;
	protected String email;
	
}
