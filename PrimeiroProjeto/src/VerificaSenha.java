import java.util.Scanner;
public class VerificaSenha {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in); 
		  int senha = 0;
		  System.out.println("Digite sua senha");
			  senha = in.nextInt();
			  if(senha == 1234){
				  System.out.println("ACESSO AUTORIZADO");
			  } else{
				  System.out.println("ACESSO NEGADO");
			  }
			    
		  in.close(); 


	}

}
