package br.teste.modelo.acao;

import java.util.HashSet;
import java.util.Set;

import br.teste.modelo.modelo.Cidade;
import br.teste.modelo.modelo.Pais;
import br.teste.modelo.modelo.UnidadeFederativa;
import br.teste.repositorio.RepositorioCidade;
import br.teste.repositorio.RepositorioPais;
import br.teste.repositorio.RepositorioUnidadeFederativa;

public class PopulaBuscaRepositorio {

	RepositorioPais repositorioPais = new RepositorioPais();
	RepositorioUnidadeFederativa repositorioUnidadeFederativa = new RepositorioUnidadeFederativa();
	RepositorioCidade reposit�rioCidade = new RepositorioCidade();

	public void adicionaElementoCidade(String nomeCidade, String nomeUnidadeFederativa, String siglaUnidadeFederativa,
			String regiaoPais, String nomePais, String siglaPais, String nomeContinente) {

		repositorioPais.adicionaPais(nomePais, siglaPais, nomeContinente);

		Set<Pais> paisReposit�rio = repositorioPais.getListaPais();
		Pais paisIterator = null;
		for (Pais pais : paisReposit�rio) {
			if (pais.getNomePais().equals(nomePais)) {
				paisIterator = pais;
			}
		}
		repositorioUnidadeFederativa.adicionaUnidadeFederativa(nomeUnidadeFederativa, siglaUnidadeFederativa,
				regiaoPais, paisIterator);

		Set<UnidadeFederativa> unidadeFederativaRepositorio = repositorioUnidadeFederativa.getListaUnidadeFederativa();
		UnidadeFederativa unidadeFederativaIterator = null;
		for (UnidadeFederativa unidadeFederativa : unidadeFederativaRepositorio) {
			if (unidadeFederativa.getNomeUnidadeFederativa().equals(nomeUnidadeFederativa)) {
				unidadeFederativaIterator = unidadeFederativa;
			}
		}
		reposit�rioCidade.adicionaCidade(nomeCidade, unidadeFederativaIterator);
	}

// c) Fazer um servi�o que retorne um Pa�s pela sua Sigla
	public Pais retornaPaisPelaSigla(String nomeSigla) {
		System.out.println("O nome do pais da sigla " + nomeSigla + " �: ");
		Set<Pais> paises = repositorioPais.getListaPais();
		Pais paisRetorno = null;
		for (Pais pais : paises) {
			if (pais.getSiglaPais().equals(nomeSigla)) {
				paisRetorno = pais;
			}
		}
		return paisRetorno;
	}
	
// d) Fazer um servi�o que retorne as Unidades Federativas de um Pa�s 	
	public Set<UnidadeFederativa> retornoUniadadesFederativasPais(String nomePais){
		System.out.println("As unidades federativas do pais : " + nomePais + " s�o: ");
		Set<UnidadeFederativa> unidadesFederativas = repositorioUnidadeFederativa.getListaUnidadeFederativa();
		Set<UnidadeFederativa> unidadesFederativasRetorno = new HashSet<>();
 		for (UnidadeFederativa unidadeFederativa : unidadesFederativas) {
			if(unidadeFederativa.getPais().getNomePais().equals(nomePais)) {
				unidadesFederativasRetorno.add(unidadeFederativa);
			}
		}
		return unidadesFederativasRetorno;
	}
	
// e) Fazer um servi�o que retorne as Cidades de um Estado
	public Set<Cidade> retornaCidadesEstado(String nomeEstado){
		System.out.println("As cidades do estado: " + nomeEstado + " s�o: ");
		Set<Cidade> cidadesEstado = reposit�rioCidade.getListaCidades();
		Set<Cidade> cidadesEstadoRetorno = new HashSet<>();
		for (Cidade cidade : cidadesEstado) {
			if(cidade.getUnidadeFederativa().getNomeUnidadeFederativa().equals(nomeEstado)) {
				cidadesEstadoRetorno.add(cidade);
			}
		}
		return cidadesEstadoRetorno;
	}
	
// f) Fazer um servi�o que retorne os Pa�ses de um Continente
	public Set<Pais> retornaPaisContinente (String nomeContinente){
		System.out.println("Os paises do continente : " + nomeContinente + " s�o: ");
		Set<Pais> paisContinente = repositorioPais.getListaPais();
		Set<Pais> paisContinenteRetorno = new HashSet<>();
		for (Pais pais : paisContinente) {
			if(pais.getNomeContinente().equals(nomeContinente)) {
				paisContinenteRetorno.add(pais);
			}
		}
		return paisContinenteRetorno;
	}
	
//g) Fazer um servi�o que retorne os Estados de um Pa�s e uma regi�o
	public Set<UnidadeFederativa> retornaEstadosPaisRegiao (String nomePais, String nomeRegiao){
		System.out.println("Os estados do pais " + nomePais + " e da regiao " + nomeRegiao + " s�o: ");
		Set<UnidadeFederativa> unidadesPaisRegiao = repositorioUnidadeFederativa.getListaUnidadeFederativa();
		Set<UnidadeFederativa> unidadesPaisRegiaoRetorno = new HashSet<>();
		for (UnidadeFederativa unidadeFederativa : unidadesPaisRegiao) {
			if((unidadeFederativa.getPais().getNomePais().equals(nomePais))
					&&(unidadeFederativa.getRegiaoPais().equals(nomeRegiao))) {
				unidadesPaisRegiaoRetorno.add(unidadeFederativa);
			}
		}
		return unidadesPaisRegiaoRetorno;
	}
	
}
