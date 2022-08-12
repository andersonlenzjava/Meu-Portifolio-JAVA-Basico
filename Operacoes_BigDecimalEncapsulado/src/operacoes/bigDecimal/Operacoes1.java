package operacoes.bigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Operacoes1 {

	public static void main(String[] args) {

		//comparação 0 igual, 1 se valor for maior, -1 se valor for menor 
		BigDecimal valor = new BigDecimal("0");
		System.out.println("resultado comparação: " + valor.compareTo(new BigDecimal("1")));
		if (valor.compareTo(new BigDecimal("1")) > 1) {
			System.out.println("executou");	
		}
		//duas casas depois da virgula para cima
		BigDecimal a = new BigDecimal("4.5").setScale(2, RoundingMode.HALF_UP);	
		BigDecimal b = new BigDecimal("1.123");
			
		BigDecimal c = a.add(b);
		System.out.println("Soma: " + c);
		
		BigDecimal d = a.subtract(b);
		System.out.println("Subtração: " + d);
		
		BigDecimal e = a.multiply(b);
		System.out.println("Multiplicação: " + e);
		
		//ver o que o metodo retorna
		int resultado = a.compareTo(b);
		System.out.println("Resultado comparação: " + resultado);
		
//		BigDecimal f = a.divide(b);
//		System.out.println("Divisão: " + f);
		
		//para resultados que tem infinitas casas depois da virgula
		BigDecimal roudingUp = a.divide(b, 5, RoundingMode.HALF_UP);
		System.out.println("Arredondamento: " + roudingUp);
		
		BigDecimal [] res = a.divideAndRemainder(b);
		System.out.println("Quociente = " + res[0] + " Resto = " + res[1]);
		
		System.out.println("=========================================");
		
		MathContext mc1 = new MathContext(1);		
		BigDecimal [] res1 = a.divideAndRemainder(b, mc1);
		System.out.println("Quociente = " + res1[0] + " Resto = " + res1[1]);
		
		MathContext mc2 = new MathContext(2);		
		BigDecimal [] res2 = a.divideAndRemainder(b, mc2);
		System.out.println("Quociente = " + res2[0] + " Resto = " + res2[1]);
		
		MathContext mc3 = new MathContext(5);		
		BigDecimal [] res3 = a.divideAndRemainder(b, mc3);
		System.out.println("Quociente = " + res3[0] + " Resto = " + res3[1]);
		
		MathContext mc4 = new MathContext(1000);		
		BigDecimal [] res4 = a.divideAndRemainder(b, mc4);
		System.out.println("Quociente = " + res4[0] + " Resto = " + res4[1]);
	}

}