package operacoes.bigDecimal;

import java.math.BigDecimal;

public enum NumerosMulti {

	PRIMEIRO(0.1), SEGUNDO(0.2), TERCEIRO(0.3);

	private double valor;

	private NumerosMulti(double valor) {
		this.valor = valor;
	}

	public BigDecimal getValor() {
		return BigDecimal.valueOf(this.valor);
	}
}
