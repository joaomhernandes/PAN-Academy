import java.util.Scanner;
public class maiorMenor {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in); 
		  System.out.println("Digite o 1� n�mero");
		  int num1 = in.nextInt(); 
		  int maior = num1, menor = num1;
		  System.out.println("Digite o 2� n�mero");
		  int num2 = in.nextInt(); 
		  if(num2>maior){
			  maior=num2;
		  }
		  if(num2<menor){
			  menor=num2;
		  }
		  System.out.println("Digite o 3� n�mero");
		  int num3 = in.nextInt(); 
		  if(num3>maior){
			  maior=num3;
		  }
		  if(num3<menor){
			  menor=num3;
		  }
		  in.close();
		  
		  
		  System.out.println("O maior n�mero �: " + maior + " e o menor n�mero �: " + menor);
	 
	  } 
	}