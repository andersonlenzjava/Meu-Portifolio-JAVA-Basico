package teste.br;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class calcularIdadeDias {

	public static void main(String[] args) {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

		String dataNascimento = "03-09-1992 12:10:20";

		String dataDeHoje = "07-07-2022 06:30:50";

		try{
			Date d1 = sdf.parse(dataNascimento);
			Date d2 = sdf.parse(dataDeHoje);

			long diferencaDeTempoMilisegundos = d2.getTime() - d1.getTime();
			
			long idadeEmDias = (diferencaDeTempoMilisegundos / (1000 * 60 * 60 * 24));
			
			System.out.println(idadeEmDias);
		}catch(
		ParseException e)
		{
			e.printStackTrace();
		}

	}

}

