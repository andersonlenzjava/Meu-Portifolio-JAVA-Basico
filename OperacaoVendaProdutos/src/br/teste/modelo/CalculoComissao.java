package br.teste.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CalculoComissao {

	public BigDecimal totalVenda = new BigDecimal("0.0");
	public BigDecimal valorComissao = new BigDecimal("0.0");

	public CalculoComissao(ArrayList<ProdutoAVenda> produto, Vendedor vendedor) {
		for (ProdutoAVenda prod : produto) {
			totalVenda = totalVenda.add(prod.getValorProduto());
		}
		valorComissao = totalVenda.multiply(vendedor.getComissao());
		System.out.println("Vendedor " + vendedor.getNome());
		System.out.println("Total venda: " + totalVenda);
		System.out.println("Comissão (%): " + vendedor.getComissao());
		System.out.println("Comissão (R$): " + valorComissao);
	}

//	public BigDecimal CalcularComissao (ArrayList<ProdutoAVenda> produto, Vendedor vendedor) {
//		for (ProdutoAVenda prod : produto) {
//			totalVenda = totalVenda.add(prod.getValorProduto()); 
//		}
//		BigDecimal TotalComissao = totalVenda.multiply(vendedor.getComissao());
//		System.out.println("Vendedor " + vendedor.getNome());
//		System.out.println("Total venda: " + totalVenda);
//		System.out.println("Comissão (%): " + vendedor.getComissao());
//		System.out.println("Comissão (R$): " + TotalComissao);
//		return TotalComissao;
//	}

}
