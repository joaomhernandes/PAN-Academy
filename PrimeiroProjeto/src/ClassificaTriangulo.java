import java.util.Scanner;
public class ClassificaTriangulo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lado1, lado2, lado3;
		
		System.out.println("Digite o 1º lado do triângulo");
		lado1 = in.nextInt();
		System.out.println("Digite o 2º lado do triângulo");
		lado2 = in.nextInt();
		System.out.println("Digite o 3º lado do triângulo");
		lado3 = in.nextInt();
		
		if (lado1 == lado2 && lado1== lado3) {
			System.out.println("Triângulo Equilátero");
		}else if ((lado1 == lado2 && lado1 != lado3) || (lado1 != lado2 && lado1 == lado3) || (lado1 != lado2 && lado2 == lado3)) {
			System.out.println("Triângulo Isóceles");
		}else {
			System.out.println("Triângulo Escaleno");
		}

	}

}
