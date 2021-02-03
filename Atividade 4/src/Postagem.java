
public class Postagem {
	int id;
	String texto;
	int curtidas;
	
	void curtir() {
		curtidas ++;
	}
	
	public String toString() {
		return "Texto: " + texto + " | curtidas: " + curtidas;
	}
}
