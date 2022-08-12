package br.teste.separa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassificaAlunoBairro {

	private Map<String, List<Aluno>> bairroAluno = new HashMap<String, List<Aluno>>();

	public void classificaBairro(Aluno aluno) {
		if (!bairroAluno.containsKey(aluno.getBairro())) {
			bairroAluno.put(aluno.getBairro(), new ArrayList<Aluno>());
		}
		bairroAluno.get(aluno.getBairro()).add(aluno);
	}

	public void imprimeAlunosBairro() {
		System.out.println("Organização por Bairro");
		for (String key : bairroAluno.keySet()) {

			List<Aluno> lista = bairroAluno.get(key);
			System.out.println(key);
			System.out.println(lista);
		}
	}

	public void imprimeAlunosBairroNome() {
		System.out.println("==========================");
		System.out.println("Organização por Bairro");
		System.out.println("==========================");
//		for (List<Aluno> a : bairroAluno.values()) {
//			System.out.println(a.toString());
//		}
//		System.out.println("==========================");

		for (String key : bairroAluno.keySet()) {
			System.out.print(key + ": ");
			for (Aluno aluno : bairroAluno.get(key)) {
				System.out.print(aluno.getNome() + ". ");
			}
			System.out.println();
		}
	}
}