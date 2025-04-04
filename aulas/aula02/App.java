package aulas.aula02;

//import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		//Scanner entrada = new Scanner(System.in);

		Data data1 = new Data();
		data1.imprimirData();

		Data data2 = new Data(3, 4, 2025);
		data2.imprimirData();

		Data data3 = new Data("04/06/1993");
		data3.imprimirData();

		if (Data.dataIgual(data1, data2))
			System.out.println("\nDatas iguais");
		else
			System.out.println("\nDatas diferentes");

	}

}
