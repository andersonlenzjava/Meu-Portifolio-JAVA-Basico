package br.teste.modelo.acao;

import java.util.Set;

import br.teste.modelo.modelo.Cidade;
import br.teste.modelo.modelo.Pais;
import br.teste.modelo.modelo.UnidadeFederativa;

public class BancoDadosPopulaBusca {

	BancoDados bc = new BancoDados();

	public void adicionaElementoCidade(String nomeCidade, String nomeUnidadeFederativa, String siglaUnidadeFederativa,
			String regiaoPais, String nomePais, String siglaPais, String nomeContinente) {

		bc.adicionaPais(nomePais, siglaPais, nomeContinente);
		bc.adicionaUnidadeFederativa(nomeUnidadeFederativa, siglaUnidadeFederativa, regiaoPais, nomePais);
		bc.adicionaCidade(nomeCidade, siglaUnidadeFederativa, nomeUnidadeFederativa);

	}

// c) Fazer um servi�o que retorne um Pa�s pela sua Sigla
	public void retornaPaisPelaSigla(String nomeSigla) {
		System.out.println(bc.retornaPaisPelaSigla(nomeSigla));
	}

// d) Fazer um servi�o que retorne as Unidades Federativas de um Pa�s 	
	public void getUnidadesFederativasPais(String nomePais) {
		Set<UnidadeFederativa> listaSelecionada = bc.getUnidadesFederativasPais(nomePais);
		for (UnidadeFederativa unidadeFederativa : listaSelecionada) {
			System.out.println(unidadeFederativa.getNomeUnidadeFederativa());
		}
	}
	
// e) Fazer um servi�o que retorne as Cidades de um Estado
	public void getCidadesDoEstado(String nomeEstado) {
		Set<Cidade> liscaCidadesEstado = bc.getCidadesDoEstado(nomeEstado);
		for (Cidade cidade : liscaCidadesEstado) {
			System.out.println(cidade.getNomeCidade());
		}
	}

// f) Fazer um servi�o que retorne os Pa�ses de um Continente	
	public void getPaisesContinente(String nomeContinente) {
		Set<Pais> listaPaisContinente = bc.getPaisesContinente(nomeContinente);
		for (Pais pais : listaPaisContinente) {
			System.out.println(pais.getNomePais());
		}
	}

//g) Fazer um servi�o que retorne os Estados de um Pa�s e uma regi�o.	
	public void getUnidadeFederativa(String nomePais, String nomeRegiao) {
		Set<UnidadeFederativa> listaEstados = bc.getUnidadeFederativa(nomePais, nomeRegiao);
		for (UnidadeFederativa unidadeFederativa : listaEstados) {
			System.out.println(unidadeFederativa.getNomeUnidadeFederativa());
		}
		
	}
	
	

}
