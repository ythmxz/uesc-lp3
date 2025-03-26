/*
Yuri Thomaz dos Santos Carvalho
Exercício 01 - System.out.println()
*/

/*
1.	Altere seu programa para imprimir uma mensagem diferente.

2.	Altere seu program para imprimir duas linhas de texto usando duas linhas de código System.out.

3.	Sabendo que os caracteres \n representam uma quebra de linhas, imprima	duas linhas de texto
usando uma única linha de código System.out.
*/

package exercicios.Exercicio01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int questao = 0;

		System.out.print("\nEscolha uma questão (1 - 3): ");
		questao = entrada.nextInt();

		entrada.close();

		switch (questao) {

			case 1 -> Questao01.main(args);

			case 2 -> Questao02.main(args);

			case 3 -> Questao03.main(args);

			default -> {

				return;

			}

		}

	}

}

class Questao01 {

	public static void main(String[] args) {

		System.out.println("\nUma mensagem diferente.");

	}

}

class Questao02 {

	public static void main(String[] args) {

		System.out.println("\nLinha 1.");
		System.out.println("Linha 2.");

	}

}

class Questao03 {

	public static void main(String[] args) {

		System.out.println("\nLinha 1;\nLinha 2.");

	}

}
