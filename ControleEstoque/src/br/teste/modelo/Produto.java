package br.teste.modelo;

import java.util.Objects;

public class Produto {

	public String nome;
	public Double codigoBarras;
	public Double quantidadeEstoque;
	
	public Produto(String nome, double codigoBarras, double quantidadeEstoque) {
		this.nome = nome;
		this.codigoBarras = codigoBarras;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoBarras);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(codigoBarras, other.codigoBarras);
	}
	
	
	
}
