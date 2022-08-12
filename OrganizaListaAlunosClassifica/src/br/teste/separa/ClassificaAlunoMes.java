package br.teste.separa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassificaAlunoMes {

	private Map<Integer, List<Aluno>> mesAluno = new HashMap<>();
	
	public void classificaMes(Aluno aluno) {
		Integer mes = Integer.valueOf(aluno.getDataNascimento().getMonthValue());
		if (!mesAluno.containsKey(mes)) {
			mesAluno.put(mes, new ArrayList<Aluno>());
		}
		mesAluno.get(mes).add(aluno);
	}

	public void imprimeAlunosMes() {
		System.out.println("Organização por Mes");
		NomeMes mes = new NomeMes();
		for (Integer key : mesAluno.keySet()) {
			
			List<Aluno> lista = mesAluno.get(key);
			System.out.println(key + " - " + mes.retornaNomeMes(key));
			System.out.println(lista);
		}
	}
	
	public void imprimeAlunosMesNome() {
		System.out.println("==========================");
		System.out.println("Organização por Mes");
		System.out.println("==========================");
		NomeMes mes = new NomeMes();
		for (Integer key : mesAluno.keySet()) {
			System.out.print("Mes: " + key + " - " + mes.retornaNomeMes(key) + ": ");
			for (Aluno a : mesAluno.get(key)) {
				System.out.print(a.getNome() + ". ");
			}
			System.out.println();
		}	
	}
	
}
