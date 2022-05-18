package com.bullseye.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bullseye.entidades.FuegoConId;

@RepositoryRestResource(path = "fuego", itemResourceRel = "fuego", collectionResourceRel = "fuegos")
public interface FuegoConIdDAO extends JpaRepository<FuegoConId, Long>{
	
}
