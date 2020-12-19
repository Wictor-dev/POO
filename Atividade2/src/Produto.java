
public class Produto {
	private int codigo;
	String descricao;
	double valor;
	int quantidade, quantidadeMinima;
	
	Produto(int codigo, String descricao, double valor, int quantidade, int quantidadeMinima){
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
		this.quantidadeMinima = quantidadeMinima;
	}
	
	void baixar(int quantidade) {
		if (this.quantidade - quantidade >= this.quantidadeMinima) {
			this.quantidade -= quantidade;
		}
	}
	
	void repor(int quantidade) {
		this.quantidade += quantidade;
	}
	
	void reajusta(double taxa) {
		this.valor += this.valor * (taxa/100);
	}
	
	int consultarCodigo() {
		return this.codigo;
	}
	
	public String toString() {
		return "Código: " + this.codigo + " / Descrição: " + this.descricao + " / Valor: " + this.valor + " / Quantidade: " + this.quantidade;
	}
	
	public boolean equals(Produto produto) {
		if (this.consultarCodigo() == produto.consultarCodigo()) {
			return true;
		}else {
			return false;		
		}
	}
}	
