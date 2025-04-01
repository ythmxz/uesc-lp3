package aulas.aula01;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String titular;
		double saldo;

		ContaBancaria outraConta = new ContaBancaria("Maria", 500.00d);

		System.out.println("\nBANCO CIC");

		System.out.println("\nSeja bem-vindo(a), vamos criar sua conta:");

		System.out.print("\nNome do titular: ");
		titular = entrada.nextLine();

		System.out.print("Saldo inicial: R$");
		saldo = entrada.nextDouble();

		entrada.close();

		ContaBancaria minhaConta = new ContaBancaria(titular, saldo);

		System.out.println("\nConta criada com sucesso!");

		minhaConta.exibirInformacoes();
		minhaConta.depositar(500);
		minhaConta.sacar(1500);
		minhaConta.sacar(50);
		outraConta.exibirInformacoes();
		minhaConta.transferir(500, outraConta);
		minhaConta.exibirInformacoes();

	}

}
