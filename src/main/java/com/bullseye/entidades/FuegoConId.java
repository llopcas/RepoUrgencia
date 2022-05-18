package com.bullseye.entidades;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import es.bullseye.FuegoInterfaz;

@Access(value = AccessType.FIELD)
@DiscriminatorValue("FUEGO")
@Entity
public class FuegoConId extends ArmaConId implements FuegoInterfaz {

	@Column(name = "CALIBRE_MILIMETROS")
	private float calibreEnMilimetros;

	@Column(name = "NOMBRE")
	private String nombre;

	@Override
	public float getCalibreEnMilimetros() {

		return calibreEnMilimetros;
	}

	@Override
	public void setCalibreEnMilimetros(float calibreEnMilimetros) {
		this.calibreEnMilimetros = calibreEnMilimetros;

	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getNombre() {
		return nombre;

	}

	public FuegoConId() {
	}

	public FuegoConId(float calibreEnMilimetros) {
		super();
		this.calibreEnMilimetros = calibreEnMilimetros;
	}

}
