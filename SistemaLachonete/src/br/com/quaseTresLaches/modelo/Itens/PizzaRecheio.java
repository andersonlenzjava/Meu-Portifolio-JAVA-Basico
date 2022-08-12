package br.com.quaseTresLaches.modelo.Itens;

import java.math.BigDecimal;

public class PizzaRecheio extends Item  {

	public String tipoRecheio;

	public PizzaRecheio(String dataValidade, double pesoTotal, BigDecimal precoVenda, String tipoRecheio) {
		super(dataValidade, pesoTotal, precoVenda);//ver se aqui nao precisa ser da classe 
		this.tipoRecheio = tipoRecheio;
	}

	public String getTipoRecheio() {
		return tipoRecheio;
	}

}
