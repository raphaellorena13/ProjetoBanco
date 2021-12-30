import lombok.Getter;

public class Cliente extends Pessoa {

	private @Getter int codigo = 0;
	private static int GERAR_CODIGO = 1;

	public Cliente(String cpf, String nome) {
		super(cpf, nome);
		this.codigo = GERAR_CODIGO++;
	}

	public void imprimirCliente() {
		System.out.println("Codigo do Cliente : " + this.getCodigo());
		super.imprimirPessoa();
	}

}
