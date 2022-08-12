package br.com.quaseTresLanches.acao;

import java.util.HashSet;
import java.util.Set;

import br.com.quaseTresLaches.modelo.Itens.PizzaBorda;
import br.com.quaseTresLaches.modelo.Itens.PizzaMolho;
import br.com.quaseTresLaches.modelo.Itens.PizzaRecheio;

public class RepositorioPizza {

	Set<PizzaRecheio> listaRecheios = new HashSet<>();
	Set<PizzaMolho> listaMolhos = new HashSet<>();
	Set<PizzaBorda> listaBorda = new HashSet<>();

	public void adicionaRecheio(PizzaRecheio pizzaRecheio) {
		this.listaRecheios.add(pizzaRecheio);
	}

	public void adicionaMolho(PizzaMolho pizzaMolho) {
		this.listaMolhos.add(pizzaMolho);
	}

	public void adicionaBorda(PizzaBorda pizzaBorda) {
		this.listaBorda.add(pizzaBorda);
	}

}
