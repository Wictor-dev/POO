
public class Equipamento {
	boolean ligado;
	
	void liga() {
		if (!estaLigado()) {
			ligado = true;
		}
		
	}
	
	void desliga() {
		if (estaLigado()) {
			ligado = false;
		}
		
	}
	
	void inverte() {
		ligado = !ligado;
	}
	boolean estaLigado() {
		return ligado;
	}
}
