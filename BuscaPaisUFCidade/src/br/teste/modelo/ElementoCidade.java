package br.teste.modelo;

import java.util.Objects;

public class ElementoCidade {

	String nomeCidade;
	String nomeUnidadeFederativa;
	String siglaUF;
	String regiaoPais;
	String nomePais;
	String siglaPais;
	String continente;
	
	public ElementoCidade(String nomeCidade, String nomeUnidadeFederativa, String siglaUF, String regiaoPais,
			String nomePais, String siglaPais, String continente) {
		super();
		this.nomeCidade = nomeCidade;
		this.nomeUnidadeFederativa = nomeUnidadeFederativa;
		this.siglaUF = siglaUF;
		this.regiaoPais = regiaoPais;
		this.nomePais = nomePais;
		this.siglaPais = siglaPais;
		this.continente = continente;
	}
	public String getNomeCidade() {
		return nomeCidade;
	}
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	public String getNomeUnidadeFederativa() {
		return nomeUnidadeFederativa;
	}
	public void setNomeUnidadeFederativa(String nomeUnidadeFederativa) {
		this.nomeUnidadeFederativa = nomeUnidadeFederativa;
	}
	public String getSiglaUF() {
		return siglaUF;
	}
	public void setSiglaUF(String siglaUF) {
		this.siglaUF = siglaUF;
	}
	public String getRegiaoPais() {
		return regiaoPais;
	}
	public void setRegiaoPais(String regiaoPais) {
		this.regiaoPais = regiaoPais;
	}
	public String getNomePais() {
		return nomePais;
	}
	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}
	public String getSiglaPais() {
		return siglaPais;
	}
	public void setSiglaPais(String siglaPais) {
		this.siglaPais = siglaPais;
	}
	public String getContinente() {
		return continente;
	}
	public void setContinente(String continente) {
		this.continente = continente;
	}
	@Override
	public int hashCode() {
		return Objects.hash(continente, nomeCidade, nomePais, nomeUnidadeFederativa, regiaoPais, siglaPais, siglaUF);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElementoCidade other = (ElementoCidade) obj;
		return Objects.equals(continente, other.continente) && Objects.equals(nomeCidade, other.nomeCidade)
				&& Objects.equals(nomePais, other.nomePais)
				&& Objects.equals(nomeUnidadeFederativa, other.nomeUnidadeFederativa)
				&& Objects.equals(regiaoPais, other.regiaoPais) && Objects.equals(siglaPais, other.siglaPais)
				&& Objects.equals(siglaUF, other.siglaUF);
	}
	
	

}
