import java.util.Scanner;

public class PesquisaHabitantes {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int familias = 0;
		int filhos = 0;
		float mediaFilhos = 0.0f;
		float salario = 0.0f;
		float mediaSalario = 0.0f;
		float maiorSalario = 0.0f;
		float percentualSalario = 0.0f;
		
		
		System.out.printf("Digite o número de famílias entrevistadas%n");
		familias = in.nextInt();
		
		for(int i = 1; i <= familias; i++ ) {
			System.out.printf("Familia %d%nDigite o numero de filhos que você possui.%n", i);
			filhos = in.nextInt();
			System.out.printf("Familia %d%nDigite o o valor de seu salário.%n", i);
			salario = in.nextFloat();
			mediaFilhos += filhos;
			mediaSalario += salario;
			if (salario > maiorSalario || i == 0) maiorSalario = salario;
			if (salario <= 100 ) percentualSalario++;
		}
		
		mediaFilhos = mediaFilhos/familias;
		mediaSalario = mediaSalario/familias;
		percentualSalario = percentualSalario/familias*100;
		in.close();
		
		System.out.printf("A média de filhos é: %.2f.%nA média so salário é: R$%.2f.%nO maior salário é: RS%.2f.%nO percentual de pessoas que recebem até R$100,00 é: %.2f%%.", mediaFilhos, mediaSalario, maiorSalario, percentualSalario);

	}
}