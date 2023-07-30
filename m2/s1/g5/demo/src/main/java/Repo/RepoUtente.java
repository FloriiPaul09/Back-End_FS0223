package Repo;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import Class.Utente;

public interface RepoUtente extends PagingAndSortingRepository <Utente, Long>{

	public Page<Utente> findByName(String nome, Pageable pageable);
	public Optional<Utente> findByUsername(String username);
	
}
