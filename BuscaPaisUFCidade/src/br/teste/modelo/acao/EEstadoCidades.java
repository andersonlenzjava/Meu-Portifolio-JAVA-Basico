package br.teste.modelo.acao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EEstadoCidades {

	private Map<String, List<String>> estadoCidades = new HashMap<String, List<String>>();

	public void relacaoEstadoCidades(String estado, String cidade) {
		if (!estadoCidades.containsKey(estado)) {
			estadoCidades.put(estado, new ArrayList<String>());
		}
		if (!(estadoCidades.get(estado).contains(cidade))) {
			estadoCidades.get(estado).add(cidade);
		}
	}

	public void retornaCidadesDoEsta(String estado) {

		List<String> lista = estadoCidades.get(estado);
		System.out.println(estado);
		System.out.println(lista);
	}
}
