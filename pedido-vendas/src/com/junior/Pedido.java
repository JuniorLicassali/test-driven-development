package com.junior;

import java.util.ArrayList;
import java.util.List;

import com.junior.desconto.CalculadoraFaixaDesconto;

public class Pedido {
	
	private List<ItemPedido> itens = new ArrayList<>();
	
	private CalculadoraFaixaDesconto calculadoraFaixaDesconto;

	public Pedido(CalculadoraFaixaDesconto calculadoraFaixaDesconto) {
		super();
		this.calculadoraFaixaDesconto = calculadoraFaixaDesconto;
	}

	private void validarQuantidadeItems(ItemPedido itemPedido) {
		if (itemPedido.getQuantidade() < 0) {
			throw new QuantidadeDeItensInvalidaException();
		}
	}
	
	public void adicionarItem(ItemPedido itemPedido) {
		validarQuantidadeItems(itemPedido);
		itens.add(itemPedido);
	}

	public ResumoPedido resumo() {
		double valorTotal = itens.stream()
				.mapToDouble(i -> i.getValorUnitario() * i.getQuantidade()).sum();
		
		double desconto = calculadoraFaixaDesconto.desconto(valorTotal);
		
		return new ResumoPedido(valorTotal, desconto);
	}

}
