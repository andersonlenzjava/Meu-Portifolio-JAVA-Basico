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
	RepositorioCidade repositórioCidade = new RepositorioCidade();

	public void adicionaElementoCidade(String nomeCidade, String nomeUnidadeFederativa, String siglaUnidadeFederativa,
			String regiaoPais, String nomePais, String siglaPais, String nomeContinente) {

		repositorioPais.adicionaPais(nomePais, siglaPais, nomeContinente);

		Set<Pais> paisRepositório = repositorioPais.getListaPais();
		Pais paisIterator = null;
		for (Pais pais : paisRepositório) {
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
		repositórioCidade.adicionaCidade(nomeCidade, unidadeFederativaIterator);
	}

// c) Fazer um serviço que retorne um País pela sua Sigla
	public Pais retornaPaisPelaSigla(String nomeSigla) {
		System.out.println("O nome do pais da sigla " + nomeSigla + " é: ");
		Set<Pais> paises = repositorioPais.getListaPais();
		Pais paisRetorno = null;
		for (Pais pais : paises) {
			if (pais.getSiglaPais().equals(nomeSigla)) {
				paisRetorno = pais;
			}
		}
		return paisRetorno;
	}
	
// d) Fazer um serviço que retorne as Unidades Federativas de um País 	
	public Set<UnidadeFederativa> retornoUniadadesFederativasPais(String nomePais){
		System.out.println("As unidades federativas do pais : " + nomePais + " são: ");
		Set<UnidadeFederativa> unidadesFederativas = repositorioUnidadeFederativa.getListaUnidadeFederativa();
		Set<UnidadeFederativa> unidadesFederativasRetorno = new HashSet<>();
 		for (UnidadeFederativa unidadeFederativa : unidadesFederativas) {
			if(unidadeFederativa.getPais().getNomePais().equals(nomePais)) {
				unidadesFederativasRetorno.add(unidadeFederativa);
			}
		}
		return unidadesFederativasRetorno;
	}
	
// e) Fazer um serviço que retorne as Cidades de um Estado
	public Set<Cidade> retornaCidadesEstado(String nomeEstado){
		System.out.println("As cidades do estado: " + nomeEstado + " são: ");
		Set<Cidade> cidadesEstado = repositórioCidade.getListaCidades();
		Set<Cidade> cidadesEstadoRetorno = new HashSet<>();
		for (Cidade cidade : cidadesEstado) {
			if(cidade.getUnidadeFederativa().getNomeUnidadeFederativa().equals(nomeEstado)) {
				cidadesEstadoRetorno.add(cidade);
			}
		}
		return cidadesEstadoRetorno;
	}
	
// f) Fazer um serviço que retorne os Países de um Continente
	public Set<Pais> retornaPaisContinente (String nomeContinente){
		System.out.println("Os paises do continente : " + nomeContinente + " são: ");
		Set<Pais> paisContinente = repositorioPais.getListaPais();
		Set<Pais> paisContinenteRetorno = new HashSet<>();
		for (Pais pais : paisContinente) {
			if(pais.getNomeContinente().equals(nomeContinente)) {
				paisContinenteRetorno.add(pais);
			}
		}
		return paisContinenteRetorno;
	}
	
//g) Fazer um serviço que retorne os Estados de um País e uma região
	public Set<UnidadeFederativa> retornaEstadosPaisRegiao (String nomePais, String nomeRegiao){
		System.out.println("Os estados do pais " + nomePais + " e da regiao " + nomeRegiao + " são: ");
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
