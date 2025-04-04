package aulas.aula02;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	private int[] diasMes = {31, anoBissexto(ano) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public Data() {

		long milissegundos = System.currentTimeMillis();
		long contagemDias = milissegundos / (1000 * 60 * 60 * 24);

		ano = 1970;

		int diasAno = 1;

		while (contagemDias > diasAno) {

			if (anoBissexto(ano))
				diasAno = 366;

			else
				diasAno = 365;

			contagemDias -= diasAno;
			ano++;

		}

		mes = 1;

		dia = (int) contagemDias + 1;

		for (int i = 0; i < diasMes.length; i++) {

			if (dia > diasMes[i]) {

				dia -= diasMes[i];
				mes++;

			}

			else
				break;

		}

	} //Data atual

	public Data(int _dia, int _mes, int _ano) {

		dia = _dia;
		mes = _mes;
		ano = _ano;

	} //Data personalizada

	public Data(String _data) {

		dia = Integer.parseInt(_data.substring(0, 2));
		mes = Integer.parseInt(_data.substring(3, 5));
		ano = Integer.parseInt(_data.substring(6, 10));

	} //Data em string

	public int getDia() {
		return dia;

	}

	public void setDia(int _novoDia) {
		dia = _novoDia;

	}

	public int getMes() {
		return mes;

	}

	public void setMes(int _novoMes) {
		mes = _novoMes;

	}

	public int getAno() {
		return ano;

	}

	public void setAno(int _novoAno) {
		ano = _novoAno;

	}

	private boolean anoBissexto(int _ano) {

		if (ano % 400 == 0)
			return true;

		if (ano % 100 != 0 && ano % 4 == 0)
			return true;

		return false;

	}

	private boolean dataValida(Data _data) {

		if (_data.ano < 1)
			return false;

		if (_data.mes < 1 || _data.mes > 12)
			return false;

		if (_data.dia < 1)
			return false;

		if (_data.dia > diasMes[mes - 1])
			return false;

		return true;

	}

	public static boolean dataIgual(Data _data1, Data _data2) {

		if (_data1.dia != _data2.dia)
			return false;

		if (_data1.mes != _data2.mes)
			return false;

		if (_data1.ano != _data2.ano)
			return false;

		return true;

	}

	public void imprimirData() {

		String data = "\n%02d/%02d/%04d";
		String dataFormatada = String.format(data, dia, mes, ano);

		if (!dataValida(this))
			System.out.println("\nData inválida!");
		else
			System.out.println(dataFormatada);

	}

}
