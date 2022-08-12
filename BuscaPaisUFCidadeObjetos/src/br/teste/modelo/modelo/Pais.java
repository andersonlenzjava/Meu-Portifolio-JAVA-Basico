package br.teste.modelo.modelo;

import java.util.Objects;

public class Pais {

	private String nomePais;
	private String siglaPais;
	private String nomeContinente;
	
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

	public String getNomeContinente() {
		return nomeContinente;
	}

	public void setNomeContinente(String nomeContinente) {
		this.nomeContinente = nomeContinente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeContinente, nomePais, siglaPais);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return Objects.equals(nomeContinente, other.nomeContinente) && Objects.equals(nomePais, other.nomePais)
				&& Objects.equals(siglaPais, other.siglaPais);
	}

}
