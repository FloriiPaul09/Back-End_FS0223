package Class;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Prenotazione {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long Id;
    
    @ManyToOne
    protected Utente utente;
    
    protected LocalDate dataPrenotata;
    protected LocalDate dataPrenotazione;
}
