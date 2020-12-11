
public class NumberUtils {
	int n;
	
	boolean isPair() {
		return (n % 2 == 0);
	}
	
	boolean isOdd() {
		return ! isPair();
	}
	
	
	
	boolean isPrime() {
		if (n > 9) {
			if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0  || n % 7 == 0) {
				return false;
			} else {
				return true;
			}
		}else {
			if (n == 2 || n == 3 || n == 5 || n == 7 || n == 9) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	String printCount() {
		String contagem = "";
		for (int x = 0; x <= n; x++) {
			if (x == n) {
				contagem += x;
			}else {
				contagem += x + ", ";
			}
		}
		return contagem;
	}
	
	String printReverseCount() {
		String rcontagem = "";
		for (int x = n; x >= 0; x--) {
			if (x==0) {
				rcontagem += x;
			} else {
				rcontagem += x + ", ";
			}
		}
		return rcontagem;
	}
	
}
