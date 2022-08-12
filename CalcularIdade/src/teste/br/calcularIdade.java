package teste.br;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class calcularIdade {

	public static void main(String[] args) {

		String data = "03/09/1992";

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate hoje = LocalDate.now();

		LocalDate dataNasci = LocalDate.parse(data, formato);

		Period periodo = Period.between(dataNasci, hoje);

		System.out.print("A idade é: " + periodo.getYears());
		
		System.out.print(" anos, " + periodo.getMonths());
		
		System.out.print(" meses, e " + periodo.getDays() + " dias!");
		
		System.out.println();
		
		System.out.println("A idade em meses é: " + periodo.toTotalMonths());
		
//===========================================================		
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("1992-09-03"), LocalDate.now());
		
		System.out.println("Idade em dias: " + dias);
			
	}

}
