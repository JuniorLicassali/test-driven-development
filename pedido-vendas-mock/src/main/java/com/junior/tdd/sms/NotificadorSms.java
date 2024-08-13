package com.junior.tdd.sms;

import com.junior.tdd.model.Pedido;
import com.junior.tdd.service.AcaoLancamentoPedido;

public class NotificadorSms implements AcaoLancamentoPedido {
	
	@Override
	public void executar(Pedido pedido) {
		System.out.println("Enviando o sms...");
	}
	
}
