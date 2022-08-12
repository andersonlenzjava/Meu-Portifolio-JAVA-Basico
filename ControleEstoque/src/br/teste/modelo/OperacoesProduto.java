package br.teste.modelo;

import java.util.HashMap;
import java.util.Map;

public class OperacoesProduto {

	private Map<Double, Produto> produtos = new HashMap<>();

	public void adicionaProduto(Produto produto) {
		if (!produtos.containsKey(produto.codigoBarras)) {
			produtos.put(produto.codigoBarras, produto);
		} else {
			System.out.println("Produto já existente");
		}
	}

	public void compraProduto(double codigoBarras, double quantidadeCompra) throws EstoqueIsuficienteException, ProdutoNaoCadastradoException {
		if (produtos.containsKey(codigoBarras)) {
			if (produtos.get(codigoBarras).quantidadeEstoque >= quantidadeCompra) {
				System.out.println("Estoque antes: " + produtos.get(codigoBarras).quantidadeEstoque);
				this.produtos.get(codigoBarras).quantidadeEstoque -= quantidadeCompra;
				System.out.println("Estoque depois: " + produtos.get(codigoBarras).quantidadeEstoque);
			} else {
				throw new EstoqueIsuficienteException("Estoque: " + produtos.get(codigoBarras).quantidadeEstoque + ", Qtd. compra: " + quantidadeCompra);
			}
		}else throw new ProdutoNaoCadastradoException("Produto não cadastrado");
	}
}
