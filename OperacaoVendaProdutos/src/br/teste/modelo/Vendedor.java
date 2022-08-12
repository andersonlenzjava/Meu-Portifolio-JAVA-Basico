package br.teste.modelo;

import java.math.BigDecimal;

public class Vendedor {
	
	private String nome;
	private int id;
	private BigDecimal comissao;
	
	
	public Vendedor(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}

	public void setComissao(BigDecimal comissao) {
		this.comissao = comissao;
	}
	
	public BigDecimal getComissao() {
		return comissao;
	}
	
	public String getNome() {
		return nome;
	}


}
