package ArrayMedia;

public class ArrayMedia extends Aluno{

	public static void main(String[] args) {
		double[] notas = {10, 5.0, 7.0, 9.0, 10.0};
		double[] notas2 = {5.0, 4.0, 7.0, 3.0, 6.5};
		Aluno aluno = new Aluno("Jo�o", notas);
		
		System.out.printf("Maior nota = %.1f%nMedia = %.1f%nO aluno %s foi %s%n%n", aluno.maiorNota(), aluno.mediaNotas(), aluno.getNome(), aluno.aprovado() );
		
		Aluno aluno2 = new Aluno("Pedro", notas2);
		
		System.out.printf("Maior nota = %.1f%nMedia = %.1f%nO aluno %s foi %s%n%n", aluno2.maiorNota(), aluno2.mediaNotas(), aluno2.getNome(), aluno2.aprovado() );
	}

}

//Crie de  uma classe Aluno com os seguintes atributos e m�todos: -String nome,
//double[] notas,  aprovado(), maiorNota() e media() (al�m dos getters e setters
//necess�rios).
//dadas as notas: double[] notas = {10, 5.0, 7.0, 9.0, 10.0};, retorne as seguintes
//observa��es sobre o aluno: a maior nota, m�dia e caso m�dia maior que 7 =
//aprovado.