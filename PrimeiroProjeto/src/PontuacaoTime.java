import java.util.Scanner;

/**
 * Cálculo da pontuação do time x no campeonato.
 * 
 * @author João Maurício Hernandes Carrenho
 */

public class PontuacaoTime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] placares = new String[10];
		int pontos = 0;
		
		for(int i = 0; i <10; i++) { // Loop simples para coletar o placar dos 10 jogos do campeonato.
			System.out.printf("Digite o placar do %dº jogo %n", i+1); 
			placares[i] = in.nextLine(); // Entrada dos placares no formato x:y
			pontos += pontuar(placares[i]); //Chama a função pontuar() passando o placar do jogo "i", somando seu retorno aos pontos.
		}
		
		System.out.printf("A pontuação final foi %d pontos", pontos); // Impressão da pontuação final
		
	in.close();
	
	}

		static int pontuar (String placar) { // Função que calcula a pontuação do jogo através de seu placar.
			
		String [] gols = placar.split(":"); // Divide a String placar onde houver ":".
		if(Integer.parseInt(gols[0]) > Integer.parseInt(gols[1])) return 3 ;  // Compara a quanidade de gols de cada time e retorna o valor da pontuação:
		if(Integer.parseInt(gols[0]) == Integer.parseInt(gols[1])) return 1 ; // 3, caso o time x marque mais gols; 1, em caso de empate; 0, caso o time x perca.
		return 0;
	}
	
}
