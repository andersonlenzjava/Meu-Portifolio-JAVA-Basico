package br.com.quaseTresLaches.modelo.Itens;

import java.math.BigDecimal;

public class SalgadinhoMassa extends Item  {

	public String tipoMassa;

	public SalgadinhoMassa(String dataValidade, double pesoTotal, BigDecimal precoVenda, String tipoMassa) {
		super(dataValidade, pesoTotal, precoVenda);
		this.tipoMassa = tipoMassa;
	}

	public String getTipoMassa() {
		return tipoMassa;
	}

}
