package com.junior.service;

import com.junior.model.Passageiro;
import com.junior.model.Voo;

public class PrecoPassagemService {

	public double calcular(Passageiro passageiro, Voo voo) {
		return passageiro.getTipo().getCalculadora().calcular(voo);
	}

}
