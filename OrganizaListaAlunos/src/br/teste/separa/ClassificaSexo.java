package br.teste.separa;

import java.util.ArrayList;
import java.util.Comparator;

public class ClassificaSexo {
	
	ArrayList<Aluno> masculino = new ArrayList<>();
	ArrayList<Aluno> feminino = new ArrayList<>();
	
	public void classificaSexo (Aluno aluno) {
		 if (aluno.getSexo() == 'M') {
			masculino.add(aluno);
		} else if (aluno.getSexo() == 'F') {
			feminino.add(aluno);
		} else {
			throw new NullPointerException("Sexo deve ser M ou F!");
		}
	}

	public void ordena () {
		masculino.sort(Comparator.comparing(Aluno::getNome));	
		feminino.sort(Comparator.comparing(Aluno::getNome));
	}
	
	public void ordenaContra () {
		masculino.sort(Comparator.comparing(Aluno::getNome).reversed());
		feminino.sort(Comparator.comparing(Aluno::getNome).reversed());
//		masculino.sort(Comparator.comparing(Aluno::getIdade));
//		feminino.sort(Comparator.comparing(Aluno::getIdade).reversed());
	}
	
	public void imprimeClasseSexo () {
		System.out.println("==========================");
		System.out.println("Lista de alunas: ");
		for (Aluno fem : feminino) {
			System.out.println(" Nome: " + fem.getNome() + " Data Nasc: " + fem.getDataNascimento() + 
					" Bairo: " + fem.getBairro() + " sexo: " + fem.getSexo() + " idade: " + fem.getIdade());
		}
		System.out.println("==========================");
		System.out.println("Lista de alunos: ");
		for (Aluno masc : masculino) {
			System.out.println(" Nome: " + masc.getNome() + " Data Nasc: " + masc.getDataNascimento() + 
					" Bairo: " + masc.getBairro() + " sexo: " + masc.getSexo()+ " idade: " + masc.getIdade());
		}
		
		
	}

}
