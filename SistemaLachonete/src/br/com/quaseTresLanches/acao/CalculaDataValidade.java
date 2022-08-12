package br.com.quaseTresLanches.acao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculaDataValidade {

	public static String geraDataValidade(int dias) {
		
		LocalDate dataAquiAgora = LocalDate.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data = dataAquiAgora.plusDays(dias);
		String DataHoje = data.format(formato);
//		System.out.println(DataHoje);
		
		return DataHoje;
	}
	
}
