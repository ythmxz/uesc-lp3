package aulas.aula01;

public class Banco {

	private static final String NOME = "Nubank";

	public static int QuantidadeContas() {
		return ContaBancaria.getQuantidadeContas();

	}

	public static void exibirQuantidadeContas() {
		System.out.println("\nContas no " + NOME + ": " + QuantidadeContas());

	}

}
