package br.com.quaseTresLaches.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.quaseTresLaches.modelo.Itens.LancheMolho;
import br.com.quaseTresLaches.modelo.Itens.LancheRecheio;
import br.com.quaseTresLaches.modelo.Itens.LancheTipoPao;
import br.com.quaseTresLaches.modelo.Itens.PizzaBorda;
import br.com.quaseTresLaches.modelo.Itens.PizzaMolho;
import br.com.quaseTresLaches.modelo.Itens.PizzaRecheio;
import br.com.quaseTresLaches.modelo.Itens.SalgadinhoMassa;
import br.com.quaseTresLaches.modelo.Itens.SalgadinhoRecheio;
import br.com.quaseTresLaches.modelo.Itens.SalgadinhoTipoPreparo;
import br.com.quaseTresLanches.acao.AlgumItemEstaVencidoException;
import br.com.quaseTresLanches.acao.GeraNotaFiscalPDF;
import br.com.quaseTresLanches.acao.GeraNotaFiscalPDF2;
import br.com.quaseTresLanches.modelo.Pedido.Pedido;
import br.com.quaseTresLanches.modelo.lanches.Lanche;
import br.com.quaseTresLanches.modelo.lanches.Pizza;

public class Controller {

	public static void main(String[] args) throws AlgumItemEstaVencidoException {

//		cadastro dos produtos (cria referencias do repositório)

		LancheMolho curry = new LancheMolho("10/04/2020", 120.0, new BigDecimal ("3.5"), "Curry");
		LancheMolho catupiry = new LancheMolho("10/04/2020", 135.0, new BigDecimal("4.0"), "Catupiry");
		LancheMolho barbecue = new LancheMolho("11/04/2020", 145, new BigDecimal("5.0"), "Barbecue");
		LancheRecheio recheioFrango = new LancheRecheio("10/03/2020", 140.5, new BigDecimal("10.50"), "recheioFrango");
		LancheRecheio recheioAngus = new LancheRecheio("10/03/2020", 180.0, new BigDecimal("18.50"), "recheioAngus");
		LancheRecheio recheioCostela = new LancheRecheio("10/03/2020", 200.5, new BigDecimal("15.50"), "recheioCostela");
		LancheTipoPao manteiga = new LancheTipoPao("12/04/2020", 110, new BigDecimal("4.5"), "manteiga");
		LancheTipoPao leite = new LancheTipoPao("13/04/2020", 100, new BigDecimal("3.5"), "leite");
		LancheTipoPao agua = new LancheTipoPao("13/04/2020", 90, new BigDecimal("2.5"), "leite");
		
		PizzaBorda tem = new PizzaBorda("13/04/2050", 510, new BigDecimal("8.0"), true);
		PizzaBorda naoTem = new PizzaBorda("13/04/2050", 0, new BigDecimal("0.0"), false);
		PizzaMolho tomate = new PizzaMolho("20/07/2020", 210, new BigDecimal("6.0"), "tomate");
		PizzaMolho queijo = new PizzaMolho("22/05/2020", 300, new BigDecimal("12.0"), "queijo");
		PizzaRecheio portuguesa = new PizzaRecheio("20/05/2020", 500, new BigDecimal("14.0"), "portuguesa");
		PizzaRecheio quatroQueijos	= new PizzaRecheio("19/06/2020", 550, new BigDecimal("13.0"), "quatroQueijos");
		PizzaRecheio calabresa = new PizzaRecheio("18/06/2020", 440, new BigDecimal("10.0"), "calabresa");
		
		SalgadinhoMassa mandioca = new SalgadinhoMassa("22/05/2020", 120, new BigDecimal("2.3"), "mandioca");
		SalgadinhoMassa trigo = new SalgadinhoMassa("22/06/2020", 104, new BigDecimal("1.8"), "trigo");
		SalgadinhoMassa pastel = new SalgadinhoMassa("22/04/2020", 115, new BigDecimal("2.0"), "pastel");
		SalgadinhoRecheio frango = new SalgadinhoRecheio("11/04/2020", 140, new BigDecimal("3.0"), "frango");
		SalgadinhoRecheio carne = new SalgadinhoRecheio("18/03/2020", 180, new BigDecimal("4.0"), "carne");
		SalgadinhoRecheio queijoPrato = new SalgadinhoRecheio("11/05/2020", 103, new BigDecimal("3.8"), "queijoPrato");
		SalgadinhoTipoPreparo assado = new SalgadinhoTipoPreparo("13/04/2050", 0, null, "Assado");
		SalgadinhoTipoPreparo frito = new SalgadinhoTipoPreparo("13/04/2050", 0, null, "Frito");
		
		Pedido pedido1 = new Pedido("Anderson Lenz");
		Pizza p1 = new Pizza(calabresa, tomate, tem);
		Pizza p2 = new Pizza(calabresa, tomate, naoTem);
		Lanche l1 = new Lanche(leite, recheioFrango, catupiry);
		pedido1.adicionaPizza(p1);
		pedido1.adicionaPizza(p2);
		pedido1.adicionaLanche(l1);
		pedido1.calculaTaxaServico();
		pedido1.calcularTroco(new BigDecimal("50.0"));
		GeraNotaFiscalPDF2.geraNotaFiscal(pedido1);
	
	}
}
