package br.teste.service;

import java.util.ArrayList;

import br.teste.separa.Aluno;
import br.teste.separa.ClassificaSexo;
import br.teste.separa.ClassificaAlunoBairro;
import br.teste.separa.ClassificaAlunoMes;

public class TestaSeparacao {

	public static void main(String[] args) {

		ArrayList<Aluno> aluno = new ArrayList<>();

		Aluno a1 = new Aluno("Joel", "03/03/1993", "Interlagos", 'M');
		Aluno a2 = new Aluno("Maria", "13/04/1963", "Jardim horizonte", 'F');
		Aluno a3 = new Aluno("Fatima", "22/10/1996", "Ponte azul", 'F');
		Aluno a4 = new Aluno("Kico", "01/07/1991", "Interlagos", 'M');
		Aluno a5 = new Aluno("Marlos", "13/04/1963", "Ponte azul", 'M');
		Aluno a6 = new Aluno("Alberta", "29/11/1944", "Tropical", 'F');
		Aluno a7 = new Aluno("Alex", "13/04/1969", "Estadio", 'M');
		Aluno a8 = new Aluno("Alexa", "13/04/1980", "Jardim horizonte", 'F');
//		Aluno a9 = new Aluno("Alexa", "13/04/1980", "Jardim horizonte", 'F');

		aluno.add(a1);
		aluno.add(a2);
		aluno.add(a3);
		aluno.add(a4);
		aluno.add(a5);
		aluno.add(a6);
		aluno.add(a7);
		aluno.add(a8);

//		System.out.println(a8.equals(a9));

		ClassificaSexo clasSexo = new ClassificaSexo();
		ClassificaAlunoBairro clasBairo = new ClassificaAlunoBairro();
		ClassificaAlunoMes clasMes = new ClassificaAlunoMes();

		for (Aluno a : aluno) {
			clasSexo.classificaSexo(a);
			clasBairo.matricula(a);
			clasMes.matricula(a);
		}

//		clasSexo.ordenaContra();
//		clasSexo.imprimeClasseSexo();
//
//		clasBairo.imprimeAlunosBairro();
//		clasBairo.ImprimeAlunosBairroNome();

		clasMes.imprimeAlunosMes();
		clasMes.imprimeAlunosMesNome();

	}

}
