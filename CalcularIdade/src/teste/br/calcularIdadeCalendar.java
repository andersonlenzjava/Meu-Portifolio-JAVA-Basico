package teste.br;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class calcularIdadeCalendar {

	public static void main(String[] args) {
		
		
		//define datas
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(2015, 1, 1);
		Calendar hoje = Calendar.getInstance();

		//calcula diferença
		int meses = (hoje.get(Calendar.YEAR) * 12 + hoje.get(Calendar.MONTH))
		        - (dataNascimento.get(Calendar.YEAR) * 12 + dataNascimento.get(Calendar.MONTH));
		
		System.out.println(meses);
		

	}
	
}
