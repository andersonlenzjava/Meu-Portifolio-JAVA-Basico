package br.teste.service;

import br.teste.modelo.EstoqueIsuficienteException;
import br.teste.modelo.OperacoesProduto;
import br.teste.modelo.Produto;
import br.teste.modelo.ProdutoNaoCadastradoException;

public class TestaOperacoes {

	public static void main(String[] args) {

		OperacoesProduto operacao = new OperacoesProduto();

		operacao.adicionaProduto(new Produto("Suco Laranja", 123123, 1000));
		operacao.adicionaProduto(new Produto("Suco Uva", 234234, 1000));
		operacao.adicionaProduto(new Produto("Suco Manga", 345345, 1000));
		operacao.adicionaProduto(new Produto("Suco Mang", 345345, 1000));

//====================================================================================	
		System.out.println("==========================");
		System.out.println("TESTE SAQUE MENOR DEPOSITO");

		try {
			operacao.compraProduto(123123, 100);
		} catch (ProdutoNaoCadastradoException e) {
			e.printStackTrace();
		} catch (EstoqueIsuficienteException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Sistema continua operando");
		}

//====================================================================================			

		System.out.println("==========================");
		System.out.println("TESTE SAQUE MAIOR DEPOSITO");

		try {
			operacao.compraProduto(123123, 1100);
		} catch (ProdutoNaoCadastradoException e) {
			e.printStackTrace();
		} catch (EstoqueIsuficienteException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Sistema continua operando");
		}
//====================================================================================			

		System.out.println("==========================");
		System.out.println("TESTE PRODUTO INESISTENTE E SAQUE MENOR DEPOSITO");

		try {
			operacao.compraProduto(123120, 100);
		} catch (ProdutoNaoCadastradoException e) {
			e.printStackTrace();
		} catch (EstoqueIsuficienteException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Sistema continua operando");
		}
// ====================================================================================
		
		System.out.println("==========================");
		System.out.println("TESTE PRODUTO INESISTENTE E SAQUE MAIOR DEPOSITO");

		try {
			operacao.compraProduto(123120, 1100);
		} catch (ProdutoNaoCadastradoException e) {
			e.printStackTrace();
		} catch (EstoqueIsuficienteException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Sistema continua operando");
		}

	}
}
