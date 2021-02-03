import java.time.LocalDate;

public class TestaEstoque {
	public static void main(String[] args) {
		Produto p = new Produto(1, "lapis", 1.0, 10);
		
		LocalDate data1 = LocalDate.of(2021, 03, 02);
		ProdutoPerecivel pp1 = new ProdutoPerecivel(2,"arroz",5.00,10, data1);
		LocalDate data2 = LocalDate.of(2021, 03, 01);
		ProdutoPerecivel pp2 = new ProdutoPerecivel(3,"feijao",5.00,10, data2);
		
		System.out.println(pp1.ehValido());
		System.out.println(pp2.ehValido());
		
		Estoque estoque = new Estoque();
		estoque.inserir(p);
		estoque.inserir(pp1);
		estoque.inserir(pp2);
		
		Produto produtoProcurado = estoque.consultar(pp1.id);
		System.out.println(produtoProcurado.descricao);
		
		estoque.excluir(p.id);
		Produto produtoProcurado2 = estoque.consultar(p.id);
		if (produtoProcurado2 == null) {
			System.out.println("não encontrado");			
		}else {
			System.out.println(produtoProcurado2.descricao);
		}
		
		LocalDate data3 = LocalDate.of(2021, 03, 02);
		ProdutoPerecivel pp3 = new ProdutoPerecivel(4,"açucar",7.00, 5, data3);
		estoque.inserir(pp3);
		Produto produtoProcurado3 = estoque.consultar(pp3.id);
		System.out.println(produtoProcurado3.descricao);
		estoque.inserir(pp3);
		
		estoque.darBaixa(3, 1);
		System.out.println(pp2.quantidade);
		
		estoque.repor(3, 1);
		System.out.println(pp2.quantidade);
	}
}
