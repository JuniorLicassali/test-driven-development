package com.junior.tdd.email;

import com.junior.tdd.model.Pedido;
import com.junior.tdd.service.AcaoLancamentoPedido;

public class NotificadorEmail implements AcaoLancamentoPedido {

	@Override
	public void executar(Pedido pedido) {
		System.out.println("Enviando o e-mail...");
	}
	
}
