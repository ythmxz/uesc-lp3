/*
Yuri Thomaz dos Santos Carvalho
Exercício 03 - Laços
*/

/*
1. Imprima todos os números de 150 a 300.

2. Imprima a soma de 1 até 1000.

3. Imprima todos os múltiplos de 3, entre 1 e 100.

4. Imprima os fatoriais de 1 a 10.

5. No código do exercício anterior, aumente a quantidade de números que terão os fatoriais impressos,
até 20, 30, 40. Mude de int para long para ver alguma mudança.

6. (opcional) Imprima os primeiros números da série de Fibonacci até passar de 100.

7. (opcional) Escreva um programa que, dada uma variável x com algum valor inteiro, temos um
novo x de acordo com a seguinte regra:

se x é par, x = x / 2;

se x é impar, x = 3 * x + 1;

imprima x.

8. (opcional) Imprima a seguinte tabela, usando for s encadeados:

1
2 4
3 6 9
4 8 12 16
n n*2 n*3 ... n*n
*/

package java.exercicio03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		int questao = 0;

		try (Scanner entrada = new Scanner(System.in)) {

			System.out.print("\nEscolha uma questão (1 - 8): ");
			questao = entrada.nextInt();

			switch (questao) {

				case 1 -> Questao01.main(args);

				case 2 -> Questao02.main(args);

				case 3 -> Questao03.main(args);

				case 4 -> Questao04.main(args);

				case 5 -> Questao05.main(args);

				case 6 -> Questao06.main(args);

				case 7 -> Questao07.main(args);

				case 8 -> Questao08.main(args);

				default -> {

					return;

				}

			}

		}

	}

}

class Questao01 {

	public static void main(String[] args) {

		System.out.println("\nNúmeros de 150 a 300:\n");

		for (int i = 150; i <= 300; i++)
			System.out.println(i);

	}

}


class Questao02 {

	public static void main(String[] args) {

		int soma = 0;

		System.out.println("\nSomatória de 1 a 1000:\n");

		for (int i = 1; i <= 1000; i++)
			soma += i;

		System.out.print(soma);

	}

}


class Questao03 {

	public static void main(String[] args) {

		System.out.println("\nMúltiplos de 3 entre 1 e 100:\n");

		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0)
				System.out.print(i + " ");

		}

	}

}


class Questao04 {

	public static void main(String[] args) {

		int fatorial = 1;

		System.out.println("\nFatorial de 1 a 10:\n");

		for (int i = 1; i <= 10; i++) {

			fatorial *= i;
			System.out.println("fat(" + i + ") = " + fatorial);

		}

	}

}


class Questao05 {

	public static void main(String[] args) {

		long fatorial = 1;

		System.out.println("\nFatorial de 1 a 20:\n");

		for (long i = 1; i <= 20; i++) {

			fatorial *= i;
			System.out.println("fat(" + i + ") = " + fatorial);

		}

	}

}


class Questao06 {

	public static void main(String[] args) {

		int fibonacci = 0;
		int aux1 = 0;
		int aux2 = 1;

		System.out.println("\nFibonacci de 1 a 12:\n");

		for (int i = 1; i <= 12; i++) {

			aux1 = aux2 + fibonacci;
			aux2 = fibonacci;
			fibonacci = aux1;

			System.out.println("fib(" + i + ") = " + fibonacci);

		}

	}

}


class Questao07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int x = 0;

		System.out.print("\nInsira o valor de X: ");
		x = entrada.nextInt();

		entrada.close();

		while (x > 1) {

			if (x % 2 == 0) {

				System.out.println("\n" + x + " é par.");
				x = x / 2;

			}

			else {

				System.out.println("\n" + x + " é ímpar.");
				x = 3 * x + 1;

			}

			System.out.println("\nNovo X: " + x);

		}

	}

}


class Questao08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int valor = 0;

		System.out.print("\nInsira um valor: ");
		valor = entrada.nextInt();

		entrada.close();

		for (int i = 0; i <= valor; i++) {

			for (int j = 1; j <= i; j++)
				System.out.print((i * j) + " ");

			System.out.println();

		}

	}

}
