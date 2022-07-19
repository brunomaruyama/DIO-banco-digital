
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
		System.out.println("Histórico de transações:");

		for (int i = historico.size() -1; i >= 0; i--) {
			System.out.println(historico.get(i));
		}

	}
}