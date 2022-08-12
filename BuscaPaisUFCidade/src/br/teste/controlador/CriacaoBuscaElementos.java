package br.teste.controlador;

import java.util.Collection;
import java.util.HashSet;

import br.teste.modelo.ElementoCidade;
import br.teste.modelo.acao.CSiglaPais;
import br.teste.modelo.acao.DPaisEstadoUFs;
import br.teste.modelo.acao.EEstadoCidades;
import br.teste.modelo.acao.FContinentePais;
import br.teste.modelo.acao.GPaisEstado;
import br.teste.modelo.acao.GRegiaoEstado;

public class CriacaoBuscaElementos {

	Collection<ElementoCidade> listElementosCidade = new HashSet<>();

	CSiglaPais sp = new CSiglaPais();
	DPaisEstadoUFs peUf = new DPaisEstadoUFs();
	EEstadoCidades ec = new EEstadoCidades();
	FContinentePais cp = new FContinentePais();
	GPaisEstado pe = new GPaisEstado();
	GRegiaoEstado re = new GRegiaoEstado();
	
	public void adicionaElementoCidade(String nomeCidade, String nomeUnidadeFederativa, String siglaUF,
			String regiaoPais, String nomePais, String siglaPais, String continente) {

		ElementoCidade eCidade = new ElementoCidade(nomeCidade, nomeUnidadeFederativa, siglaUF, regiaoPais, nomePais,
				siglaPais, continente);
		if (!(listElementosCidade.contains(eCidade))) {
			listElementosCidade.add(eCidade);
			
			sp.relacaoSiglaPais(siglaPais, nomePais);
			peUf.relacaoPaisEstado(nomePais, siglaUF);
			ec.relacaoEstadoCidades(nomeUnidadeFederativa, nomeCidade);
			cp.relacaoContinentePais(continente, nomePais);
			pe.relacaoPaisEstado(nomePais, nomeUnidadeFederativa);
			re.relacaoPaisEstado(regiaoPais, nomeUnidadeFederativa);

		} else {
			System.out.println("Cidade já existente!");
		}
	}
	
	public void retornaPaisSiglaC(String siglaPais) {
		sp.retornaPaisSigla(siglaPais);
	}

	public void retornaUFdeUmPaisD(String pais) {
		peUf.retornaUFsDeUmPais(pais);
	}

	public void retornaCidadesEstadoE(String estado) {
		ec.retornaCidadesDoEsta(estado);
	}

	public void retornaPaisesDeUmContinenteF(String continente) {
		cp.retornaPaisesDoContinente(continente);
	}

	public void retornaEstadosDeUmPaisG(String pais) {
		pe.retornaEstadosPais(pais);
	}

	public void retornaEstadosDeUmaRegiaoG(String regiao) {
		re.retornaEstadosRegiao(regiao);
	}
	
	public Collection<ElementoCidade> getListElementosCidade() {
		return listElementosCidade;
	}
}
