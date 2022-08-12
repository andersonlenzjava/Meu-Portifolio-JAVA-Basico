package teste.br;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Clairton Luz
 */
public class calcularIdadesCronoUnit {

    
    public static void main(String[] args) {
        // Cria um Objeto LocalDate com a data atual.
        LocalDate hoje = LocalDate.now();
        
        // Cria um Objeto LocalDate com a data 26/09/2020.
//        LocalDate outraData = LocalDate.of(1992, Month.SEPTEMBER, 03);
   
        String data = "03/09/1992";
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate outraData = LocalDate.parse(data, formato);
        
        // Calcula a diferen�a de dias entre as duas datas
        long diferencaEmDias = ChronoUnit.DAYS.between(outraData, hoje);
        // Calcula a diferen�a de meses entre as duas datas
        long diferencaEmMes = ChronoUnit.MONTHS.between(outraData, hoje);
        // Calcula a diferen�a de anos entre as duas datas
    	// segundo menos o primeiro 
        long diferencaEmAnos = ChronoUnit.YEARS.between(outraData, hoje);
        
        // Exibe a diferen�a em dias entre as datas
        System.out.println("Diferen�a em dias entre " + hoje + " e " + outraData + " = " + diferencaEmDias);
        // Exibe a diferen�a em meses entre as datas
        System.out.println("Diferen�a em meses entre " + hoje + " e " + outraData + " = " + diferencaEmMes);
        // Exibe a diferen�a em anos entre as datas
        System.out.println("Diferen�a em anos entre " + hoje + " e " + outraData + " = " + diferencaEmAnos);
    }
    
}