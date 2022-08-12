package br.teste.controlador;

public class adicionaBuscaElementosLocalizacao {

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
		cre.adicionaElementoCidade("Antuérpia", "Antwerpen", "ATP", "Norte", "Belgica", "BG", "Europa");
		cre.adicionaElementoCidade("Luxemburgo", "Luxemburgo", "LXB", "Sul", "Belgica", "BG", "Europa");
		
		cre.adicionaElementoCidade("Shenzhen", "Guangdong", "GDG", "Leste", "China", "CH", "Asia");
		cre.adicionaElementoCidade("Cantão", "Guangdong", "GDG", "Leste", "China", "CH", "Asia");
		cre.adicionaElementoCidade("Pequim", "Hebei", "HBI", "Norte", "China", "CH", "Asia");
		cre.adicionaElementoCidade("Tangshan", "Hebei", "HBI", "Norte", "China", "CH", "Asia");
		cre.adicionaElementoCidade("Tóquio", "Saitama", "STM", "Leste", "Japão", "JP", "Asia");
		cre.adicionaElementoCidade("Yokohama", "Saitama", "STM", "Leste", "Japão", "JP", "Asia");
		cre.adicionaElementoCidade("Fukuoka", "Kyushu", "KYS", "Oeste", "Japão", "JP", "Asia");
		cre.adicionaElementoCidade("Kumamoto", "Kyushu", "KYS", "Oeste", "Japão", "JP", "Asia");
		
		cre.adicionaElementoCidade("Missal", "Paraná", "PR", "Sul", "Brasil", "BR", "America");
		cre.adicionaElementoCidade("Maringa", "Paraná", "PR", "Sul", "Brasil", "BR", "America");
		cre.adicionaElementoCidade("São Paulo", "São Paulo", "SP", "Sudeste", "Brasil", "BR", "America");
		cre.adicionaElementoCidade("Santos", "São Paulo", "SP", "Sudeste", "Brasil", "BR", "America");
		cre.adicionaElementoCidade("Fortaleza", "Ceará", "CE", "Nordeste", "Brasil", "BR", "America");
		cre.adicionaElementoCidade("Buenos Aires", "Santa fé", "SF", "Leste", "Argentina", "ARG", "America");
		cre.adicionaElementoCidade("Santa Rosa", "La Pampa", "LP", "Centro", "Argentina", "ARG", "America");
		cre.adicionaElementoCidade("Santa Rosa", "La Pampa", "LP", "Centro", "Argentina", "ARG", "America");
		
		System.out.println("===========================");
		System.out.println("C) Retorno do pais pela sigla");
		cre.retornaPaisSiglaC("BR");
		cre.retornaPaisSiglaC("EUA");
		cre.retornaPaisSiglaC("ALE");
		cre.retornaPaisSiglaC("ENG");
		System.out.println("===========================");
		
		System.out.println("D) Retorno as unidades federativas de um pais");
		cre.retornaUFdeUmPaisD("Estados Unidos");
		cre.retornaUFdeUmPaisD("China");
		System.out.println("===========================");	
		
		System.out.println("E) Retorno das cidades de um estado");
		cre.retornaCidadesEstadoE("Paraná");
		cre.retornaCidadesEstadoE("California");
		System.out.println("===========================");
		
		System.out.println("F) Retorno dos paises de um continente");
		cre.retornaPaisesDeUmContinenteF("Asia");
		cre.retornaPaisesDeUmContinenteF("America");
		System.out.println("===========================");
		
		System.out.println("G1) Retorno dos estados de um pais");
		cre.retornaEstadosDeUmPaisG("Estados Unidos");
		cre.retornaEstadosDeUmPaisG("China");
		System.out.println("===========================");
		
		System.out.println("G2) Retorno dos estados de uma regiao");
		cre.retornaEstadosDeUmaRegiaoG("Norte");
		cre.retornaEstadosDeUmPaisG("Leste");
		System.out.println("===========================");
	}

}
