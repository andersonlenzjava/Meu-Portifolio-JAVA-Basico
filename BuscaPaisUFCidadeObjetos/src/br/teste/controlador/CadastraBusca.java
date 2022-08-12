package br.teste.controlador;

import br.teste.modelo.acao.CriacaoBuscaElementos;

public class CadastraBusca {

	public static void main(String[] args) {

		CriacaoBuscaElementos cre = new CriacaoBuscaElementos();

		cre.adicionaElementoCidade("New york", "Nova York", "NY", "Nordeste", "Estados Unidos", "EUA", "America");
		cre.adicionaElementoCidade("San Fransisco", "California", "CF", "Leste", "Estados Unidos", "EUA", "America");
		cre.adicionaElementoCidade("Los Angeles", "California", "CF", "Leste", "Estados Unidos", "EUA", "America");
		cre.adicionaElementoCidade("Oklahoma City", "Oklahoma", "OKA", "Centro", "Estados Unidos", "EUA", "America");
		cre.adicionaElementoCidade("Tulsa", "Oklahoma", "OKA", "Centro", "Estados Unidos", "EUA", "America");
		cre.adicionaElementoCidade("Lawton", "Oklahoma", "OKA", "Centro", "Estados Unidos", "EUA", "America");
		cre.adicionaElementoCidade("Chicago", "Illinois", "IL", "Norte", "Estados Unidos", "EUA", "America");

		cre.adicionaElementoCidade("Munique", "Baveria", "BVE", "Sul", "Alemanha", "ALE", "Europa");
		cre.adicionaElementoCidade("Augsburgo", "Baveria", "BVE", "Sul", "Alemanha", "ALE", "Europa");
		cre.adicionaElementoCidade("Hamburgo", "Schieswig", "SCH", "Norte", "Alemanha", "ALE", "Europa");
		cre.adicionaElementoCidade("Londres", "England", "EG", "Sul", "Inglatera", "ENG", "Europa");
		cre.adicionaElementoCidade("Bristol", "Wales", "WA", "Sul", "Inglatera", "ENG", "Europa");
		cre.adicionaElementoCidade("Antu�rpia", "Antwerpen", "ATP", "Norte", "Belgica", "BG", "Europa");
		cre.adicionaElementoCidade("Luxemburgo", "Luxemburgo", "LXB", "Sul", "Belgica", "BG", "Europa");
		
		cre.adicionaElementoCidade("Shenzhen", "Guangdong", "GDG", "Leste", "China", "CH", "Asia");
		cre.adicionaElementoCidade("Cant�o", "Guangdong", "GDG", "Leste", "China", "CH", "Asia");
		cre.adicionaElementoCidade("Pequim", "Hebei", "HBI", "Norte", "China", "CH", "Asia");
		cre.adicionaElementoCidade("Tangshan", "Hebei", "HBI", "Norte", "China", "CH", "Asia");
		cre.adicionaElementoCidade("T�quio", "Saitama", "STM", "Leste", "Jap�o", "JP", "Asia");
		cre.adicionaElementoCidade("Yokohama", "Saitama", "STM", "Leste", "Jap�o", "JP", "Asia");
		cre.adicionaElementoCidade("Fukuoka", "Kyushu", "KYS", "Oeste", "Jap�o", "JP", "Asia");
		cre.adicionaElementoCidade("Kumamoto", "Kyushu", "KYS", "Oeste", "Jap�o", "JP", "Asia");
		
		cre.adicionaElementoCidade("Missal", "Paran�", "PR", "Sul", "Brasil", "BRA", "America");
		cre.adicionaElementoCidade("Maringa", "Paran�", "PR", "Sul", "Brasil", "BRA", "America");
		cre.adicionaElementoCidade("S�o Paulo", "S�o Paulo", "SP", "Sudeste", "Brasil", "BRA", "America");
		cre.adicionaElementoCidade("Santos", "S�o Paulo", "SP", "Sudeste", "Brasil", "BRA", "America");
		cre.adicionaElementoCidade("Fortaleza", "Cear�", "CE", "Nordeste", "Brasil", "BRA", "America");
		cre.adicionaElementoCidade("Buenos Aires", "Santa f�", "SF", "Leste", "Argentina", "ARG", "America");
		cre.adicionaElementoCidade("Santa Rosa", "La Pampa", "LP", "Centro", "Argentina", "ARG", "America");
		cre.adicionaElementoCidade("Santa Rosa", "La Pampa", "LP", "Centro", "Argentina", "ARG", "America");
	
		System.out.println("c) Fazer um servi�o que retorne um Pa�s pela sua Sigla ");
		System.out.println();
		cre.retornaPaisSigla("BRA");
		cre.retornaPaisSigla("EUA");
		System.out.println("===================================================================");

		System.out.println("d) Fazer um servi�o que retorne as Unidades Federativas de um Pa�s ");
		System.out.println();
		cre.retornaUnidadeFederativaPais("Brasil");
		cre.retornaUnidadeFederativaPais("Estados Unidos");
		System.out.println("===================================================================");
		
		System.out.println("e) Fazer um servi�o que retorne as Cidades de um Estado");
		System.out.println();
		cre.retornaCidadesDoEstado("Paran�");
		cre.retornaCidadesDoEstado("S�o Paulo");
		System.out.println("===================================================================");
		
		System.out.println("f) Fazer um servi�o que retorne os Pa�ses de um Continente");
		System.out.println();
		cre.retornaPaisContinente("America");
		cre.retornaPaisContinente("Europa");
		System.out.println("===================================================================");
		
		System.out.println("g) Fazer um servi�o que retorne os Estados de um Pa�s e uma regi�o.");
		System.out.println();
		cre.retornaEstadosDoPaisERegiao("Brasil", "Sul");
		cre.retornaEstadosDoPaisERegiao("China", "Leste");
		System.out.println("===================================================================");
	}
}
