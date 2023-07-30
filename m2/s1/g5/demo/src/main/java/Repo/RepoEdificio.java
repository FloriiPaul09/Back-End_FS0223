package Repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import Class.Citta;
import Class.Edificio;

public interface RepoEdificio extends PagingAndSortingRepository<Edificio, Long>{
	
	public Page<Edificio> findByCity(Citta citta, Pageable pageable);
	public Page<Edificio> findByName(String nome, Pageable pageable);
	
}
