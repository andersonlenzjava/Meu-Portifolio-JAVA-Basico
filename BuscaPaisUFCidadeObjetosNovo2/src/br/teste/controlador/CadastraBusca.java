package br.teste.controlador;

import java.util.Set;

import br.teste.modelo.acao.BancoDados;
import br.teste.modelo.modelo.Cidade;
import br.teste.modelo.modelo.Pais;
import br.teste.modelo.modelo.UnidadeFederativa;

public class CadastraBusca {

	public static void main(String[] args) {

		BancoDados cre = new BancoDados();

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
		
//		Set<Cidade> cidades = cre.getListaCidades();
//		for (Cidade cidade : cidades) {
//			if (cidade.getUnidadeFederativa().getNomeUnidadeFederativa().equals("Paran�")) {
//				System.out.println(cidade.getNomeCidade());
//			}
//		}

//c) Fazer um servi�o que retorne um Pa�s pela sua Sigla 
		cre.retornaPaisPelaSigla("BRA");
		
		
//d) Fazer um servi�o que retorne as Unidades Federativas de um Pa�s 		
		Set<UnidadeFederativa> listaSelecionada = cre.getUnidadesFederativasPais("Brasil");
		for (UnidadeFederativa unidadeFederativa : listaSelecionada) {
			System.out.println(unidadeFederativa.getNomeUnidadeFederativa());
		}
		
//e) Fazer um servi�o que retorne as Cidades de um Estado 	
		Set<Cidade> liscaCidadesEstado = cre.getCidadesDoEstado("Paran�");
		for (Cidade cidade : liscaCidadesEstado) {
			System.out.println(cidade.getNomeCidade());
		}

		System.out.println("---------------------------");
//f) Fazer um servi�o que retorne os Pa�ses de um Continente
		Set<Pais> listaPaisContinente = cre.getPaisesContinente("America");
		for (Pais pais : listaPaisContinente) {
			System.out.println(pais.getNomePais());
		}
		System.out.println("---------------------------");
//g) Fazer um servi�o que retorne os Estados de um Pa�s e uma regi�o.	
		Set<UnidadeFederativa> listaEstados = cre.getUnidadeFederativa("Estados Unidos", "Oeste");
		for (UnidadeFederativa unidadeFederativa : listaEstados) {
			System.out.println(unidadeFederativa.getNomeUnidadeFederativa());
		}
		
	}
}
