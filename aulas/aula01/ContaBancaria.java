package aulas.aula01;

public class ContaBancaria {

	private String _titular;
	private double _saldo;
	private static int quantidadeContas;

	public ContaBancaria(String _titular, double _saldo) {

		this._titular = _titular;
		this._saldo = _saldo;
		quantidadeContas++;

	}

	public String getTitular() {
		return _titular;

	}

	public double getSaldo() {
		return _saldo;

	}

	public void setSaldo(double _novoSaldo) {
		_saldo = _novoSaldo;

	}

	public static int getQuantidadeContas() {
		return quantidadeContas;

	}

	public void exibirInformacoes() {

		System.out.println("\nInformações da Conta:");

		System.out.println("\nTitular: " + getTitular());
		System.out.println("Saldo: R$" + getSaldo());

	}

	public void depositar(double _valor) {

		if (_valor < 0)
			System.out.println("\nValor inválido!");

		else {

			setSaldo(_saldo + _valor);
			System.out.println("\nDepósito de R$" + _valor + " concluído!");
			System.out.println("Saldo atual: R$" + getSaldo());

		}
	}

	public void sacar(double _valor) {

		if (_valor < 0)
			System.out.println("\nValor inválido!");

		else if (_valor > _saldo) {

			System.out.println("\nSaldo insuficiente!");
			System.out.println("\nSaque de R$" + _valor + " não realizado!");
			System.out.println("Saldo atual: R$" + getSaldo());

		}

		else {

			setSaldo(_saldo - _valor);
			System.out.println("\nSaque de R$" + _valor + " concluído!");
			System.out.println("Saldo atual: R$" + getSaldo());

		}

	}

	public void transferir(double _valor, ContaBancaria destinatario) {

		if (_valor <= getSaldo() && _valor > 0.00d) {

			sacar(_valor);
			destinatario.depositar(_valor);

			System.out.println("\nTransferência de R$" + _valor + " concluída!");

		}

		else
			System.out.println("\nTransferênciade R$" + _valor + " não finalizada!");

	}

}
