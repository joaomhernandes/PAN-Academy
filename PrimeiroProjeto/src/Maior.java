import javax.swing.JOptionPane;

public class Maior {

	public static void main(String[] args) {
		
		int numero = 0;
		int maior = 0;
		
		
		for(int i = 1; i <= 10; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+ i +"� n�mero"));
			if(numero > maior || i == 1) {
				maior = numero;
			}			
		}
		
		JOptionPane.showMessageDialog(null,"O maior dos 10 n�meros digitados foi o n�mero " + maior );
	}

}