import java.util.Scanner;

/**
 * C�lculo da pontua��o do time x no campeonato.
 * 
 * @author Jo�o Maur�cio Hernandes Carrenho
 */

public class PontuacaoTime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] placares = new String[10];
		int pontos = 0;
		
		for(int i = 0; i <10; i++) { // Loop simples para coletar o placar dos 10 jogos do campeonato.
			System.out.printf("Digite o placar do %d� jogo %n", i+1); 
			placares[i] = in.nextLine(); // Entrada dos placares no formato x:y
			pontos += pontuar(placares[i]); //Chama a fun��o pontuar() passando o placar do jogo "i", somando seu retorno aos pontos.
		}
		
		System.out.printf("A pontua��o final foi %d pontos", pontos); // Impress�o da pontua��o final
		
	in.close();
	
	}

		static int pontuar (String placar) { // Fun��o que calcula a pontua��o do jogo atrav�s de seu placar.
			
		String [] gols = placar.split(":"); // Divide a String placar onde houver ":".
		if(Integer.parseInt(gols[0]) > Integer.parseInt(gols[1])) return 3 ;  // Compara a quanidade de gols de cada time e retorna o valor da pontua��o:
		if(Integer.parseInt(gols[0]) == Integer.parseInt(gols[1])) return 1 ; // 3, caso o time x marque mais gols; 1, em caso de empate; 0, caso o time x perca.
		return 0;
	}
	
}
