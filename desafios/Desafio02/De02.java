/*
Yuri Thomaz dos Santos Carvalho
Desafio - Fibonacci Iterativo
*/

/*
1. Um método pode chamar ele mesmo. Chamamos isso de recursão. Você pode resolver a série de
Fibonacci usando um método que chama ele mesmo. Este método calculaFibonacci não pode ter nenhum
laço, só pode chamar ele mesmo como método. Pense nele como uma função, que usa a própria função
para calcular o resultado.

2. Escreva o método recursivo novamente, usando apenas uma linha. Para isso, pesquise sobre o
operador condicional ternário.
*/

package desafios.desafio02;

import java.util.Scanner;

public class De02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int questao = 0;

		System.out.print("\nEscolha uma questão (1 - 2): ");
		questao = entrada.nextInt();

		entrada.close();

		switch (questao) {

			case 1 -> Questao01.main(args);

			case 2 -> Questao02.main(args);

			default -> {

				return;

			}

		}

	}

}

class Questao01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int valor = 0;

		System.out.print("\nInsira um valor: ");
		valor = entrada.nextInt();

		entrada.close();

		System.out.println("fib(" + valor + ") = " + fibonacci(valor));

	}

	public static int fibonacci(int _valor) {

		if (_valor == 0)
			return 0;

		else if (_valor == 1)
			return 1;

		else
			return fibonacci(_valor - 1) + fibonacci(_valor - 2);

	}

}

class Questao02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int valor = 0;

		System.out.print("\nInsira um valor: ");
		valor = entrada.nextInt();

		entrada.close();

		System.out.println("fib(" + valor + ") = " + fibonacci(valor));

	}

	public static int fibonacci(int _valor) {

		return (_valor == 0 || _valor == 1) ? _valor : fibonacci(_valor - 1) + fibonacci(_valor - 2);

	}

}
