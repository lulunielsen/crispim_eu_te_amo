package exercicio1;

public class Conta {
	int numconta;
	String nome;
	double saldo;
	double limite;
	boolean saque(double valor){
		if(valor > this.saldo){
		System.out.println("Limite indisponível");
		return true;
		}
		else{
			this.saldo = this.saldo -= valor;
			return false;
		}
	}
	
	void dep(double valor){
		this.saldo = this.saldo += valor;
	}
}
