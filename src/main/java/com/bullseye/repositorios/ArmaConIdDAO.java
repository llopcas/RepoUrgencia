package com.bullseye.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bullseye.entidades.ArmaConId;



@RepositoryRestResource(path = "armas", itemResourceRel = "arma", collectionResourceRel = "armas")
public interface ArmaConIdDAO extends JpaRepository<ArmaConId, Long> {
}
