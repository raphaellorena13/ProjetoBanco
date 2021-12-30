import lombok.*;

public class Pessoa implements InterfacePessoa {

	private @Getter(AccessLevel.PROTECTED) @Setter(AccessLevel.PROTECTED) String cpf;
	private @Getter(AccessLevel.PROTECTED) @Setter(AccessLevel.PROTECTED) String nome;

	public Pessoa(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public void imprimirPessoa() {
		System.out.println("Nome   : " + this.getNome());
		System.out.println("CPF    : " + this.getCpf());
	}

}
