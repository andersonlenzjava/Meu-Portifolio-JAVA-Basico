package br.com.quaseTresLanches.acao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import br.com.quaseTresLaches.modelo.Itens.Item;

public class VerificaValidade {

	public static void verificaValidade(Item item, String nome) throws AlgumItemEstaVencidoException {
		String dataHoje = "19/05/2020";
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataHojeF = LocalDate.parse(dataHoje, formato);
		LocalDate dataValidadeItem = LocalDate.parse(item.getDataValidade(), formato);

		long diferencaEmDias = ChronoUnit.DAYS.between(dataValidadeItem, dataHojeF);

		if (diferencaEmDias > 4 && diferencaEmDias < 11) {
			// produto esta para vencer
			System.out.println("O produto " + nome + " esta para vencer." );
		} else if (diferencaEmDias >= 4) {
			System.out.println("O produto " + nome + " está vencido a " + diferencaEmDias + " dias.");
			// produto vencido
			throw new AlgumItemEstaVencidoException("O item " + nome + " está vencido! A " + diferencaEmDias + " dias!");
		}
	}
}
