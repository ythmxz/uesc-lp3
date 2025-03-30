package aulas.aula01;

import java.util.Scanner;

public class Banco {

	static Scanner entrada = new Scanner(System.in);

	static ContaBancaria minhaConta = new ContaBancaria();

	static ContaBancaria outraConta = new ContaBancaria();

	static int opcao = 0;
	static double valor = 0d;

	public static void main(String[] args) {

		limparTela();

		System.out.println("\nBANCO CIC");

		System.out.println("\nSeja bem-vindo(a), vamos criar sua conta:");

		System.out.print("\nNome do titular: ");
		minhaConta.setTitular(entrada.nextLine());

		System.out.print("Saldo inicial: R$");
		minhaConta.setSaldo(entrada.nextDouble());

		limparTela();

		System.out.println("\nConta criada com sucesso!");

		menu();

	}

	public static void menu() {

		opcao = 0;

		while (opcao < 1 || opcao > 5) {

			System.out.println("\nEscolha uma ação:");

			System.out.println("\n1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Mostrar informações");
			System.out.println("4 - Transferir");
			System.out.println("5 - Sair");

			System.out.print("\n> ");
			opcao = entrada.nextInt();

			limparTela();

		}

		switch (opcao) {

			case 1 -> {

				System.out.print("\nValor do depósito: R$");
				valor = entrada.nextDouble();

				limparTela();

				minhaConta.depositar(valor);
				menu();

			}

			case 2 -> {

				System.out.print("\nValor do saque: R$");
				valor = entrada.nextDouble();

				limparTela();

				minhaConta.sacar(valor);
				menu();

			}

			case 3 -> {

				minhaConta.exibirInformacoes();
				menu();

			}

			case 4 -> {

				minhaConta.transferir(valor, outraConta);
				menu();

			}

			case 5 -> {

				return;

			}

		}

	}

	public static void limparTela() {

		System.out.print("\033[H\033[2J");
		System.out.flush();

	}

}
