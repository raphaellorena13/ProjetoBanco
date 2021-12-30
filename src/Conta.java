import lombok.*;

public abstract class Conta implements InterfaceConta {

	protected @Getter(AccessLevel.PROTECTED) int numero;
	protected @Getter(AccessLevel.PROTECTED) double saldo;
	protected @Getter(AccessLevel.PROTECTED) int agencia;
	protected @Getter @Setter Cliente cliente;
	private static int SEQUENCIAL = 1;
	private static final int SEQUENCIAL_AGENCIA = 1;

	public Conta() {
		this.numero = SEQUENCIAL++;
		this.agencia = SEQUENCIAL_AGENCIA;
		this.saldo = 0;

	}

	public boolean sacar(double valor) {
		if (saldo < valor) {
			System.out.println("Saldo insuficiente para sacar.");
			return false;
		} else {
			this.saldo = saldo - valor;
			return true;
		}
	}

	public void depositar(double valor) {
		this.saldo = saldo + valor;
	}

	public void transferir(double valor, Conta contaDestino) {

		if (this.sacar(valor) == true) {
			contaDestino.depositar(valor);
		}
	}

	public void imprimirDadosConta() {
		System.out.println("Agenia :" + this.agencia);
		System.out.println("Numero :" + this.numero);
		System.out.println("Saldo  :" + this.saldo);
	}

}
