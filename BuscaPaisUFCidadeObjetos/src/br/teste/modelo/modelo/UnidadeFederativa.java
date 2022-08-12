package br.teste.modelo.modelo;

import java.util.Objects;

public class UnidadeFederativa {

	private String nomeUnidadeFederativa;
	private String siglaUnidadeFederativa;
	private String regiaoPais;
	private String nomePais;
	
	public String getNomeUnidadeFederativa() {
		return nomeUnidadeFederativa;
	}

	public void setNomeUnidadeFederativa(String nomeUnidadeFederativa) {
		this.nomeUnidadeFederativa = nomeUnidadeFederativa;
	}

	public String getSiglaUnidadeFederativa() {
		return siglaUnidadeFederativa;
	}

	public void setSiglaUnidadeFederativa(String siglaUnidadeFederativa) {
		this.siglaUnidadeFederativa = siglaUnidadeFederativa;
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

	@Override
	public int hashCode() {
		return Objects.hash(nomePais, nomeUnidadeFederativa, regiaoPais, siglaUnidadeFederativa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnidadeFederativa other = (UnidadeFederativa) obj;
		return Objects.equals(nomePais, other.nomePais)
				&& Objects.equals(nomeUnidadeFederativa, other.nomeUnidadeFederativa)
				&& Objects.equals(regiaoPais, other.regiaoPais)
				&& Objects.equals(siglaUnidadeFederativa, other.siglaUnidadeFederativa);
	}

}
