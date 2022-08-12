package br.teste.modelo.acao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GRegiaoEstado {

	private Map<String, List<String>> regiaoEstado = new HashMap<String, List<String>>();

	public void relacaoPaisEstado(String regiao, String estado) {
		if (!regiaoEstado.containsKey(regiao)) {
			regiaoEstado.put(regiao, new ArrayList<String>());
		}
		if (!(regiaoEstado.get(regiao)).contains(estado)) {
			regiaoEstado.get(regiao).add(estado);
		}
	}

	public void retornaEstadosRegiao(String regiao) {

		List<String> lista = regiaoEstado.get(regiao);
		System.out.println(regiao);
		System.out.println(lista);
	}
}
