package br.teste.repositorio;

import java.util.HashSet;
import java.util.Set;

import br.teste.modelo.modelo.Pais;
import br.teste.modelo.modelo.UnidadeFederativa;

public class RepositorioUnidadeFederativa {

	private Set<UnidadeFederativa> listaUnidadeFederativa = new HashSet<>();
	
	public void adicionaUnidadeFederativa(String nomeUnidadeFederativa, String siglaUnidadeFederativa,
			String regiaoPais, Pais paisIterator) {

		UnidadeFederativa unidadeFederativa = new UnidadeFederativa();
		unidadeFederativa.setNomeUnidadeFederativa(nomeUnidadeFederativa);
		unidadeFederativa.setSiglaUnidadeFederativa(siglaUnidadeFederativa);
		unidadeFederativa.setRegiaoPais(regiaoPais);
		unidadeFederativa.setPais(paisIterator);

		if (!(listaUnidadeFederativa.contains(unidadeFederativa))) {
			listaUnidadeFederativa.add(unidadeFederativa);
		}
	}

	public Set<UnidadeFederativa> getListaUnidadeFederativa() {
		return listaUnidadeFederativa;
	}
	
}
