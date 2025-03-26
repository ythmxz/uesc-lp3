/*
Yuri Thomaz dos Santos Carvalho
Desafio - Fibonacci Iterativo
*/

/*
1. Faça o exercício da série de Fibonacci usando apenas duas variáveis
*/

package desafios.Desafio01;

public class De01 {

	public static void main(String[] args) {

		int aux = 1, fibonacci = 0;

		System.out.println("\nFibonacci de 1 a 12:\n");

		for (int i = 1; i <= 12; i++) {

			fibonacci += aux;
			aux = fibonacci - aux;

			System.out.println("fib(" + i + ") = " + fibonacci);

		}

	}

}
