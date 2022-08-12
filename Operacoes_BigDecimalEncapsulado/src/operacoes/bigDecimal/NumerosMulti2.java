package operacoes.bigDecimal;

import java.math.BigDecimal;

public enum NumerosMulti2 {

	PRIMEIRO(new BigDecimal("0.1")),
	SEGUNDO(new BigDecimal("0.2")),
	TERCEIRO(new BigDecimal("0.3"));

	private BigDecimal bigDecimal;

	NumerosMulti2(BigDecimal bigDecimal) {
		this.bigDecimal = bigDecimal;
	}
	public BigDecimal getValor() {
		return this.bigDecimal;
	}
}
