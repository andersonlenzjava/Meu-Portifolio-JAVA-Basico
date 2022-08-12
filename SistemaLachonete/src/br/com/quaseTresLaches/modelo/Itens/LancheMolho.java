package br.com.quaseTresLaches.modelo.Itens;

import java.math.BigDecimal;

public class LancheMolho extends Item {

	public String tipoMolho;

	public LancheMolho(String dataValidade, double pesoTotal, BigDecimal precoVenda, String tipoMolho) {
		super(dataValidade, pesoTotal, precoVenda);
		this.tipoMolho = tipoMolho;
	}

	public String getTipoMolho() {
		return tipoMolho;
	}
	
}
