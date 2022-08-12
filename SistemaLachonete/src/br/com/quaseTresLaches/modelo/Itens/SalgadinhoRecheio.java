package br.com.quaseTresLaches.modelo.Itens;

import java.math.BigDecimal;

public class SalgadinhoRecheio extends Item  {

	public String tipoRecheio;

	public SalgadinhoRecheio(String dataValidade, double pesoTotal, BigDecimal precoVenda, String tipoRecheio) {
		super(dataValidade, pesoTotal, precoVenda);
		this.tipoRecheio = tipoRecheio;
	}

	public String getTipoRecheio() {
		return tipoRecheio;
	}
	
}
