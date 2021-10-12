import java.util.Scanner;

public class Poligono {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o número de lados do polígono");
		int numLados = in.nextInt();
		in.close();
		if (numLados <= 2) {
			System.out.println("Não é um polígono");
		}else if(numLados > 5) {
			System.out.println("Polígono inválido");
		}else {
			System.out.println("Poígono válido!");
		}
	}
}



