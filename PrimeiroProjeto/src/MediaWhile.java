import java.util.Scanner;

public class MediaWhile {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		float nota = 0.0f;
		float media = 0.0f;
		int quantidade = 0;
		
		while(nota!=-1) {
			
			System.out.println("Digite a proxima nota, ou digite -1 para encerrar");
			nota = in.nextFloat();
			
			if (nota!=-1) {
				
				if (nota >=0 && nota <= 10) {
					media += nota;
					quantidade ++;
					
				}else {
					System.out.println("Valor da nota inválido!");
				}
				
			}else {
				media = media/quantidade;
				in.close();
			}			
		}
		
		System.out.printf("Foram digitadas %d notas, e a média do aluno é %.2f", quantidade, media);	

	}
}
