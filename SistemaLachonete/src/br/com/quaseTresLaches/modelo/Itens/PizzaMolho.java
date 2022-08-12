package br.com.quaseTresLaches.modelo.Itens;

import java.math.BigDecimal;

public class PizzaMolho extends Item  {

	public String tipoMolho;

	public PizzaMolho(String dataValidade, double pesoTotal, BigDecimal precoVenda, String tipoMolho) {
		super(dataValidade, pesoTotal, precoVenda);
		this.tipoMolho = tipoMolho;
	}

	public String getTipoMolho() {
		return tipoMolho;
	}
	
}
