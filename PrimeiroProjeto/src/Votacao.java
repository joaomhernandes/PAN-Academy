import java.util.Scanner;
public class Votacao {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in); 
		  int anoNascimento = 0;
		  System.out.println("Digite o ano de seu nascimento");
			  anoNascimento = in.nextInt();
			  if(2021-anoNascimento >= 16){
				  System.out.println("Voc� poder� votar este ano");
			  } else{
				  System.out.println("Voc� n�o poder� votar este ano");
			  }
			    
		  in.close(); 

	}

}
