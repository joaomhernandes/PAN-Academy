public class ContagemDiferenciada {

	public static void main(String[] args) {
		
		for(int i = 233; i <= 456;) {
			System.out.println(i);
			if(i < 300 || i > 400) {
				i+=3;
			}else i+=5;
		}
	}
}