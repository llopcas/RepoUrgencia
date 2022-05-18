package com.bullseye.entidades;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import es.bullseye.Deposito;

@Entity
public class DepositoConId extends Deposito {

	private Collection<ArmaConId> armas = new ArrayList<>();
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	@OneToMany(cascade = CascadeType.ALL, targetEntity = ArmaConId.class, mappedBy = "depositos")
	public Collection<ArmaConId> getArmas() {
		return armas;
	}

	public void addArmaConId(ArmaConId arma) {
		getArmas().add(arma);
		arma.setDeposito(this);
	}

	public DepositoConId() {

	}

	public DepositoConId(int codigoDeposito) {
		super(codigoDeposito);
	}
}
