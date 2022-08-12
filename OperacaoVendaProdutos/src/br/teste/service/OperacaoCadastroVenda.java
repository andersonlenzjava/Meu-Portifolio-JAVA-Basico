package br.teste.service;

import java.math.BigDecimal;
import java.util.ArrayList;

import br.teste.modelo.ProdutoAVenda;
import br.teste.modelo.CalculoComissao;
import br.teste.modelo.Vendedor;

public class OperacaoCadastroVenda {
	
	public static void main(String[] args) {
		
		Vendedor v1 = new Vendedor("Caio", 1);
		Vendedor v2 = new Vendedor("Fabio", 2);
		Vendedor v3 = new Vendedor("Maik", 3);
		
		v1.setComissao(new BigDecimal("0.1"));
		v2.setComissao(new BigDecimal("0.2"));
		v3.setComissao(new BigDecimal("0.3"));
		
		ArrayList<Vendedor> vendedores = new ArrayList<>();
		
		vendedores.add(v1);
		vendedores.add(v2);
		vendedores.add(v3);
		
		ProdutoAVenda pd1 = new ProdutoAVenda("Suco Uva", new BigDecimal("40"));
		ProdutoAVenda pd2 = new ProdutoAVenda("Suco Laranja", new BigDecimal("44"));
		ProdutoAVenda pd3 = new ProdutoAVenda("Suco Manga", new BigDecimal("88"));
		ProdutoAVenda pd4 = new ProdutoAVenda("Suco Tangerina", new BigDecimal("66"));
		
		ArrayList<ProdutoAVenda> listaCompras1 = new ArrayList<>();
		listaCompras1.add(pd1);
		listaCompras1.add(pd2);
		listaCompras1.add(pd3);
		listaCompras1.add(pd3);
		
		CalculoComissao calCom = new CalculoComissao(listaCompras1, v2);
		
		System.out.println("===============================");
		
		ArrayList<ProdutoAVenda> listaCompras2 = new ArrayList<>();
		listaCompras2.add(pd1);
		listaCompras2.add(pd2);
		listaCompras2.add(pd3);
		listaCompras2.add(pd3);
		
		CalculoComissao calCom2 = new CalculoComissao(listaCompras2, v1);
		
		
	}
	
}
