
public class Desconto {
		double valorOriginal, desconto;	
		
		double calcular() {
			double valorCalculado = valorOriginal * (1 - (desconto / 100));
			return valorCalculado;
		}
}
