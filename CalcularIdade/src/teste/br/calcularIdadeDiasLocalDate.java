package teste.br;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class calcularIdadeDiasLocalDate {

	public static void main(String[] args) {
	
		LocalDate hoje = LocalDate.now();
		String hojeFormatado = hoje.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(hojeFormatado);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String dataNascimento = "03-09-1992";

		try{
			Date d1 = sdf.parse(dataNascimento);
			Date d2 = sdf.parse(hojeFormatado);

			long diferencaDeTempoMilisegundos = d2.getTime() - d1.getTime();
			
			//o java é int por defaut  https://www.guj.com.br/t/sigla-l-no-java/42296/11
			long idadeEmDias = (diferencaDeTempoMilisegundos / (1000 * 60 * 60 * 24));//aqui nao ultrapassa o tamanho do int e dai nao perde
			//4 bits entra
			System.out.println("Idade em dias: " + idadeEmDias);
			
			long idadeEmAnos = (diferencaDeTempoMilisegundos / (1000l * 60 * 60 * 24 * 365));//aqui ultrapassa o valor do int e dai precisa converter em long
			//8 bits entra
			System.out.println("Idade em anos: " + idadeEmAnos);
			
		}catch(
		ParseException e)
		{
			e.printStackTrace();
		}

	}

}

