
public class DecimalNumber {
	double numero;
	int obterInteiro() {
		return (int)numero;
	}
	
	double obterDecimal() {
		int inteiro = (int)numero;
		return numero - inteiro;
	}
}
