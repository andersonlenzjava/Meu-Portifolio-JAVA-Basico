package br.teste.separa;

import java.util.ArrayList;

public class Classifica {

	ArrayList<Aluno> aluno = new ArrayList<>();

	public void matricula(Aluno a) {
		if (!aluno.contains(a)) {
			aluno.add(a);
		} else {
			System.out.println("ALUNO JÁ EXISTE");
		}
	}

	public void organizaPorSexo() {
		ClassificaSexo clasSexo = new ClassificaSexo();
		for (Aluno a : aluno) {
			clasSexo.classificaSexo(a);
		}
		clasSexo.ordenaContra();
		clasSexo.imprimeOrganizacaoSexo();
	}

	public void organizaPorBairro() {
		ClassificaAlunoBairro clasBairo = new ClassificaAlunoBairro();
		for (Aluno a : aluno) {
			clasBairo.classificaBairro(a);
		}
		clasBairo.imprimeAlunosBairroNome();
	}

	public void organizaPorMes() {
		ClassificaAlunoMes clasMes = new ClassificaAlunoMes();
		for (Aluno a : aluno) {
			clasMes.classificaMes(a);
		}
		clasMes.imprimeAlunosMesNome();
	}
}
