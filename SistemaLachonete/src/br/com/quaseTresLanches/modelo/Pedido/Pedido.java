package br.com.quaseTresLanches.modelo.Pedido;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import br.com.quaseTresLanches.modelo.lanches.Lanche;
import br.com.quaseTresLanches.modelo.lanches.Pizza;
import br.com.quaseTresLanches.modelo.lanches.Salgadinho;

public class Pedido {

	public Set<Lanche> listaLanche = new HashSet<>();
	public Set<Pizza> listaPizza = new HashSet<>();
	public Set<Salgadinho> listaSalgadinho = new HashSet<>();
	public String nomeCliente;
	public BigDecimal totalServico = BigDecimal.ZERO;
	public BigDecimal troco = BigDecimal.ZERO;
	private BigDecimal valorPago;

	public Pedido (String nomeCliete) {
		this.nomeCliente = nomeCliete;
	}
	
	public void adicionaPizza(Pizza pizza) {
		this.listaPizza.add(pizza);
	}

	public void adicionaSalgadinho(Salgadinho salgadinho) {
		
		this.listaSalgadinho.add(salgadinho);
	}

	public void adicionaLanche(Lanche lanche) {
		this.listaLanche.add(lanche);
	}

	public BigDecimal calculaTaxaServico() {
		if (!(this.listaLanche.isEmpty())) {
			this.listaLanche.forEach(lanche -> this.totalServico = this.totalServico.add(lanche.calculaPrecoPrato()));
		}
		if (!(this.listaPizza.isEmpty())) {
			this.listaPizza.forEach(pizza -> this.totalServico = this.totalServico.add(pizza.calculaPrecoPrato()));
		}
		if (!(this.listaSalgadinho.isEmpty())) {
			this.listaSalgadinho.forEach(salgadinho -> this.totalServico.add(salgadinho.calculaPrecoPrato()));
		}
		System.out.println(this.totalServico);
		return this.totalServico;
	}

	public BigDecimal calcularTroco(BigDecimal valorPago) {
		this.valorPago = valorPago;
		if (this.totalServico.compareTo(valorPago) == 1) {
			System.out.println("O valor pago R$: " + valorPago + " é menor que o total do serviço R$: " + this.totalServico);
			this.troco = BigDecimal.ZERO;
		} else if (this.totalServico.compareTo(valorPago) == 0) {
			this.troco = BigDecimal.ZERO;
		} else if (this.totalServico.compareTo(valorPago) == -1) {
			this.troco = valorPago.subtract(this.totalServico);
		}
		System.out.println(troco);
		return this.troco;
	}
	
	public int geraNumeroNotaFiscal() {
		Random gerar = new Random();
		int retorno = Math.abs(gerar.nextInt());
		return retorno;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public Set<Lanche> getListaLanche() {
		return listaLanche;
	}

	public Set<Pizza> getListaPizza() {
		return listaPizza;
	}

	public Set<Salgadinho> getListaSalgadinho() {
		return listaSalgadinho;
	}

	public BigDecimal getTotalServico() {
		return totalServico;
	}

	public BigDecimal getTroco() {
		return troco;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

}
