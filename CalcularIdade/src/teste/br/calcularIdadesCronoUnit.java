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
        
        // Calcula a diferença de dias entre as duas datas
        long diferencaEmDias = ChronoUnit.DAYS.between(outraData, hoje);
        // Calcula a diferença de meses entre as duas datas
        long diferencaEmMes = ChronoUnit.MONTHS.between(outraData, hoje);
        // Calcula a diferença de anos entre as duas datas
    	// segundo menos o primeiro 
        long diferencaEmAnos = ChronoUnit.YEARS.between(outraData, hoje);
        
        // Exibe a diferença em dias entre as datas
        System.out.println("Diferença em dias entre " + hoje + " e " + outraData + " = " + diferencaEmDias);
        // Exibe a diferença em meses entre as datas
        System.out.println("Diferença em meses entre " + hoje + " e " + outraData + " = " + diferencaEmMes);
        // Exibe a diferença em anos entre as datas
        System.out.println("Diferença em anos entre " + hoje + " e " + outraData + " = " + diferencaEmAnos);
    }
    
}