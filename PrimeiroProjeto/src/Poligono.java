import java.util.Scanner;

public class Poligono {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o n�mero de lados do pol�gono");
		int numLados = in.nextInt();
		in.close();
		if (numLados <= 2) {
			System.out.println("N�o � um pol�gono");
		}else if(numLados > 5) {
			System.out.println("Pol�gono inv�lido");
		}else {
			System.out.println("Po�gono v�lido!");
		}
	}
}



