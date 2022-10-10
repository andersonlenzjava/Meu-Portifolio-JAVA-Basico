package br.com.quaseTresLanches.modelo.lanches;

import java.math.BigDecimal;

import br.com.quaseTresLaches.modelo.Itens.PizzaBorda;
import br.com.quaseTresLaches.modelo.Itens.PizzaMolho;
import br.com.quaseTresLaches.modelo.Itens.PizzaRecheio;
import br.com.quaseTresLanches.acao.AlgumItemEstaVencidoException;
import br.com.quaseTresLanches.acao.CalculaDataValidade;
import br.com.quaseTresLanches.acao.VerificaValidade;

public class Pizza implements CalculosPrato {

	PizzaRecheio recheio;
	PizzaMolho molho;
	PizzaBorda bordaRecheada;
	BigDecimal soma = BigDecimal.ZERO;
	String dataValidade;

	public Pizza(PizzaRecheio recheio, PizzaMolho molho, PizzaBorda bordaRecheada) {
		try {
			VerificaValidade.verificaValidade(recheio, recheio.getTipoRecheio());
		} catch (AlgumItemEstaVencidoException e) {
			System.out.println("o item " + recheio + " está vencido!");
			e.printStackTrace();
		}
		try {
			VerificaValidade.verificaValidade(molho, molho.getTipoMolho());
		} catch (AlgumItemEstaVencidoException e) {
			System.out.println("o item " + molho + " está vencido!");
			e.printStackTrace();
		}
		try {
			VerificaValidade.verificaValidade(bordaRecheada, bordaRecheada.getNome());
		} catch (AlgumItemEstaVencidoException e) {
			System.out.println("o item " + bordaRecheada + " está vencido!");
			e.printStackTrace();
		}
		this.recheio = recheio;
		this.molho = molho;
		this.bordaRecheada = bordaRecheada;
		this.dataValidade = CalculaDataValidade.geraDataValidade(4);
	}

	@Override
	public BigDecimal calculaPrecoPrato() {
		this.soma = this.recheio.getPrecoVenda()
				.add(this.molho.getPrecoVenda().add(this.bordaRecheada.getPrecoVenda()));
		return this.soma;
	}

	@Override
	public double calculaPesoPrato() {
		double soma = (this.recheio.getPeso() + this.molho.getPeso() + this.bordaRecheada.getPeso());
		return soma;
	}

	public String getDataValidade() {
		return dataValidade;
	}
	
	public PizzaRecheio getRecheio() {
		return recheio;
	}

	public PizzaMolho getMolho() {
		return molho;
	}
	
	public PizzaBorda getBordaRecheada() {
		return bordaRecheada;
	}

}
