package br.teste.teste;

import br.teste.modelo.Gerente;

public class TestePrograma {

	public static void main(String[] args) {

		Gerente gerente1 = new Gerente("Ander", "3333333", 29, "34432", "34234234");
		
		System.out.println(gerente1.getFuncionario().getNome());
		
	}

}
