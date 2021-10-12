import java.util.Scanner;

public class VerificaTriangulo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro ângulo do triangulo");
		int angulo1 = in.nextInt();
		System.out.println("Digite o segundo ângulo do triangulo");
		int angulo2 = in.nextInt();
		System.out.println("Digite o terceiro ângulo do triangulo");
		int angulo3 = in.nextInt();
		in.close();
		if ( angulo1 + angulo2 + angulo3 != 180) {
			System.out.println("Não é um triângulo");
		}else if(angulo1 == 90 || angulo2 == 90 || angulo3 ==90) {
			System.out.println("Triângulo Retângulo");
			}else if(angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
			System.out.println("Triângulo Obtusângulo");
			}else {
			System.out.println("Triângulo Acutângulo");
			}

		}
		
	}