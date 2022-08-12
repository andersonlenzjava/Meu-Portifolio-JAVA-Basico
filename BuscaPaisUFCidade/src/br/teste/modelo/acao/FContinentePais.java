package br.teste.modelo.acao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FContinentePais {

	private Map<String, List<String>> continentePais = new HashMap<String, List<String>>();

	public void relacaoContinentePais(String continente, String pais) {
		if (!continentePais.containsKey(continente)) {
			continentePais.put(continente, new ArrayList<String>());
		}
		if (!(continentePais.get(continente).contains(pais))) {
			continentePais.get(continente).add(pais);
		}
	}

	public void retornaPaisesDoContinente(String continente) {

		List<String> lista = continentePais.get(continente);
		System.out.println(continente);
		System.out.println(lista);
	}
}
