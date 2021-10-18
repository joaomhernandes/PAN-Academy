package HerancaPolimorfismo;

public class Mamiferos extends Animais {
	private boolean filhotes;
	private boolean ornitorrinco;
	
	public Mamiferos() {
		
	}
		
	public Mamiferos(String nome, String cor, String sexo, String alimentacao, float peso, float altura, boolean dormindo,
			boolean andando, boolean filhotes, boolean ornitorrinco) {
		super(nome, cor, sexo, alimentacao, peso, altura, dormindo, andando);
		this.filhotes = filhotes;
		this.ornitorrinco = ornitorrinco;
	}

	public boolean isFilhotes() {
		return filhotes;
	}

	public void setFilhotes(boolean filhotes) {
		this.filhotes = filhotes;
	}

	public boolean isOrnitorrinco() {
		return ornitorrinco;
	}

	public void setOrnitorrinco(boolean ornitorrinco) {
		this.ornitorrinco = ornitorrinco;
	}

	@Override
	public void amamentar() {
		if (getSexo() == "feminino" && isFilhotes()) {
			System.out.println(getNome() + " amamentou os filhotes!");;
		}else {
			System.out.println(getNome() +" não pode amamentar!");
		}
	}
	
	@Override
	public void botarOvos() {
		if (getSexo() == "feminino" && isOrnitorrinco()) {
			System.out.println(getNome() +" botou ovos!");;
		}else {
			System.out.println(getNome() +" não pode botar ovos!");
		}
	}
	
}
