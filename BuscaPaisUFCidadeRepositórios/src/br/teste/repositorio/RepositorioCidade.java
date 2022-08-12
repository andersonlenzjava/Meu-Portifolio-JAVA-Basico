package br.teste.repositorio;

import java.util.HashSet;
import java.util.Set;

import br.teste.modelo.modelo.Cidade;
import br.teste.modelo.modelo.UnidadeFederativa;

public class RepositorioCidade {

	private Set<Cidade> listaCidades = new HashSet<>();
	
	public void adicionaCidade(String nomeCidade, UnidadeFederativa unidadeFederativaIterator) {

		Cidade cidade = new Cidade();
		cidade.setNomeCidade(nomeCidade);
		cidade.setUnidadeFederativa(unidadeFederativaIterator);

		if (!(listaCidades.contains(cidade))) {
			listaCidades.add(cidade);
		}
	}

	public Set<Cidade> getListaCidades() {
		return listaCidades;
	}

}
