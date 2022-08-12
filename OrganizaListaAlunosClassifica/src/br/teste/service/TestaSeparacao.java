package br.teste.service;

import br.teste.separa.Aluno;
import br.teste.separa.Classifica;

public class TestaSeparacao {

	public static void main(String[] args) {

		Classifica classifica = new Classifica();

		classifica.matricula(new Aluno("Joel", "03/03/1993", "Interlagos", 'M'));
		classifica.matricula(new Aluno("Maria", "13/04/1963", "Jardim horizonte", 'F'));
		classifica.matricula(new Aluno("Fatima", "22/10/1996", "Ponte azul", 'F'));
		classifica.matricula(new Aluno("Kico", "01/07/1991", "Interlagos", 'M'));
		classifica.matricula(new Aluno("Marlos", "13/04/1963", "Ponte azul", 'M'));
		classifica.matricula(new Aluno("Alberta", "29/11/1944", "Tropical", 'F'));
		classifica.matricula(new Aluno("Alex", "13/04/1969", "Estadio", 'M'));
		classifica.matricula(new Aluno("Alexa", "13/12/1980", "Jardim horizonte", 'F'));
		classifica.matricula(new Aluno("Alexa", "13/12/1980", "Jardim horizonte", 'F'));
		
		classifica.organizaPorBairro();
		classifica.organizaPorMes();
		classifica.organizaPorSexo();
	}

}
