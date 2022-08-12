package br.com.quaseTresLanches.acao;

import java.util.HashSet;
import java.util.Set;

import br.com.quaseTresLaches.modelo.Itens.SalgadinhoMassa;
import br.com.quaseTresLaches.modelo.Itens.SalgadinhoRecheio;
import br.com.quaseTresLaches.modelo.Itens.SalgadinhoTipoPreparo;

public class RepositorioSalgadinho {

	Set<SalgadinhoRecheio> listaRecheios = new HashSet<>();
	Set<SalgadinhoMassa> listaMassas = new HashSet<>();
	Set<SalgadinhoTipoPreparo> tipoPreparo = new HashSet<>();

	public void adicionaRecheio(SalgadinhoRecheio salgadinhoRecheio) {
		this.listaRecheios.add(salgadinhoRecheio);
	}

	public void adicionaMassa(SalgadinhoMassa salgadinhoMassa) {
		this.listaMassas.add(salgadinhoMassa);
	}

	public void adicionaTipoPreparo(SalgadinhoTipoPreparo salgadinhoTipoPreparo) {
		this.tipoPreparo.add(salgadinhoTipoPreparo);
	}

}
