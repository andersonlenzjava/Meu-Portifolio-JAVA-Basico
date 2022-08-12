package br.com.quaseTresLaches.modelo.Itens;

import java.math.BigDecimal;

public class LancheTipoPao extends Item  {

	public String tipoPao;

	public LancheTipoPao(String dataValidade, double pesoTotal, BigDecimal precoVenda, String tipoPao) {
		super(dataValidade, pesoTotal, precoVenda);
		this.tipoPao = tipoPao;
	}

	public String getTipoPao() {
		return tipoPao;
	}
	
}
