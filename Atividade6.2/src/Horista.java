
public class Horista extends Diarista{
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario()/24;
	}
	
	public Horista(double salario) {
		super(salario);
		// TODO Auto-generated constructor stub
	}

}
