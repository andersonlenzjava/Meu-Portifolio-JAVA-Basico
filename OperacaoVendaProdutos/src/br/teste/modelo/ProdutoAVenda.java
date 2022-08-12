package br.teste.modelo;

import java.math.BigDecimal;

public class ProdutoAVenda {

	private String nomeProduto;
	private BigDecimal valorProduto;
	
	public ProdutoAVenda(String nome, BigDecimal valor) {
		this.nomeProduto = nome;
		this.valorProduto = valor;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public BigDecimal getValorProduto() {
		return valorProduto;
	}
}
