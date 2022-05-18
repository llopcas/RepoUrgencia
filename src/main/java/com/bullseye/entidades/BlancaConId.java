package com.bullseye.entidades;

import javax.persistence.Entity;
import javax.persistence.Access; 
import javax.persistence.AccessType; 
import javax.persistence.DiscriminatorValue;
import es.bullseye.BlancaInterfaz;


@Entity
//@Table(name = "OPTICAS")
@Access(value=AccessType.FIELD)
@DiscriminatorValue("BLANCA")
public class BlancaConId extends ArmaConId implements BlancaInterfaz {

	
	private float longitudEnMilimetros;

	public BlancaConId() {
	}

	public BlancaConId(float longitudEnMilimetros) {
		super();
		this.longitudEnMilimetros = longitudEnMilimetros;

	}

	@Override
	public float getLongitudEnMilimetros() {

		return longitudEnMilimetros;
	}

	@Override
	public void setLongitudEnMilimetros(float longitudEnMilimetros) {
		this.longitudEnMilimetros = longitudEnMilimetros;

	}

}
