/*
Yuri Thomaz dos Santos Carvalho
Exercício 04 - Conta Bancária
*/

/*
1. Modele uma conta. A ideia aqui é apenas modelar, isto é, só identifique que informações são
importantes. Desenhe no papel tudo o que uma Conta tem e tudo o que ela faz. Ela deve ter o nome
do titular (String), o número (int), a agência (String), o saldo (double) e uma data de
abertura (String). Além disso, ela deve fazer as seguintes ações:

- saca, para retirar um valor do saldo;
- deposita, para adicionar um valor ao saldo;
- calculaRendimento, para devolver o rendimento mensal dessa conta.

2. Transforme o modelo acima em uma classe Java. Teste-a, usando uma outra classe que tenha o
main. Você deve criar a classe da conta com o nome Conta, mas pode nomear como quiser a classe de
testes, contudo, ela deve possuir o método main. A classe Conta deve conter pelo menos os seguintes
métodos:

- saca que recebe um valor como parâmetro e retira esse valor do saldo da conta;
- deposita que recebe um valor como parâmetro e adiciona esse valor ao saldo da conta;
- calculaRendimento que não recebe parâmetro algum e devolve o valor do saldo multiplicado por 0.1;

3. Crie um método recuperaDadosParaImpressao(), que não recebe parâmetro mas devolve o texto
com todas as informações da nossa conta para efetuarmos a impressão. Dessa maneira, você não precisa
ficar copiando e colando um monte de System.out.println() para cada mudança e teste que fizer com
cada um de seus funcionários.

4. Construa duas contas com o new e compare-os com o ==. E se eles tiverem os mesmos atributos?
Para isso você vai precisar criar outra referência.

5. Crie duas referências para a mesma conta, compare-os com o ==. Tire suas conclusões.

6. (opcional) Em vez de utilizar uma String para representar a data, crie uma outra classe, chamada
Data. Ela possui 3 campos int, para dia, mês e ano. Faça com que sua conta passe a usá-la.
(é parecido com o último exemplo da explicação, em que a Conta passou a ter referência para um Cliente).

7. (opcional) Modifique seu método recuperaDadosParaImpressao para que ele devolva o valor da
dataDeAbertura daquela Conta.

8. (opcional) O que acontece se você tentar acessar um atributo diretamente na classe?

9. (opcional-avançado) Crie um método na classe Data que devolva o valor formatado da data, isto é,
devolva uma String com "dia/mes/ano".
*/

package exercicios.exercicio04;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex04 {

	static Scanner entrada = new Scanner(System.in);

	static Conta cliente = new Conta();

	public static void main(String[] args) {

		System.out.println("\nInsira o nome do titular:");
		System.out.print("> ");
		cliente.setTitular(entrada.nextLine());

		System.out.println("\nInsira o número da conta:");
		System.out.print("> ");
		cliente.setNumero(Integer.parseInt(entrada.nextLine()));

		System.out.println("\nInsira o nome da agência:");
		System.out.print("> ");
		cliente.setAgencia(entrada.nextLine());

		System.out.println("\nInsira o saldo inicial:");
		System.out.print("> ");
		cliente.setSaldo(Double.parseDouble(entrada.nextLine()));

		menu();

		entrada.close();

	}

	public static void menu() {

		int opcao = 0;

		while (opcao < 1 || opcao > 5) {

			System.out.println("\nO que deseja fazer?");

			System.out.println("\n1 - Saque");
			System.out.println("2 - Depósito");
			System.out.println("3 - Calcular Rendimento");
			System.out.println("4 - Dados da Conta");
			System.out.println("5 - Sair");

			System.out.print("\n> ");
			opcao = Integer.parseInt(entrada.nextLine());

		}

		switch (opcao) {

			case 1 -> {

				System.out.println("\nInsira um valor para saque:");
				System.out.print("> R$");
				cliente.sacar(Double.parseDouble(entrada.nextLine()));
				menu();

			}

			case 2 -> {

				System.out.println("\nInsira um valor para depósito:");
				System.out.print("> R$");
				cliente.depositar(Double.parseDouble(entrada.nextLine()));
				menu();

			}

			case 3 -> {

				double rendimento = cliente.calculaRendimento();

				System.out.println("\nSaldo atual: R$" + cliente.getSaldo());
				System.out.println("\nRendimento: R$" + rendimento);
				menu();

			}

			case 4 -> {

				cliente.recuperaDadosParaImpressao();
				menu();

			}

			case 5 -> {

				entrada.close();
				return;

			}

		}

	}

}

class Conta {

	private String _titular;
	private int _numero;
	private String _agencia;
	private double _saldo;

	Data dataAbertura = new Data();

	public Conta() {}

	public String getTitular() {
		return _titular;

	}

	public void setTitular(String _novoTitular) {
		_titular = _novoTitular;

	}

	public int getNumero() {
		return _numero;

	}

	public void setNumero(int _novoNumero) {
		_numero = _novoNumero;

	}

	public String getAgencia() {
		return _agencia;

	}

	public void setAgencia(String _novaAgencia) {
		_agencia = _novaAgencia;

	}

	public double getSaldo() {
		return _saldo;

	}

	public void setSaldo(double _novoSaldo) {
		_saldo = _novoSaldo;

	}

	public String getDataAbertura() {
		return dataAbertura.getData();

	}

	public void sacar(double _valor) {

		if (_valor <= 0d) {

			System.out.println("\nValor inválido!");
			return;

		}

		else if (_valor > _saldo) {

			System.out.println("\nSaldo insuficiente!");
			System.out.println("\nSaldo atual: R$" + getSaldo());

			return;

		}

		setSaldo(_saldo - _valor);
		System.out.println("\nSaldo atual: R$" + getSaldo());

	}

	public void depositar(double _valor) {

		if (_valor <= 0d) {

			System.out.println("\nValor inválido!");
			return;

		}

		setSaldo(_saldo + _valor);
		System.out.println("\nSaldo atual: R$" + getSaldo());

	}

	public double calculaRendimento() {
		return getSaldo() * 0.1d;

	}

	public void recuperaDadosParaImpressao() {

		System.out.println("\nTitular: " + getTitular());
		System.out.println("Número: " + getNumero());
		System.out.println("Agência: " + getAgencia());
		System.out.println("Saldo: R$" + getSaldo());
		System.out.println("Data de Abertura: " + getDataAbertura());

	}

}

class Data {

	LocalDate dataAtual = LocalDate.now();
	DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	String dataFormatada = dataAtual.format(formatoData);

	public String getData() {
		return dataFormatada;

	}

}
