programa
{
	
	funcao inicio()
	{
		inteiro contador=0
		cadeia contatos[][]={{"Joao","Sao Paulo","(11)9999-5241"},{"Maria","Ribeirão Preto","(16)9999-8596"},{"Ana Julia","Manaus","(92)9999-8574"}}

		faca{
			escreva(contatos[contador][0], "\t\t",  contatos[contador][1], "\t\t" , contatos[contador][2], "\n")
			contador++
		}enquanto(contador<=2)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 168; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */