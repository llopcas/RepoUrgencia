package com.bullseye.rest;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class MixIns {
	
	@JsonPropertyOrder({"idDeposito", "nombre" , "calibreEnMilimetros" })
	public static interface ArmaConId {
		
		
		
	}

}
