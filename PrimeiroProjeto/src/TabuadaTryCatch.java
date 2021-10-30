import java.util.InputMismatchException;
import java.util.Scanner;

public class TabuadaTryCatch {

	public static void main(String[] args) {
		tabuada();	
	}
	
	public static void tabuada() {
		
		Scanner in = new Scanner(System.in);
		int num = 1;
		
		System.out.println("Digite um número de 1 a 100 para gerar a tabuada.");
		try {
			num = in.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("ERRO - Digite apenas números inteiros!");
			in.reset();
			tabuada();
		}
		
		if(num < 1 || num > 100) {
			System.out.println("Valor fora do intervalo permitido!");
			in.reset();
			tabuada();						
		}else {
			for(int i = 0; i <= 10; i++) {
				System.out.println(num + "x" + i + " = " + num* i);
			}
			in.reset();
			recomecar();
			in.close();
		}
	}
	
	public static void recomecar() {
		
		Scanner entrada= new Scanner(System.in);
		int op = 2;
		
		System.out.println("Deseja criar uma nova tabuada?\n[0] Sim\n[1] Não ");
		try {
			op = entrada.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("ERRO - Digite apenas números inteiros!");
			entrada.reset();
			recomecar();
		}
		
		if(op!=0 && op!=1) {
			System.out.println("Valor fora do intervalo permitido!");
			entrada.reset();
			recomecar();			
		}else if(op == 0){
			entrada.reset();
			tabuada();			
		}else {
			System.out.println("Até logo!");
			entrada.close();
			System.exit(0);
		}
	}
}
	

