package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<Itemm> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Itemm(p, quantidade));
	}
	
	void adicionarItem(String nome, double preco, int quantidade) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Itemm(produto, quantidade));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		
		for(Itemm item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
		
	}
}
