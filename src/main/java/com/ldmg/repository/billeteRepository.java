package com.ldmg.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ldmg.model.Billete;

@Repository
public interface billeteRepository extends CrudRepository<Billete, Long> {
	
	
	

}
