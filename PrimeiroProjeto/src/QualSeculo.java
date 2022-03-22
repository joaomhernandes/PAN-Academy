import java.util.Scanner;

/**
 * Analise do s�culo a qual o ano informado pertence.
 * 
 * @author Jo�o Maur�cio Hernandes Carrenho
 */

public class QualSeculo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ano = 0; 
		int seculo = 0;
		
		System.out.println("Digite o ano que se deseja analisar."); 
		ano = in.nextInt(); // Recebe ano a ser avaliado, n�o foi realizada nenhuma valida��o, pois pelo problema dado considera-se que ser�o inseridos apenas valores aceitos pelo problema.
		seculo = (int)(Math.ceil((double)ano / 100)); //Faz a divis�o do ano por 100, arredondado-o para cima.

		if(ano <= (seculo-1)*100) seculo = seculo - 1; // Verifica se � o primeiro s�culo, ou se � o ultimo ano do s�culo anterior.
		
		System.out.printf("O ano de %d pertence ao s�culo %d",ano, seculo); // imprime a an�lise realizada
		in.close();	
	}

}
