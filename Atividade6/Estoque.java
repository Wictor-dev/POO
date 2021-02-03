
import java.util.ArrayList;

public class Estoque {
	ArrayList<Produto> produtos;
	
	public Estoque() {
		produtos = new ArrayList<Produto>();
	}
	
	void inserir(Produto produto) {
		Produto produtoProcurado = consultar(produto.id);
		if (produtoProcurado != null) {
			System.out.println("Produto já existe, não foi possível inserir!");
		} else {
			produtos.add(produto);
		}
	}
	
	Produto consultar(int id) {
		Produto resultado = null;
		for (Produto p: produtos) {
			if(p.id == id) {
				resultado = p;
				break;
			}
		}
		
		return resultado;
	}
	
	void excluir(int id) {
		if (consultar(id) != null) {
			produtos.remove(id);
		}
	}
	
	void darBaixa(int id, int quantidade) {
		Produto p = consultar(id);
		if (p != null) {
			p.baixar(quantidade);
		}
	}
	
	void repor(int id, int quantidade) {
		Produto p = consultar(id);
		if (p != null) {
			p.repor(quantidade);
		} 
	}
	
}
