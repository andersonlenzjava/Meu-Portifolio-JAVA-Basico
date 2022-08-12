package br.com.quaseTresLanches.acao;

import java.util.HashSet;
import java.util.Set;

import br.com.quaseTresLaches.modelo.Itens.LancheMolho;
import br.com.quaseTresLaches.modelo.Itens.LancheRecheio;
import br.com.quaseTresLaches.modelo.Itens.LancheTipoPao;

public class RepositorioLanche {

	Set<LancheRecheio> listaRecheios = new HashSet<>();
	Set<LancheMolho> listaMolhos = new HashSet<>();
	Set<LancheTipoPao> listaTipoPao = new HashSet<>();

	public void adicionaRecheio(LancheRecheio lancheRecheio) {
		this.listaRecheios.add(lancheRecheio);
	}

	public void adicionaMolho(LancheMolho lancheMolho) {
		this.listaMolhos.add(lancheMolho);
	}

	public void adicionaTipoPao(LancheTipoPao lancheTipoPao) {
		this.listaTipoPao.add(lancheTipoPao);
	}
}
