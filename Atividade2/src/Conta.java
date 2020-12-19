
public class Conta {
	String numero;
	private double saldo;
	
	Conta(String numero, double valor){
		this.numero = numero;
		this.saldo = valor;
	}
	
	boolean sacar(double valor) {
		saldo = saldo - valor;
		if (saldo < 0) {
			saldo += valor;
			return false;
		}else {
			return true;
		}
		
	}
	
	void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	double consultarSaldo() {
		return saldo;
	}
	
	boolean transferir(Conta destino, double valor) {
		if (this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
}
