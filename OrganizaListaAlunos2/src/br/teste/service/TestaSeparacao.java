package br.teste.service;

import java.util.ArrayList;

import br.teste.separa.Aluno;
import br.teste.separa.Classifica;
import br.teste.separa.ClassificaAlunoBairro;

public class TestaSeparacao {

	public static void main(String[] args) {

		ArrayList<Aluno> aluno = new ArrayList<>();

		Aluno a1 = new Aluno("Joel", "03/03/1993", "Interlagos", 'M', 44);
		Aluno a2 = new Aluno("Maria", "13/04/1963", "Jardim horizonte", 'F', 55);
		Aluno a3 = new Aluno("Fatima", "22/10/1996", "Ponte azul", 'F', 44);
		Aluno a4 = new Aluno("Kico", "01/07/1991", "Interlagos", 'M', 55);
		Aluno a5 = new Aluno("Marlos", "13/04/1963", "Ponte azul", 'M', 66);
		Aluno a6 = new Aluno("Alberta", "29/11/1944", "Tropical", 'F', 22);
		Aluno a7 = new Aluno("Alex", "13/04/1969", "Estadio", 'M', 77);
		Aluno a8 = new Aluno("Alexa", "13/04/1980", "Jardim horizonte", 'F', 99);
		Aluno a9 = new Aluno("Alexa", "13/04/1980", "Jardim horizonte", 'F', 99);
		
		aluno.add(a1);
		aluno.add(a2);
		aluno.add(a3);
		aluno.add(a4);
		aluno.add(a5);
		aluno.add(a6);
		aluno.add(a7);
		aluno.add(a8);
		
		System.out.println(a8.equals(a9));
		
		Classifica classi = new Classifica();

		for (Aluno a : aluno) {
			classi.classifica(a);
		}
		classi.ordenaContra();
		classi.imprime();

		ClassificaAlunoBairro clasBairo = new ClassificaAlunoBairro();
		
		for (Aluno a : aluno) {
			clasBairo.matricula(a);
		}
	
//		clasBairo.retornaAlunosBairro();
		clasBairo.retornaAlunosBairro2();
		
	}

}
