
public class TestaSaudacao {
	public static void main(String[] args) {
		Saudacao s = new Saudacao();
		s.texto = "Bom dia, ";
		s.destinatario = "Wictor";
		
		String saudar = s.obterSaudacao();
		System.out.println(saudar);
	}
}
