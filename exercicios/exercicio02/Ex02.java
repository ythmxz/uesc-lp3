/*
Yuri Thomaz dos Santos Carvalho
Exercício 02 - Balanço Trimestral
*/

/*
1. Na empresa onde trabalhamos, há tabelas com o quanto foi gasto em cada mês. Para fechar o
balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em Janeiro, foram
gastos 15000 reais, em Fevereiro, 23000 reais e em Março, 17000 reais, faça um programa que
calcule e imprima o gasto total no trimestre. Siga esses passos:

- Crie uma classe chamada BalancoTrimestral com um bloco main, como nos exemplos
anteriores;

- Dentro do main (o miolo do programa), declare uma variável inteira chamada gastosJaneiro
e inicialize-a com 15000;

- Crie também as variáveis gastosFevereiro e gastosMarco , inicializando-as com 23000 e
17000, respectivamente, utilize uma linha para cada declaração;

- Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras 3 variáveis:
int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
Imprima a variável gastosTrimestre .

2. Adicione código (sem alterar as linhas que já existem) na classe anterior para imprimir a média
mensal de gasto, criando uma variável mediaMensal junto com uma mensagem. Para isso,
concatene a String com o valor, usando "Valor da média mensal = " + mediaMensal .
*/

package exercicios.exercicio02;

public class Ex02 {

	public static void main(String[] args) {

		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;

		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		double mediaMensal = gastosTrimestre / 3d;

		System.out.println("\nGastos do trimestre: " + gastosTrimestre);
		System.out.println("Valor da média mensal: " + mediaMensal);

	}

}
