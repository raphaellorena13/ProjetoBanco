import lombok.*;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private @Getter String nome;
	private @Getter int numero;
	private @Getter List<Conta> contas;
	private @Getter List<ContaPoupanca> contasPoupanca;

	public Banco(String nome, int numero) {

		this.nome = nome;
		this.numero = numero;
		this.contas = new ArrayList<>();

	}

	public void cadastraConta(Conta conta) {

		// Testa se arraylista esta vazio
		if (contas.size() > 0) {
			for (int i = 0; i < contas.size(); i++) {
				// Checa se o cliente ja esta cadastrado no sistema pelo CPF
				if ((this.contas.get(i).getCliente().getCpf().equals(conta.getCliente().getCpf()))
						&& (this.contas.get(i).getClass() == conta.getClass())) {
					System.out.println("O cliente " + conta.getCliente().getNome().toUpperCase() + " CPF "
							+ conta.getCliente().getCpf() + " já possui conta Corrente no banco ! ");
				} else {
					this.contas.add(conta);
					break;
				}
			}
		} else {
			this.contas.add(conta);
		}

	}

	/* Metodo Depositar da conta banco **/

	public void depositar(Conta conta, double valor) {

		for (int i = 0; i < contas.size(); i++) {
			// Checa se o cliente ja esta cadastrado no sistema pelo CPF
			if (this.contas.get(i).getNumero() == conta.getNumero()) {
				conta.depositar(valor);
				System.out.println("Deposito realizado");
			}
		}
	}

	/* Metodo Transferir da conta banco **/

	public void transferenciaEntreContas(Conta contaOrigem, Conta contaDestino, double valor) {

		// Testa se arraylista esta vazio
		if (contas.size() > 0) {
			for (int i = 0; i < contas.size(); i++) {
				// Checa se o cliente ja esta cadastrado no sistema pelo CPF
				if (this.contas.get(i).getNumero() == contaDestino.getNumero()) {
					contaOrigem.transferir(valor, contaDestino);
					
				} 
			}
		} else {
			System.out.println("Nenhuma conta cadastrada no sistema");
		}

	}

	/* Metodo Sacar da conta banco **/

	public void sacar(Conta conta, double valor) {

		for (int i = 0; i < contas.size(); i++) {
			// Checa se o cliente ja esta cadastrado no sistema pelo CPF
			if (this.contas.get(i).getNumero() == conta.getNumero()) {
				conta.sacar(valor);
			}
		}
	}

	/* LISTA AS CONTAS **/

	public void listarContas() {
		// Testa se arraylista esta vazio
		if (contas.size() > 0) {
			for (int i = 0; i < contas.size(); i++) {
				// Imprime os dados das contas
				this.contas.get(i).imprimirDadosConta();
			}
		} else {
			System.out.println("Não existe contas Corrente cadastrada.");
		}
	}

}
