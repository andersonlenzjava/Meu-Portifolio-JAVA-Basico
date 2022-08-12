package br.teste.modelo.modelo;

import java.util.Objects;

public class Cidade {

	private String nomeCidade;
	UnidadeFederativa unidadeFederativa;
	
	public String getNomeCidade() {
		return nomeCidade;
	}
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	public UnidadeFederativa getUnidadeFederativa() {
		return unidadeFederativa;
	}
	public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
		this.unidadeFederativa = unidadeFederativa;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nomeCidade, unidadeFederativa);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		return Objects.equals(nomeCidade, other.nomeCidade)
				&& Objects.equals(unidadeFederativa, other.unidadeFederativa);
	}
	
}
