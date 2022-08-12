package br.com.quaseTresLaches.modelo.Itens;

import java.math.BigDecimal;

public class PizzaBorda extends Item  {

	public boolean temBorda;

	public PizzaBorda(String dataValidade, double pesoTotal, BigDecimal precoVenda, Boolean temBorda) {
		super(dataValidade, pesoTotal, precoVenda);
		this.temBorda = temBorda;
	}

	public boolean isTemBorda() {
		return temBorda;
	}
	
	public String getNome() {
		String nomeBorda;
		if (temBorda) {
			nomeBorda = "Tem borda";
		} else {
			nomeBorda = "Não tem borda";
		}
		return nomeBorda;
	}
	
}
