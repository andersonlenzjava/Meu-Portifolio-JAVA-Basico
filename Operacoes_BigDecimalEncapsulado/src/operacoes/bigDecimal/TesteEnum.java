package operacoes.bigDecimal;

import java.math.BigDecimal;

public class TesteEnum {
	
	public static void main(String[] args) {
			
		BigDecimal a = new BigDecimal("4");
			
		NumerosMulti prim = NumerosMulti.PRIMEIRO;
		BigDecimal res = a.add(prim.getValor());
		System.out.println(res);
		
		NumerosMulti seg = NumerosMulti.SEGUNDO;
		BigDecimal res1 = a.add(seg.getValor());
		System.out.println(res1);
		
		NumerosMulti ter = NumerosMulti.TERCEIRO;
		BigDecimal res2 = a.add(ter.getValor());
		System.out.println(res2);
		
		
		NumerosMulti2 nus = NumerosMulti2.PRIMEIRO;
		BigDecimal bd2 = nus.getValor();
		System.out.println(bd2);
	}

}
