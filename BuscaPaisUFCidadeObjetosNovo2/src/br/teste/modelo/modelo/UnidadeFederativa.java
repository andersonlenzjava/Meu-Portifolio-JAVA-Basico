package br.teste.modelo.modelo;

import java.util.Objects;

public class UnidadeFederativa {

	private String nomeUnidadeFederativa;
	private String siglaUnidadeFederativa;
	private String regiaoPais;
	Pais pais;
	
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

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeUnidadeFederativa, pais, regiaoPais, siglaUnidadeFederativa);
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
		return Objects.equals(nomeUnidadeFederativa, other.nomeUnidadeFederativa) && Objects.equals(pais, other.pais)
				&& Objects.equals(regiaoPais, other.regiaoPais)
				&& Objects.equals(siglaUnidadeFederativa, other.siglaUnidadeFederativa);
	}
	
}
