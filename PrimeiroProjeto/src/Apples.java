import java.util.Scanner;
public class Apples {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a quantidade de ma��s que deseja?");
		int qntMacas = in.nextInt();
		final float precoNormal = 0.30f;
		final float precoPromo = 0.25f;
		float total = 0.0f;
		
		if (qntMacas >= 12) {
			total = precoPromo * qntMacas;			
			System.out.printf("Suas ma��s ter�o pre�o promocional e sua compra ficar�: R$%.2f", total );
		}else {
			total = precoNormal * qntMacas;
			System.out.printf("Sua compra ficar�: R$%.2f", total);
		}
	}

}
