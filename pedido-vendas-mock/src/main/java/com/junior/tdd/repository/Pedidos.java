package com.junior.tdd.repository;

import com.junior.tdd.model.Pedido;
import com.junior.tdd.service.AcaoLancamentoPedido;

public class Pedidos implements AcaoLancamentoPedido {
	
	@Override
	public void executar(Pedido pedido) {
		System.out.println("Salvando no banco de dados...");
	}
	
	public Pedido buscarPeloCodigo(Long codigo) {
		return new Pedido();
	}

}
