import java.util.Scanner;
public class ClassificaTriangulo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lado1, lado2, lado3;
		
		System.out.println("Digite o 1� lado do tri�ngulo");
		lado1 = in.nextInt();
		System.out.println("Digite o 2� lado do tri�ngulo");
		lado2 = in.nextInt();
		System.out.println("Digite o 3� lado do tri�ngulo");
		lado3 = in.nextInt();
		
		if (lado1 == lado2 && lado1== lado3) {
			System.out.println("Tri�ngulo Equil�tero");
		}else if ((lado1 == lado2 && lado1 != lado3) || (lado1 != lado2 && lado1 == lado3) || (lado1 != lado2 && lado2 == lado3)) {
			System.out.println("Tri�ngulo Is�celes");
		}else {
			System.out.println("Tri�ngulo Escaleno");
		}

	}

}
