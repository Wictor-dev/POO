
public class Funcionario extends Pessoa{
	int matricula;
	double salario;
	
	public Funcionario(int matricula, double salario, String nome, String sobrenome) {
        super(nome, sobrenome);
        this.matricula = matricula;
        if (ehValida(salario)){
            this.salario = salario;
        }else{
            this.salario = 0;
        }
    }
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	
	public double getSalarioPrimeiraParcela() {
		return 0.6 * this.getSalario();
	}
	public double getSalarioSegundaParcela() {
		return 0.4 * this.getSalario();
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public boolean ehValida(double salario) {
		return salario > 0;
	}
	
	
}
