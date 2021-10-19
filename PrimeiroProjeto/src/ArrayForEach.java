public class ArrayForEach {

	public static void main(String[] args) {
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int soma = 0;
        int maior = 0;
        int menor = 0;
        float media;
        
        for(int numero : array){
            soma += numero; 
            if(numero > maior){
                maior = numero;
            }
            if(numero < menor || menor == 0){
                menor = numero;
            }
        }
        
        media = soma / array.length;
        
        System.out.printf("Soma = %d%nMaior número = %d%nMenor número = %d%nMédia = %.2f%n"  , soma, maior, menor, media);   
        }
    }