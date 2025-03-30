def main():

	palavra_secreta: str = 'banana'
	letras_acertadas: str = ['_', '_', '_', '_', '_', '_']
	chute: str
	posicao: int

	acertou: bool = False
	enforcou: bool = False

	tentativas: int = 6
	erros: int = 0

	print('\nJOGO DA FORCA')

	print('\n{}'.format(letras_acertadas))

	while (not acertou and not enforcou):

		chute = input('\nDigite uma letra: ')

		if (chute in palavra_secreta):

			posicao = 0

			for letra in palavra_secreta:

				if (chute.upper() == letra.upper()):
					letras_acertadas[posicao] = letra

				posicao += 1

		else:
			erros += 1

		acertou = '_' not in letras_acertadas
		enforcou = erros == tentativas

		print('\nErros: {} de {}'.format(erros, tentativas))

		print('\n{}'.format(letras_acertadas))

	if (acertou):
		print('\nVocê acertou!')
	else:
		print('\nVocê perdeu!')

	print('\nFim de jogo!')

if __name__ == '__main__':
	main()
