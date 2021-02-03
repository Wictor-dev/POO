
public class Produto {
	int id;
	String descricao;
	double valor;
	int quantidade;
	
	Produto(int id, String descricao, double valor, int quantidade){
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	void baixar(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	void repor(int quantidade) {
		this.quantidade += quantidade;
	}
	
}	
