
public class TestaNumberUtils {
	public static void main(String[] args) {
		NumberUtils num = new NumberUtils();
		num.n = 9;
		
		boolean par = num.isPair();
		boolean primo = num.isPrime();
		String contador = num.printCount();
		String contadorReverso = num.printReverseCount();
		System.out.println(par);
		System.out.println(primo);
		System.out.println(contador);
		System.out.println(contadorReverso);
		
	}
}
