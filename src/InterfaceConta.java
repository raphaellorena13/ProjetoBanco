
public interface InterfaceConta {

	boolean sacar(double valor);

	void depositar(double valor);

	void transferir(double valo, Conta contaDestino);

	void imprimirDadosConta();
}
