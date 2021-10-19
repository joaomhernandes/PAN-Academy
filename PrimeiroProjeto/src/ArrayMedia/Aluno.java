package ArrayMedia;

public class Aluno {
	private String nome;
	private double [] notas;
	
	public Aluno(String nome, double[] notas) {
		this.nome = nome;
		this.notas = notas;		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double maiorNota() {
		double maiorNota = 0;
		for(double nota : getNotas()) {if(nota > maiorNota) {maiorNota = nota;}}
		return maiorNota;
	}
	
	public double mediaNotas() {
		double mediaNotas = 0;
		for(double nota : getNotas()) {mediaNotas += nota;}
		mediaNotas = mediaNotas / getNotas().length;
		return mediaNotas;
	}
	
	public String aprovado() {
		if(mediaNotas() > 7) { return "APROVADO";}else return "REPROVADO";
	}
	
}
