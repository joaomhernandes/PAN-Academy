import java.util.Scanner;

public class SomaPositivos {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int numero = 0;
		int soma = 0;
		
		System.out.println("Digite n�meros positivos para realizar a soma dos mesmos, ou digite um n�mero negativo para encerrar.");
		numero = in.nextInt();
		
		while(numero >= 0) {			
			soma += numero;
			System.out.printf("Soma = %d%n", soma);
			numero = in.nextInt();
		}
		
		in.close();

	}

}