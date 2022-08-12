package br.com.quaseTresLaches.modelo.Itens;

import java.math.BigDecimal;

public class SalgadinhoTipoPreparo extends Item  {

	public String tipoPreparo;

	public SalgadinhoTipoPreparo(String dataValidade, double pesoTotal, BigDecimal precoVenda, String tipoPreparo) {
		super(dataValidade, pesoTotal, precoVenda);
		this.tipoPreparo = tipoPreparo;
	}

	public String getTipoPreparo() {
		return tipoPreparo;
	}
	
}
