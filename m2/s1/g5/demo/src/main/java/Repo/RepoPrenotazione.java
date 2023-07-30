package Repo;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import Class.Prenotazione;
import Class.Utente;

public interface RepoPrenotazione extends PagingAndSortingRepository<Prenotazione, Long>{
	
	public Page<Prenotazione> findUserAndDate(Utente utente, LocalDate dataPrenotata, Pageable pageable );
	public Page<Prenotazione> findUser(Utente utente, Pageable pageable);
}
