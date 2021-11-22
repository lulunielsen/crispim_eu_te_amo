package exercicio1;

public class Programa {
	public static void main(String[] args) {
		Conta laura;
		laura = new Conta();
		laura.nome = "Laura Nielsen";
		laura.saldo = 10000;
		laura.limite = 5000;
		laura.numconta = 001;
		
		Conta ariana;
		ariana = new Conta();
		ariana.nome = "Ariana";
		ariana.saldo = 5000;
		ariana.limite = 1000;
		ariana.numconta = 002;
		ariana.saque(1300);
		ariana.dep(5800);
		
		System.out.println(ariana.nome + " - " + ariana.saldo);
		}
	
}
