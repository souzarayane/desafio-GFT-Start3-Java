
public class Main {

	public static void main(String[] args) {
		Cliente rayane = new Cliente();
		rayane.setNome("Rayane");
		
		Conta cc = new ContaCorrente(rayane);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(rayane);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
