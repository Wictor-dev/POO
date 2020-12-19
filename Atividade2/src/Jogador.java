
public class Jogador {
	int forca, nivel;
	private int pontos;
	Jogador(int forca, int nivel, int pontos){
		this.forca = forca;
		this.nivel = nivel;
		this.pontos = pontos;
	}
	
	int calcularAtaque() {
		return (this.forca * this.nivel);
	}
	
	void atacar(Jogador alvo) {
		alvo.pontos -= this.calcularAtaque();
	}
	
	int mostrarPontos() {
		return this.pontos;
	}
}
