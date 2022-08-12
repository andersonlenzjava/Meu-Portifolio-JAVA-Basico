package br.teste.modelo.modelo;

import java.util.Objects;

public class Cidade {

	private String nomeCidade;
	private String nomeEstado;
	
	public String getNomeCidade() {
		return nomeCidade;
	}
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	
	public String getNomeEstado() {
		return nomeEstado;
	}
	
	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nomeCidade, nomeEstado);
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
		return Objects.equals(nomeCidade, other.nomeCidade) && Objects.equals(nomeEstado, other.nomeEstado);
	}
	
}
