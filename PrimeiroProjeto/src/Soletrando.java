import java.util.Scanner;

public class Soletrando {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String palavra = new String();
		
		System.out.println("Digite a palavra que deseja que seja soletrada.");
		palavra = in.nextLine();
		in.close();
		
		for(int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}

	}

}
