
import java.time.LocalDate;

public class ProdutoPerecivel extends Produto{
	LocalDate dataDeValidade;
	
	ProdutoPerecivel(int codigo, String descricao, double valor, int quantidade, LocalDate dataDeValidade) {
		super(codigo, descricao, valor, quantidade);
		this.dataDeValidade = dataDeValidade;
	}
	
	boolean ehValido() {
		return dataDeValidade.isAfter(LocalDate.now());
	}
	
}
