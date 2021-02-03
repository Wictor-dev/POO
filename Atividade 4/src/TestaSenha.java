
public class TestaSenha {
	public static void main(String[] args) {
		Senha senha = new Senha();
		senha.valor = "123abc";
		System.out.println("iguais? " + senha.iguais("123abc"));
		System.out.println("iguais? " + senha.iguais("123acb"));
		
		System.out.println("iguais sem espaços? " + senha.iguaisTrim(" 123abc  "));
		
		System.out.println("Senha segura? " + senha.tamanhoSeguro());
		senha.valor = "1234";
		System.out.println("Senha segura? " + senha.tamanhoSeguro());
		
		senha.valor = "aAbc123";
		System.out.println("Senha tem Maiuscula e minuscula? " + senha.possuiMaiusculaMinuscula());	
		senha.valor = "abc123";
		System.out.println("Senha tem Maiuscula e minuscula? " + senha.possuiMaiusculaMinuscula());
		
		senha.valor = "abc";
		System.out.println("Senha tem número? " + senha.possuiNumero());
		senha.valor = "abc123";
		System.out.println("Senha tem número? " + senha.possuiNumero());

		System.out.println("Senha é válida? " + senha.ehValida());
		senha.valor = "abc123";
		System.out.println("Senha tem número? " + senha.ehValida());
		senha.valor = "Abc123";
		System.out.println("Senha tem número? " + senha.ehValida());
	}
}
