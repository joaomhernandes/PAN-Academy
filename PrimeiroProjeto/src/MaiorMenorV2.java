import java.util.Scanner;
public class MaiorMenorV2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		  int num = 0;
		  int maior = 0;
		  int menor = 0;
		  for (int i = 1; i <= 3; i++){
			 System.out.println("Digite o " + i + "� n�mero");
			  num = in.nextInt();
			  if(num>maior){
				  maior = num;
			  }
			  if((num < menor) || (i==1)){
				  menor = num;
			  }		  
		  }	  
		  in.close(); 
		  
		  System.out.println("O maior n�mero �: " + maior + " e o menor n�mero �: " + menor);

	}

}
