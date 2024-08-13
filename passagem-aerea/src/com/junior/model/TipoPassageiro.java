package com.junior.model;

import com.junior.service.CalculadoraPrecoPassagem;
import com.junior.service.PrecoPassagemGold;
import com.junior.service.PrecoPassagemSilver;

public enum TipoPassageiro {

	GOLD(new PrecoPassagemGold()),
	SILVER(new PrecoPassagemSilver());
	
	CalculadoraPrecoPassagem calculadoraPrecoPassagem;
	
	private TipoPassageiro(CalculadoraPrecoPassagem calculadoraPrecoPassagem) {
		this.calculadoraPrecoPassagem = calculadoraPrecoPassagem;
	}
	
	public CalculadoraPrecoPassagem getCalculadora() {
		return calculadoraPrecoPassagem;
	}
	
}
