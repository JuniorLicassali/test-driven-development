package com.junior.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.junior.model.Passageiro;
import com.junior.model.TipoPassageiro;
import com.junior.model.Voo;

public class PrecoPassagemServiceTest {
	
	private PrecoPassagemService precoPassagemService;
	
	@Before
	public void setup() {
		precoPassagemService = new PrecoPassagemService();
	}
	
	@Test
	public void deveCalcularValorPassagemParaPassageiroGold_ComValorAbaixoDoLimite() throws Exception {
		Passageiro passageiro = new Passageiro("Zequinha", TipoPassageiro.GOLD);
		Voo voo = new Voo("São Paulo", "Rio de Janeiro", 100.0);
		double valor = precoPassagemService.calcular(passageiro, voo);
		
		assertEquals(90.0, valor, 0.0001);
	}
	
	@Test
	public void deveCalcularValorPassagemParaPassageiroGold_ComValorAcimaDoLimite() throws Exception {
		Passageiro passageiro = new Passageiro("Zequinha", TipoPassageiro.GOLD);
		Voo voo = new Voo("São Paulo", "Rio de Janeiro", 600.0);
		double valor = precoPassagemService.calcular(passageiro, voo);
		
		assertEquals(510.0, valor, 0.0001);
	}
	
	@Test
	public void deveCalcularValorPassagemParaPassageiroSilver_ComValorAbaixoDoLimite() throws Exception {
		Passageiro passageiro = new Passageiro("Jaum", TipoPassageiro.SILVER);
		Voo voo = new Voo("São Paulo", "Rio de Janeiro", 100.0);
		double valor = precoPassagemService.calcular(passageiro, voo);
		
		assertEquals(94.0, valor, 0.0001);
	}
	
	@Test
	public void deveCalcularValorPassagemParaPassageiroSilver_ComValorAcimaDoLimite() throws Exception {
		Passageiro passageiro = new Passageiro("Jaum", TipoPassageiro.SILVER);
		Voo voo = new Voo("São Paulo", "Rio de Janeiro", 800.0);
		double valor = precoPassagemService.calcular(passageiro, voo);
		
		assertEquals(720.0, valor, 0.0001);
	}
	
}
