import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Random gerador= new Random();
		int chute = 0;
		int aleatorio = gerador.nextInt(100);
				
		for (int i = 10 ; i >= 1; i--) {
			System.out.printf("Tente adivinhar o n�mero sorteado, voc� tem %d tentativa(s). %n", i);
			chute = in.nextInt();
			if(chute == aleatorio) {
				System.out.printf("Parab�ns!!! voc� acertou!! O n�mero sorteado foi %d!!%n", aleatorio);
				i=0;
			}else if(chute < aleatorio && i > 1) {
				System.out.printf("Que pena, voc� n�o acertou! O n�mero sorteado � maior que %d. %n", chute);
			}else if(chute > aleatorio && i > 1) {
				System.out.printf("Que pena, voc� n�o acertou! O n�mero sorteado � menor que %d %n", chute);
			}else {
				System.out.printf("Que pena, voc� n�o acertou e n�o possui mais nenhuma tentativa. O n�mero sorteado foi %d. %n", aleatorio);
			}
		}
		
		in.close();
	}

}
