import lombok.Getter;
import lombok.Setter;

public class ContaCorrente extends Conta {


	public ContaCorrente(Cliente cliente, double saldo) {
		super();
		super.depositar(saldo);
		super.cliente = cliente;

	}

	public void imprimirDadosConta() {
		System.out.println("== EXTRATO CONTA CORRENTE ==");
		this.cliente.imprimirCliente();
		super.imprimirDadosConta();

	}

}
