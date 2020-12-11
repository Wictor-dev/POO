
public class TestaDesconto {
	public static void main(String[] args) {
		Desconto d = new Desconto();
		d.valorOriginal = 120;
		d.desconto = 10;	
		
		double valorCalculado = d.calcular();
		System.out.println(valorCalculado);
		
	}
}
