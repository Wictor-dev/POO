
public class Senha {
	String valor;
	
	boolean iguais(String valor) {	
		return this.valor == valor;
	}
	
	boolean iguaisTrim(String valor) {
		return this.valor.trim().equals(valor.trim());
	}
	
	boolean tamanhoSeguro() {	
		return this.valor.length() >= 6;
	}
	
	boolean possuiMaiusculaMinuscula() {
		boolean possuiMaiuscula = false;
		boolean possuiMinuscula = false;
		for (int i = 0; i < valor.length(); i++) {
			char c = valor.charAt(i);
			if (c >= 'A' && c <='Z') {
				possuiMaiuscula = true;
			}else if (c >= 'a' && c<= 'z') {
				possuiMinuscula = true;
			}
			if (possuiMinuscula && possuiMaiuscula) {
				break;
			}
		}
		
		return possuiMinuscula && possuiMaiuscula;
	}
	
	boolean possuiNumero() {
		boolean result = false;
		
		for (int i = 0; i<valor.length();i++) {
			char c = valor.charAt(i);
			if (c >= '0' && c <= '9') {
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	boolean ehValida() {
		return tamanhoSeguro() && possuiMaiusculaMinuscula() && possuiNumero();
}
}
