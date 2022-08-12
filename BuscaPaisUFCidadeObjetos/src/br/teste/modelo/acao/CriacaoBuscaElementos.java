package br.teste.modelo.acao;

import java.util.HashSet;
import java.util.Set;

import br.teste.modelo.modelo.Cidade;
import br.teste.modelo.modelo.Pais;
import br.teste.modelo.modelo.UnidadeFederativa;

public class CriacaoBuscaElementos {

	private Set<Cidade> listaCidades = new HashSet<>();
	private Set<Pais> listaPais = new HashSet<>();
	private Set<UnidadeFederativa> listaUnidadeFederativa = new HashSet<>();

	private Set<String> continentes = new HashSet<>();

	public void adicionaElementoCidade(String nomeCidade, String nomeUnidadeFederativa, String siglaUnidadeFederativa,
			String regiaoPais, String nomePais, String siglaPais, String nomeContinente) {

		Cidade cidade = new Cidade();
		cidade.setNomeCidade(nomeCidade);
		cidade.setNomeEstado(nomeUnidadeFederativa);
		listaCidades.add(cidade);

		UnidadeFederativa unidadeFederativa = new UnidadeFederativa();
		unidadeFederativa.setNomeUnidadeFederativa(nomeUnidadeFederativa);
		unidadeFederativa.setSiglaUnidadeFederativa(siglaUnidadeFederativa);
		unidadeFederativa.setRegiaoPais(regiaoPais);
		unidadeFederativa.setNomePais(nomePais);
		listaUnidadeFederativa.add(unidadeFederativa);

		Pais pais = new Pais();
		pais.setNomePais(nomePais);
		pais.setSiglaPais(siglaPais);
		pais.setNomeContinente(nomeContinente);
		listaPais.add(pais);
		
		continentes.add(nomeContinente);
	}

//c) serviço que retorna um pais pela sua sigla 

	public void retornaPaisSigla(String sigla) {

		for (Pais pais : listaPais) {
			if (pais.getSiglaPais().equals(sigla)) {
				System.out.println("A sigla " + sigla + " percente ao pais: " + pais.getNomePais());
			}
		}

	}
//================================================	

//d) Fazer um serviço que retorne as Unidades Federativas de um País 

	public void retornaUnidadeFederativaPais(String nomePais) {
		System.out.print("As unidades federativas do " + nomePais + " são: ");
		for (UnidadeFederativa unidadeFederativa : listaUnidadeFederativa) {
			if (unidadeFederativa.getNomePais().equals(nomePais)) {
				System.out.print(unidadeFederativa.getNomeUnidadeFederativa() + " - "
						+ unidadeFederativa.getSiglaUnidadeFederativa() + ". ");
			}
		}
		System.out.println();
	}

//==============================================

// e) serviço que retorna as cidades de um estado 

	public void retornaCidadesDoEstado(String estado) {

		System.out.print("O estado " + estado + " contém as seguintes cidades: ");
		for (Cidade cidade : listaCidades) {
			if (cidade.getNomeEstado().equals(estado)) {
				System.out.print(cidade.getNomeCidade() + ". ");
			}
		}
		System.out.println();
	}

//=============================================================================

//f) Fazer um serviço que retorne os Países de um Continente 

	public void retornaPaisContinente(String continente) {

		for (String continenteSaida : continentes) {
			if (continenteSaida.equals(continente)) {
				System.out.print("O continente: " + continenteSaida + " contém os seguintes paises: ");
				for (Pais paisSaida : listaPais) {
					if (paisSaida.getNomeContinente().equals(continente)) {
						System.out.print(paisSaida.getNomePais() + ". ");
					}
				}
			}
		}
		System.out.println();
	}
//=========================================================================	

//g) Fazer um serviço que retorne os Estados de um País e uma região.	

	public void retornaEstadosDoPaisERegiao(String pais, String regiao) {
		System.out.print("Os estados do pais: " + pais + " na regiao: " + regiao + " são: ");
		for (UnidadeFederativa unidadeFederativa : listaUnidadeFederativa) {
			if (unidadeFederativa.getRegiaoPais().equals(regiao) && (unidadeFederativa.getNomePais().equals(pais))) {
				System.out.print(unidadeFederativa.getNomeUnidadeFederativa() + ". ");
			}
		}
		System.out.println();
	}
}