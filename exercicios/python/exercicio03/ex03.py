def main():

	numero_secreto: int = 42
	chute: int
	pontos: int = 1000

	nivel: int
	tentativas: int
	rodada: int

	print('\nJOGO DA ADIVINHAÇÃO')

	print('\nEscolha o nível de dificuldade:')

	print('\n1 - Fácil (20 tentativas)')
	print('2 - Médio (10 tentativas)')
	print('3 - Difícil (5 tentativas)')

	nivel = int(input('\n> '))

	if (nivel == 1):
		tentativas = 20

	elif (nivel == 2):
		tentativas = 10

	elif (nivel == 3):
		tentativas = 5

	else:
		print('\nValor inválido!')

	for rodada in range(1, tentativas + 1):

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

		pontos -= abs(chute - numero_secreto)

	print('\nFim de jogo!')
	print('\nPontuação: {}'.format(pontos))

if __name__ == '__main__':
	main()
