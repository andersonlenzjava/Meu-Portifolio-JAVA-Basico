package br.teste.modelo.acao;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import br.teste.modelo.modelo.Cidade;
import br.teste.modelo.modelo.Pais;
import br.teste.modelo.modelo.UnidadeFederativa;

public class BancoDados {

	private Set<Cidade> listaCidades = new HashSet<>();
	private Set<Pais> listaPais = new HashSet<>();
	private Set<UnidadeFederativa> listaUnidadeFederativa = new HashSet<>();

	public void adicionaPais(String nomePais, String siglaPais, String nomeContinente) {

		Pais pais = new Pais();
		pais.setNomePais(nomePais);
		pais.setSiglaPais(siglaPais);
		pais.setNomeContinente(nomeContinente);

		if (!(listaPais.contains(pais))) {
			listaPais.add(pais);
		}
	}

	public void adicionaUnidadeFederativa(String nomeUnidadeFederativa, String siglaUnidadeFederativa,
			String regiaoPais, String nomePais) {

		UnidadeFederativa unidadeFederativa = new UnidadeFederativa();
		unidadeFederativa.setNomeUnidadeFederativa(nomeUnidadeFederativa);
		unidadeFederativa.setSiglaUnidadeFederativa(siglaUnidadeFederativa);
		unidadeFederativa.setRegiaoPais(regiaoPais);
		for (Pais paisIterator : listaPais) {
			if (paisIterator.getNomePais().equals(nomePais)) {
				unidadeFederativa.setPais(paisIterator);
			}
		}

		if (!(listaUnidadeFederativa.contains(unidadeFederativa))) {
			listaUnidadeFederativa.add(unidadeFederativa);
		}
	}

	public void adicionaCidade(String nomeCidade, String unidadeFederativa, String nomeUnidadeFederativa) {

		Cidade cidade = new Cidade();
		cidade.setNomeCidade(nomeCidade);

		for (UnidadeFederativa unidadeFedderativaInterator : listaUnidadeFederativa) {
			if (unidadeFedderativaInterator.getNomeUnidadeFederativa().equals(nomeUnidadeFederativa)) {
				cidade.setUnidadeFederativa(unidadeFedderativaInterator);
			}
		}
		if (!(listaCidades.contains(cidade))) {
			listaCidades.add(cidade);
		}
	}

//Retorna as listas 	
	public Set<Cidade> getListaCidades() {
		return listaCidades;
	}

	public Set<Pais> getListaPais() {
		return listaPais;
	}

	public Set<UnidadeFederativa> getListaUnidadeFederativa() {
		return listaUnidadeFederativa;
	}

// c) Fazer um serviço que retorne um País pela sua Sigla 
	public String retornaPaisPelaSigla(String sigla) {
		String retorno = null;
		for (Pais pais : listaPais) {
			if (pais.getSiglaPais().equals(sigla)) {
//				System.out.println(pais.getNomePais());
				retorno = pais.getNomePais();
			}
		}
		return retorno;
	}

// d) Fazer um serviço que retorne as Unidades Federativas de um País 
	public Set<UnidadeFederativa> getUnidadesFederativasPais(String nomePais){
		Set<UnidadeFederativa> listaUnidadesFederativasPais = listaUnidadeFederativa
				.stream()
				.filter(unidadeFederativa -> unidadeFederativa.getPais().getNomePais().equals(nomePais))
				.collect(Collectors.toSet());
		return listaUnidadesFederativasPais;
	}
	
//	public Set<UnidadeFederativa> getUnidadesFederativasPais(String nomePais) {
//		Set<UnidadeFederativa> listaUnidadesFederativasPais = new HashSet<>();
//		for (UnidadeFederativa unidadeFederativa : listaUnidadeFederativa) {
//			if (unidadeFederativa.getPais().getNomePais().equals(nomePais)) {
//				listaUnidadesFederativasPais.add(unidadeFederativa);
//			}
//		}
//		return listaUnidadesFederativasPais;
//	}

// e) Fazer um serviço que retorne as Cidades de um Estado 	
	public Set<Cidade> getCidadesDoEstado(String nomeEstado) {
		Set<Cidade> listaCidadesEstado = new HashSet<>();
		for (Cidade cidade : listaCidades) {
			if (cidade.getUnidadeFederativa().getNomeUnidadeFederativa().equals(nomeEstado)) {
				listaCidadesEstado.add(cidade);
			}
		}
		return listaCidadesEstado;
	}

//f) Fazer um serviço que retorne os Países de um Continente
	public Set<Pais> getPaisesContinente(String nomeContinente) {
		Set<Pais> listaPaisesContinente = new HashSet<>();
		for (Pais pais : listaPais) {
			if (pais.getNomeContinente().equals(nomeContinente)) {
				listaPaisesContinente.add(pais);
			}
		}
		return listaPaisesContinente;
	}

//g) Fazer um serviço que retorne os Estados de um País e uma região.	
	public Set<UnidadeFederativa> getUnidadeFederativa(String nomePais, String nomeRegiao) {
		Set<UnidadeFederativa> listaUnidadeFederativaSelecionada = new HashSet<>();
		for (UnidadeFederativa unidadeFederativa : listaUnidadeFederativa) {
			if ((unidadeFederativa.getPais().getNomePais().equals(nomePais))
					&& (unidadeFederativa.getRegiaoPais().equals(nomeRegiao))) {
				listaUnidadeFederativaSelecionada.add(unidadeFederativa);
			}
		}
		return listaUnidadeFederativaSelecionada;
	}

}
