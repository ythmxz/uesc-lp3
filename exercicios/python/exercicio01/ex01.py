def main():

	questao: int = 0

	questao = int(input('\nEscolha uma questão (1 - 3): '))

	match questao:

		case 1:
			questao01()

		case 2:
			questao02()

		case 3:
			questao03()


def questao01():
	print('\nUma mensagem diferente.')


def questao02():
	print('\nLinha 1.')
	print('Linha 2.')


def questao03():
	print('\nLinha 1.\nLinha 2.')


if __name__ == '__main__':
	main()
