package com.bullseye.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bullseye.entidades.DepositoConId;

@RepositoryRestResource
public interface DepositoConIdDAO extends JpaRepository<DepositoConId, Long>{

}
