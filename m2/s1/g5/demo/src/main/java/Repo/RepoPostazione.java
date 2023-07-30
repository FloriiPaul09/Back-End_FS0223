package Repo;

import java.time.LocalDate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import Class.Citta;
import Class.Postazione;
import Class.Tipo;

public interface RepoPostazione extends PagingAndSortingRepository<Postazione, Long>{
	
	@Query("SELECT post FROM Postazione post where post.edificio.citta = :citta AND post.tipo = :tipo AND post.id NOT IN (SELECT pre.prenotazione.id FROM Prenotazione pre wherepre.dataPrenotata <> :dataRichiesta)")
	public Page<Postazione> findFreeByCity(Citta citta, Tipo tipo, LocalDate dataRichiesta, Pageable pageable);
	public Page<Postazione> findByBuildingCityType(Citta citta, Tipo tipo, Pageable pageable);
	public Page<Postazione> findByCode(String codice, Pageable pageable);
}
