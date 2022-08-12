package br.com.quaseTresLanches.modelo.lanches;

import java.math.BigDecimal;

import br.com.quaseTresLaches.modelo.Itens.LancheMolho;
import br.com.quaseTresLaches.modelo.Itens.LancheRecheio;
import br.com.quaseTresLaches.modelo.Itens.LancheTipoPao;
import br.com.quaseTresLanches.acao.AlgumItemEstaVencidoException;
import br.com.quaseTresLanches.acao.CalculaDataValidade;
import br.com.quaseTresLanches.acao.VerificaValidade;

public class Lanche implements CalculosPrato {

	LancheTipoPao tipoPao;
	LancheRecheio recheioLanche;
	LancheMolho molho;
	BigDecimal soma = BigDecimal.ZERO;
	String dataValidade;

	public Lanche(LancheTipoPao tipoPao, LancheRecheio recheioLanche, LancheMolho molho) {
		try {
			VerificaValidade.verificaValidade(tipoPao, tipoPao.getTipoPao());
		} catch (AlgumItemEstaVencidoException e) {
			e.printStackTrace();
		}
		try {
			VerificaValidade.verificaValidade(recheioLanche, recheioLanche.getTipoRecheio());
		} catch (AlgumItemEstaVencidoException e) {
			e.printStackTrace();
		}
		try {
			VerificaValidade.verificaValidade(molho, molho.getTipoMolho());
		} catch (AlgumItemEstaVencidoException e) {
			e.printStackTrace();
		}
		this.tipoPao = tipoPao;
		this.recheioLanche = recheioLanche;
		this.molho = molho;
		this.dataValidade = CalculaDataValidade.geraDataValidade(1);
	}

	@Override
	public BigDecimal calculaPrecoPrato() {
		this.soma = this.tipoPao.getPrecoVenda()
				.add(this.recheioLanche.getPrecoVenda().add(this.molho.getPrecoVenda()));
		return this.soma;
	}

	@Override
	public double calculaPesoPrato() {
		double soma = (this.tipoPao.getPeso() + this.recheioLanche.getPeso() + this.molho.getPeso());
		return soma;
	}

	public String getDataValidade() {
		return dataValidade;
	}
	
	public LancheTipoPao getTipoPao() {
		return tipoPao;
	}

	public LancheRecheio getRecheioLanche() {
		return recheioLanche;
	}

	public LancheMolho getMolho() {
		return molho;
	}

	public BigDecimal getSoma() {
		return soma;
	}

}
