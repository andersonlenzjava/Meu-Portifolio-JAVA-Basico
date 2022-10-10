package br.com.quaseTresLanches.modelo.lanches;

import java.math.BigDecimal;

import br.com.quaseTresLaches.modelo.Itens.SalgadinhoMassa;
import br.com.quaseTresLaches.modelo.Itens.SalgadinhoRecheio;
import br.com.quaseTresLaches.modelo.Itens.SalgadinhoTipoPreparo;
import br.com.quaseTresLanches.acao.AlgumItemEstaVencidoException;
import br.com.quaseTresLanches.acao.CalculaDataValidade;
import br.com.quaseTresLanches.acao.VerificaValidade;

public class Salgadinho implements CalculosPrato {

	SalgadinhoTipoPreparo tipoPreparo;
	SalgadinhoMassa massa;
	SalgadinhoRecheio recheio;
	BigDecimal soma = BigDecimal.ZERO;
	String dataValidade;

	public Salgadinho(SalgadinhoTipoPreparo tipoPreparo, SalgadinhoMassa massa, SalgadinhoRecheio recheio) {
		try {
			VerificaValidade.verificaValidade(tipoPreparo, tipoPreparo.getTipoPreparo());
		} catch (AlgumItemEstaVencidoException e) {
			System.out.println("o item " + tipoPreparo + " está vencido!");
			e.printStackTrace();
		}
		try {
			VerificaValidade.verificaValidade(massa, massa.getTipoMassa());
		} catch (AlgumItemEstaVencidoException e) {
			System.out.println("o item " + massa + " está vencido!");
			e.printStackTrace();
		}
		try {
			VerificaValidade.verificaValidade(recheio, recheio.getTipoRecheio());
		} catch (AlgumItemEstaVencidoException e) {
			System.out.println("o item " + recheio + " está vencido!");
			e.printStackTrace();
		}
		this.tipoPreparo = tipoPreparo;
		this.massa = massa;
		this.recheio = recheio;
		this.dataValidade = CalculaDataValidade.geraDataValidade(14);
	}

	@Override
	public BigDecimal calculaPrecoPrato() {
		this.soma = this.tipoPreparo.getPrecoVenda().add(this.massa.getPrecoVenda().add(this.recheio.getPrecoVenda()));
		return this.soma;
	}

	@Override
	public double calculaPesoPrato() {
		double soma = (this.tipoPreparo.getPeso() + this.massa.getPeso() + this.recheio.getPeso());
		return soma;
	}

	public String getDataValidade() {
		return dataValidade;
	}
	
	public SalgadinhoMassa getMassa() {
		return massa;
	}

	public SalgadinhoRecheio getRecheio() {
		return recheio;
	}

	public BigDecimal getSoma() {
		return soma;
	}

}
