package br.teste.modelo.acao;

import java.util.Set;

import br.teste.modelo.modelo.Cidade;
import br.teste.modelo.modelo.Pais;
import br.teste.modelo.modelo.UnidadeFederativa;

public class CadastraBusca {

	public static void main(String[] args) {

		PopulaBuscaRepositorio cre = new PopulaBuscaRepositorio();

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

		System.out.println("---------------------------");
		System.out.println("c) Fazer um servi�o que retorne um Pa�s pela sua Sigla");
		Pais paisRetorno = cre.retornaPaisPelaSigla("BRA");
		System.out.println(paisRetorno.getNomePais());
		
		System.out.println("---------------------------");
		System.out.println("d) Fazer um servi�o que retorne as Unidades Federativas de um Pa�s ");
		Set<UnidadeFederativa> unidadesRetorno = cre.retornoUniadadesFederativasPais("Brasil");
		unidadesRetorno.forEach(unidadeRetorno -> System.out.println(unidadeRetorno.getNomeUnidadeFederativa()));
		
		System.out.println("---------------------------");
		System.out.println("e) Fazer um servi�o que retorne as Cidades de um Estado");
		Set<Cidade> cidadesRetorno = cre.retornaCidadesEstado("Paran�");
		cidadesRetorno.forEach(cidadeRetorno -> System.out.println(cidadeRetorno.getNomeCidade()));
		
		System.out.println("---------------------------");
		System.out.println("f) Fazer um servi�o que retorne os Pa�ses de um Continente");
		Set<Pais> paisesRetorno = cre.retornaPaisContinente("America");
		paisesRetorno.forEach(paisRetorno2 -> System.out.println(paisRetorno2.getNomePais()));
		
		System.out.println("---------------------------");
		System.out.println("g) Fazer um servi�o que retorne os Estados de um Pa�s e uma regi�o.");
		Set<UnidadeFederativa> unidadesRetorno2 = cre.retornaEstadosPaisRegiao("Estados Unidos", "Oeste");
		unidadesRetorno2.forEach(unidadeRetorno2 -> System.out.println(unidadeRetorno2.getNomeUnidadeFederativa()));
	}
}
