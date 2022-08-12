package br.com.alura.tdd;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class CalculadoraSimplesTest {

	@Test
	public void deveriaSomarDoisNumerosPositos () {
		CalculadoraSimples calc = new CalculadoraSimples();
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(10, soma);
	}
	
}
