
public class Diarista extends Empregado{
	@Override
	public double calcularSalario() {
		return super.calcularSalario() / 30;
	}
	
	public Diarista(double salario) {
		super(salario);
		// TODO Auto-generated constructor stub
	}
}
