
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
		System.out.println("Histórico de transações:");
		
		for (int i = historico.size() - 1; i >= 0; i--) {
			System.out.println(historico.get(i));
		}
	}
}
