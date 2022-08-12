package br.teste.modelo.acao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DPaisEstadoUFs {

	private Map<String, List<String>> paisEstadoUFs = new HashMap<String, List<String>>();

	public void relacaoPaisEstado(String pais, String estadoUF) {
		if (!paisEstadoUFs.containsKey(pais)) {
			paisEstadoUFs.put(pais, new ArrayList<String>());
		}
		if (!(paisEstadoUFs.get(pais).contains(estadoUF))) {
			paisEstadoUFs.get(pais).add(estadoUF);
		}
	}

	public void retornaUFsDeUmPais(String pais) {

		List<String> lista = paisEstadoUFs.get(pais);
		System.out.println(pais);
		System.out.println(lista);
	}
}
