package HerancaPolimorfismo;

public class Animais implements Habilidades {
	private String nome;
	private String cor;
	private String sexo;
	private String alimentacao;
	private float peso;
	private float altura;
	private boolean dormindo;
	private boolean andando;
	
	public Animais() {
		
	};
	
	public Animais(String nome, String cor, String sexo, String alimentacao, float peso, float altura, boolean dormindo, boolean andando) {
		this.nome = nome;
		this.cor = cor;
		this.sexo = sexo;
		this.alimentacao = alimentacao;
		this.peso = peso;
		this.altura = altura;
		this.dormindo = dormindo;
		this.andando = andando;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public boolean isDormindo() {
		return dormindo;
	}

	public void setDormindo(boolean dormindo) {
		this.dormindo = dormindo;
	}
	
	public boolean isAndando() {
		return andando;
	}

	public void setAndando(boolean andando) {
		this.andando = andando;
	}
	
	@Override
	public void acordar() {
		if (isDormindo()) {
			this.setDormindo(false);
			System.out.println(getNome() +" est� acordando!");
		}else {
			System.out.println(getNome() + " j� est� acordado!");
		}
	}
	
	
	@Override
	public void dormir() {
		if (!isDormindo()) {
			this.setDormindo(true);
			System.out.println(getNome() + " est� indo dormir!");
		}else {
			System.out.println("ZzZzZzZz - "+ getNome() +" n�o est� respondendo pois est� dormindo!");
		}
	}

	
	@Override
	public void andar() {
		if (!isAndando()) {
			this.setAndando(true);
			System.out.println(getNome() +" est� come�ando � andar!");
		}else {
			System.out.println(getNome() +" j� est� andando!");
		}
	}
	
	@Override
	public void parar() {
		if (isAndando()) {
			this.setAndando(false);
			System.out.println(getNome() + " est� parando para descan�ar!");
		}else {
			System.out.println(getNome() + " j� est� parado!");
		}
	}

	
}
