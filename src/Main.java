
public class Main {

	public static void main(String[] args) {

		Banco banco = new Banco("Banco Central", 1);

		System.out.println("Numero do Banco : " + banco.getNumero());
		System.out.println("Nome do Banco   : " + banco.getNome());

		Cliente cliente1 = new Cliente("123456789", "Raphael");
		Cliente cliente2 = new Cliente("987654321", "Joao");

		ContaCorrente cc1 = new ContaCorrente(cliente1, 1230.00);
		ContaCorrente cc2 = new ContaCorrente(cliente2, 1000.00);
		ContaPoupanca cp = new ContaPoupanca(cliente1, 10000.00);

		banco.cadastraConta(cc1);
		banco.cadastraConta(cc2);
		banco.cadastraConta(cp);

		System.out.println("-- MOMENTO 1 ---");
		banco.listarContas();


		System.out.println("-- MOMENTO 2 ---");
		banco.depositar(cc1, 2000);
		banco.sacar(cc2, 11150.99);
		banco.transferenciaEntreContas(cc2, cp, 25.60);
		banco.listarContas();


	}

}
