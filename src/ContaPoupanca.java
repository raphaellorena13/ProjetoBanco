import lombok.*;

public class ContaPoupanca extends Conta {


	public ContaPoupanca(Cliente cliente, double saldo) {
		super();
		super.depositar(saldo);
		super.cliente = cliente;

	}

	public void imprimirDadosConta() {
		System.out.println("== EXTRATO CONTA Poupanca ==");
		this.cliente.imprimirCliente();
		super.imprimirDadosConta();

	}

}
