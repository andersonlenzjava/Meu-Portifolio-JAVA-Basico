package teste.br;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class calcularIdadePeriod {

	public static void main(String[] args) {

		String data = "03/09/1992";
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataNasci = LocalDate.parse(data, formato);

		LocalDate dataHoje = LocalDate.now();

		Period diff = Period.between(dataNasci, dataHoje);

		System.out.print("Difference " + "between two dates is: ");

		System.out.printf("%d years, %d months" + " and %d days ", diff.getYears(), diff.getMonths(), diff.getDays());
	}
}
