
public class TestaEmpregado {
	public static void main(String[] args) {
		Empregado e = new Empregado(1000);
		System.out.println(e.calcularSalario());
		Diarista d = new Diarista(2000);
		System.out.println(d.calcularSalario());
		Horista h = new Horista(3000);
		System.out.println(h.calcularSalario());
	}
}
