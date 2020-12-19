
public class TestaJogador {
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador(10,20,350);
		Jogador jogador2 = new Jogador(10,30,550);
		
		jogador1.atacar(jogador2);
		jogador2.atacar(jogador1);
		jogador1.atacar(jogador2);
		System.out.println("Pontos jogador 1: " + jogador1.mostrarPontos());
		System.out.println("Pontos jogador 2: " + jogador2.mostrarPontos());
	}
}
