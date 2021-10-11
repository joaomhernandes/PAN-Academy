import java.util.Scanner;
public class MediaNotas {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in); 
		  float nota = 0f;
		  float media = 0f;
		  for(int i = 1; i<=2; i++){
			  System.out.println("Digite a " + i + "ª nota.");
			  nota = in.nextFloat();
			  media += nota;
		  }
		  media /= 2;
		  if (media == 10.0){
			  System.out.println("Aprovado com Distição");
		  } else if(media >= 7.0){
			  System.out.println("Aprovado");
		  } else {
			  System.out.println("Reprovado");
		  }
			    
		  in.close(); 

	}

}
