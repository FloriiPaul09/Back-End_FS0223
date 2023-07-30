package Class;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import lombok.Data;

@Entity
@Data

public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	protected String username;
	protected String nome;
	protected String cognome;
	protected String email;
	protected String password;
	
	@ManyToMany
	@JoinTable(name = "ruoli_utenti", joinColumns = @JoinColumn(name = "utente_id"), inverseJoinColumns = @JoinColumn(name = "ruoli_id"))
	protected Set<Ruoli> ruoli = new HashSet<>();
	
}
