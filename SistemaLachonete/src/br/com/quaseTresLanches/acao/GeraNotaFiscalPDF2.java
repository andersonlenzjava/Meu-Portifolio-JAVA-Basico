package br.com.quaseTresLanches.acao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.Set;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import br.com.quaseTresLanches.modelo.Pedido.Pedido;
import br.com.quaseTresLanches.modelo.lanches.Lanche;
import br.com.quaseTresLanches.modelo.lanches.Pizza;

public class GeraNotaFiscalPDF2 {

	public static void geraNotaFiscal (Pedido pedido) {

		try {
			int pedidoNumero = pedido.geraNumeroNotaFiscal();
			Document document = new Document( PageSize.A4, 50,50,50,50 );
			PdfWriter.getInstance(document, new FileOutputStream("relatórioPDF_n°"+ pedidoNumero +".pdf"));
			document.open();

			Font font = FontFactory.getFont(FontFactory.TIMES, 16, Font.NORMAL);
			Font font2 = FontFactory.getFont(FontFactory.TIMES, 12, Font.NORMAL);

			Paragraph p1 = new Paragraph("Nome cliente: " + pedido.getNomeCliente() + "  Nota Fiscal n°: " + pedidoNumero,font);
			p1.setSpacingAfter(10);
			p1.setFirstLineIndent(30);
			document.add(p1);
			
			document.add(new Paragraph("                 "));
			
			//VER SE TEM OUTRA FORMA DE EDITAR O PARAGRAFO, OU SE NAO RESUMIR OS ELEMENTOS E O QUE FAZER E TOCAR O BARCO
			
			
			
			
			//Metodo que gera um string dos pedidos e que cria paragrafos conforme precisa 
			Set<Pizza> pizzaList = pedido.getListaPizza();
			BigDecimal valorPizza = BigDecimal.ZERO;
			for (Pizza pizza : pizzaList) {
				String nomePizza = "";
				String pesoPizza = "";
				String dataValidadePizza = "";
				nomePizza = nomePizza + ". Borda: " + pizza.getBordaRecheada().getNome();
				nomePizza = nomePizza + ". Molho: " + pizza.getMolho().getTipoMolho();
				nomePizza = nomePizza + ". Recheio: " +pizza.getRecheio().getTipoRecheio();
				pesoPizza = String.valueOf(pizza.calculaPesoPrato());
				valorPizza = pizza.calculaPrecoPrato();
				dataValidadePizza = pizza.getDataValidade();
				
				document.add(new Paragraph("Composição Pizza: " + nomePizza + "." , font2));
				document.add( new Paragraph("Peso pizza (g): " + pesoPizza + ". Valor Pizza R$: " + valorPizza  + ".   Data validade: " + dataValidadePizza + "." ,font2));
				document.add(new Paragraph("                 "));
			}

			
			
			Set<Lanche> lancheList = pedido.getListaLanche();
			BigDecimal valorLanche = BigDecimal.ZERO;
			for (Lanche lanche : lancheList) {
				String nomeLanche = "";
				String pesoLanche = "";
				String dataValidadeLanche = "";
				nomeLanche = nomeLanche + ". Recheio: " + lanche.getRecheioLanche().getTipoRecheio();
				nomeLanche = nomeLanche + ". Molho: " + lanche.getMolho().getTipoMolho();
				nomeLanche = nomeLanche + ". Tipo Pão: " + lanche.getTipoPao().getTipoPao();
				pesoLanche = String.valueOf(lanche.calculaPesoPrato());
				valorLanche = lanche.calculaPrecoPrato();
				dataValidadeLanche = lanche.getDataValidade();
				
				document.add(new Paragraph("Composição Lanche: " + nomeLanche + "." , font2));
				document.add(new Paragraph("Peso lanche (g): " + pesoLanche + ". Valor lanche R$: " + valorLanche  + ". Data validade: " + dataValidadeLanche + "." ,font2));	
				document.add(new Paragraph("                 "));
			}
			
			BigDecimal total = pedido.getTotalServico();
			BigDecimal valorPago = pedido.getValorPago();
			BigDecimal troco = pedido.getTroco();
			
			Paragraph p6 = new Paragraph("total R$: " + total + ". Valor pago R$: " + valorPago + ". Troco R$: " + troco + "." , font2);
			p6.setSpacingAfter(12);
			p6.setFirstLineIndent(30);
			document.add(p6);
			
			document.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
