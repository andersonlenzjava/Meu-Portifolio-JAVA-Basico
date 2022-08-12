package br.com.quaseTresLaches.modelo.Itens;

import java.math.BigDecimal;

public class LancheRecheio extends Item  {

	public String tipoRecheio;

	public LancheRecheio(String dataValidade, double pesoTotal, BigDecimal precoVenda, String tipoRecheio) {
		super(dataValidade, pesoTotal, precoVenda);
		this.tipoRecheio = tipoRecheio;
	}

	public String getTipoRecheio() {
		return tipoRecheio;
	}

}
