
public class TestaDecimalNumber {
	public static void main(String[] args) {
		DecimalNumber d = new DecimalNumber();
		d.numero = 10.18;
		
		int inteiro = d.obterInteiro();
		double decimal = d.obterDecimal();
		System.out.println("Parte inteira => " + inteiro);
		System.out.printf("Parte decimal => %.2f", decimal);
	}
}
