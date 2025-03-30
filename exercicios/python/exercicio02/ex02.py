def main():

	numero_secreto: int = 42
	chute: int

	tentativas: int = 5
	rodada: int = 1

	while (rodada <= tentativas):

		print('\nTentativa {} de {}'.format(rodada, tentativas))

		chute = int(input('\nDigite um número: '))

		acertou: bool = chute == numero_secreto
		maior: bool = chute > numero_secreto
		menor: bool = chute < numero_secreto

		if (acertou):
			print('\nVocê acertou!')
			break

		elif (maior):
			print('\nVocê chutou um valor acima...')

		elif (menor):
			print('\nVocê chutou um valor abaixo.')

		rodada += 1

	print('\nFim de jogo!')

if __name__ == '__main__':
	main()
