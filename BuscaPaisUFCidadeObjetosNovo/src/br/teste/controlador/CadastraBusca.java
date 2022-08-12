package br.teste.controlador;

import java.util.Set;

import br.teste.modelo.acao.BancoDadosPopulaBusca;
import br.teste.modelo.modelo.Cidade;
import br.teste.modelo.modelo.Pais;
import br.teste.modelo.modelo.UnidadeFederativa;

public class CadastraBusca {

	public static void main(String[] args) {

		BancoDadosPopulaBusca cre = new BancoDadosPopulaBusca();

		cre.adicionaElementoCidade("New york", "Nova York", "NY", "Nordeste", "Estados Unidos", "EUA", "America");
		cre.adicionaElementoCidade("San Fransisco", "California", "CF", "Oeste", "Estados Unidos", "EUA", "America");
		cre.adicionaElementoCidade("Los Angeles", "California", "CF", "Oeste", "Estados Unidos", "EUA", "America");
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

		cre.adicionaElementoCidade("Missal", "Paraná", "PR", "Sul", "Brasil", "BRA", "America");
		cre.adicionaElementoCidade("Maringa", "Paraná", "PR", "Sul", "Brasil", "BRA", "America");
		cre.adicionaElementoCidade("São Paulo", "São Paulo", "SP", "Sudeste", "Brasil", "BRA", "America");
		cre.adicionaElementoCidade("Santos", "São Paulo", "SP", "Sudeste", "Brasil", "BRA", "America");
		cre.adicionaElementoCidade("Fortaleza", "Ceará", "CE", "Nordeste", "Brasil", "BRA", "America");
		cre.adicionaElementoCidade("Buenos Aires", "Santa fé", "SF", "Leste", "Argentina", "ARG", "America");
		cre.adicionaElementoCidade("Santa Rosa", "La Pampa", "LP", "Centro", "Argentina", "ARG", "America");
		cre.adicionaElementoCidade("Santa Rosa", "La Pampa", "LP", "Centro", "Argentina", "ARG", "America");

		System.out.println("---------------------------");
		System.out.println("c) Fazer um serviço que retorne um País pela sua Sigla");
		cre.retornaPaisPelaSigla("BRA");
		
		System.out.println("---------------------------");
		System.out.println("d) Fazer um serviço que retorne as Unidades Federativas de um País ");
		cre.getUnidadesFederativasPais("Brasil");
		
		System.out.println("---------------------------");
		System.out.println("e) Fazer um serviço que retorne as Cidades de um Estado");
		cre.getCidadesDoEstado("Paraná");

		System.out.println("---------------------------");
		System.out.println("f) Fazer um serviço que retorne os Países de um Continente");
		cre.getPaisesContinente("America");

		System.out.println("---------------------------");
		System.out.println("g) Fazer um serviço que retorne os Estados de um País e uma região.");
		cre.getUnidadeFederativa("Estados Unidos", "Oeste");
		
	}
}
