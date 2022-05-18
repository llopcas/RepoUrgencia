package com.bullseye.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.bullseye.entidades.BlancaConId;

@RepositoryRestResource(path = "blanca", itemResourceRel = "blanca", collectionResourceRel = "blancas")
public interface BlancaConIdDAO extends JpaRepository<BlancaConId, Long>{

}
