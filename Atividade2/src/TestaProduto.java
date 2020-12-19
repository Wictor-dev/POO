
public class TestaProduto {
	public static void main(String[] args) {
		Produto produto1 = new Produto(1, "lapis", 2.5, 10,1);
		Produto produto2 = new Produto(2, "Caneta", 3.0, 5, 1);
		produto1.baixar(1);	
		System.out.println(produto1.quantidade);
		
		produto1.repor(2);
		System.out.println(produto1.quantidade);
		
		// testando metodo baixar() ultrapassando quantidade minima
		
		produto1.baixar(20);
		System.out.println(produto1.quantidade);
		
		// testando metodo reajusta()
		
		produto1.reajusta(10);
		System.out.println(produto1.valor);
		
		// testando metodo toString()
		
		String imprimirProduto1 = produto1.toString();
		System.out.println(imprimirProduto1);
		
		// testando método equals()
		
		System.out.println("Os produtos tem código igual? " + produto1.equals(produto2));
		
		System.out.print("Os produtos tem código igual? " + produto1.equals(produto1));
	}
}
