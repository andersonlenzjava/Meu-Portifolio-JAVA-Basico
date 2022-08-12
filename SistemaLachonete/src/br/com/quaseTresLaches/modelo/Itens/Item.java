package br.com.quaseTresLaches.modelo.Itens;

import java.math.BigDecimal;

public abstract class Item {

	public BigDecimal precoVenda;
	public String dataValidade;
	public double peso;

	public Item(String dataValidade, double pesoTotal, BigDecimal precoVenda) {
		this.dataValidade = dataValidade;
		this.peso = pesoTotal;
		this.precoVenda = precoVenda;
	}

	public BigDecimal getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(BigDecimal precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
