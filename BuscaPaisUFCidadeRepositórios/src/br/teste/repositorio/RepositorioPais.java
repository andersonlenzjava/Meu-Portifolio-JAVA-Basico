package br.teste.repositorio;

import java.util.HashSet;
import java.util.Set;

import br.teste.modelo.modelo.Pais;

public class RepositorioPais {

	private Set<Pais> listaPais = new HashSet<>();
	
	public void adicionaPais(String nomePais, String siglaPais, String nomeContinente) {

		Pais pais = new Pais();
		pais.setNomePais(nomePais);
		pais.setSiglaPais(siglaPais);
		pais.setNomeContinente(nomeContinente);

		if (!(listaPais.contains(pais))) {
			listaPais.add(pais);
		}
	}

	public Set<Pais> getListaPais() {
		return listaPais;
	}
	
}
