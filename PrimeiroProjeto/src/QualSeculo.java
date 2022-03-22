import java.util.Scanner;

/**
 * Analise do século a qual o ano informado pertence.
 * 
 * @author João Maurício Hernandes Carrenho
 */

public class QualSeculo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ano = 0; 
		int seculo = 0;
		
		System.out.println("Digite o ano que se deseja analisar."); 
		ano = in.nextInt(); // Recebe ano a ser avaliado, não foi realizada nenhuma validação, pois pelo problema dado considera-se que serão inseridos apenas valores aceitos pelo problema.
		seculo = (int)(Math.ceil((double)ano / 100)); //Faz a divisão do ano por 100, arredondado-o para cima.

		if(ano <= (seculo-1)*100) seculo = seculo - 1; // Verifica se é o primeiro século, ou se é o ultimo ano do século anterior.
		
		System.out.printf("O ano de %d pertence ao século %d",ano, seculo); // imprime a análise realizada
		in.close();	
	}

}
