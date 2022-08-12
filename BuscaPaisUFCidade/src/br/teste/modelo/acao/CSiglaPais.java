package br.teste.modelo.acao;

import java.util.HashMap;
import java.util.Map;

public class CSiglaPais {

	private Map<String, String> paisSigla = new HashMap<>();

	public void relacaoSiglaPais(String sigla, String pais) {
		if (!paisSigla.containsKey(sigla)) {
			paisSigla.put(sigla, pais);
		} else {
//			System.out.println("Pais ja contém sigla");
		}
	}

	public void retornaPaisSigla(String siglaPais) {

		String pais = paisSigla.get(siglaPais);
		System.out.println(pais);
	}
}
