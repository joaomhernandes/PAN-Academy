import java.util.Scanner;

public class VerificaTriangulo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro �ngulo do triangulo");
		int angulo1 = in.nextInt();
		System.out.println("Digite o segundo �ngulo do triangulo");
		int angulo2 = in.nextInt();
		System.out.println("Digite o terceiro �ngulo do triangulo");
		int angulo3 = in.nextInt();
		in.close();
		if ( angulo1 + angulo2 + angulo3 != 180) {
			System.out.println("N�o � um tri�ngulo");
		}else if(angulo1 == 90 || angulo2 == 90 || angulo3 ==90) {
			System.out.println("Tri�ngulo Ret�ngulo");
			}else if(angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
			System.out.println("Tri�ngulo Obtus�ngulo");
			}else {
			System.out.println("Tri�ngulo Acut�ngulo");
			}

		}
		
	}