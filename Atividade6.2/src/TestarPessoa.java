
public class TestarPessoa {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Wictor", "Gabriel");
		System.out.println(p.getNomeCompleto());
		
		Funcionario f = new Funcionario(1,1000,"Jo�o","Pereira");
		System.out.println("O funcion�rio " + f.getNomeCompleto() + " recebe " 
				+ f.getSalarioPrimeiraParcela() + " Na primeira parcela e "
				+ f.getSalarioSegundaParcela() + " Na segunda Parcela.");
		
		Professor pf = new Professor("matematica",1,1000,"Carlos","emanuel");
		System.out.println("O professor " + pf.getNomeCompleto() + " recebe " 
				+ pf.getSalarioPrimeiraParcela() + " Na primeira parcela e "
				+ pf.getSalarioSegundaParcela() + " Na segunda Parcela.");
		
	}
}
