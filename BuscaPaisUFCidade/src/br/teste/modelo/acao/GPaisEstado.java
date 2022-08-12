package br.teste.modelo.acao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GPaisEstado {

	private Map<String, List<String>> paisEstado = new HashMap<String, List<String>>();

	public void relacaoPaisEstado(String pais, String estado) {
		if (!paisEstado.containsKey(pais)) {
			paisEstado.put(pais, new ArrayList<String>());
		}
		if (!(paisEstado.get(pais).contains(estado))) {
			paisEstado.get(pais).add(estado);
		}
	}

	public void retornaEstadosPais(String pais) {

		List<String> lista = paisEstado.get(pais);
		System.out.println(pais);
		System.out.println(lista);
	}
}
