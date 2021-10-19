import java.util.ArrayList;

public class ArrayParImpar {

	public static void main(String[] args) {
        int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101, 125};

        ArrayList<Integer> par = new ArrayList<Integer>();
        ArrayList<Integer> impar = new ArrayList<Integer>();
       
        for(int numero : array2){
            if(numero %2 ==0){
                par.add(numero);
            }else{
                impar.add(numero*2);
            }
        }
        for(int numero : par){
            System.out.println(numero);
        }
        
        System.out.println("-----------------------------------------------------------------");
        
        for(int numero : impar){
            System.out.println(numero);
        }        
        
        }
    }