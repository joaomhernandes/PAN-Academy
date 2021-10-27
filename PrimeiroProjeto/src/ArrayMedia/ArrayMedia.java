package ArrayMedia;

public class ArrayMedia extends Aluno{

	public static void main(String[] args) {
		double[] notas = {10, 5.0, 7.0, 9.0, 10.0};
		double[] notas2 = {5.0, 4.0, 7.0, 3.0, 6.5};
		Aluno aluno = new Aluno("João", notas);
		
		System.out.printf("Maior nota = %.1f%nMedia = %.1f%nO aluno %s foi %s%n%n", aluno.maiorNota(), aluno.mediaNotas(), aluno.getNome(), aluno.aprovado() );
		
		Aluno aluno2 = new Aluno("Pedro", notas2);
		
		System.out.printf("Maior nota = %.1f%nMedia = %.1f%nO aluno %s foi %s%n%n", aluno2.maiorNota(), aluno2.mediaNotas(), aluno2.getNome(), aluno2.aprovado() );
	}

}

//Crie de  uma classe Aluno com os seguintes atributos e métodos: -String nome,
//double[] notas,  aprovado(), maiorNota() e media() (além dos getters e setters
//necessários).
//dadas as notas: double[] notas = {10, 5.0, 7.0, 9.0, 10.0};, retorne as seguintes
//observações sobre o aluno: a maior nota, média e caso média maior que 7 =
//aprovado.