import java.util.Scanner;
public class Primo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num = 0;
		boolean primo = true;
		int divisores = 1;
		
		System.out.println("Digite o numero que deseja verificar se � primo.");
		num = in.nextInt();
		in.close();
		
		for(int i = 2; i < num; i++) {
				if (num % i == 0) {
					divisores++;
				}
				if(divisores >= 2) {
					primo = false;
					i = num;
				}
			}
		
		if(primo) {
			System.out.printf("%d � um n�mero primo", num);
		}else{
			System.out.printf("%d n�o � um n�mero primo", num);
		}
	
	}

}
