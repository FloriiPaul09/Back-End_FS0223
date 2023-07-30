package Repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import Class.Citta;

public interface RepoCitta extends PagingAndSortingRepository<Citta, Long>{
	
	public Page<Citta> findByName(String nome, Pageable pageable);
	
}
