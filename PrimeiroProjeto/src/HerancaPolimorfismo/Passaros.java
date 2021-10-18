package HerancaPolimorfismo;

public class Passaros extends Animais{
	private float tamanhoAsas;
	private boolean podeVoar;
	private boolean voando;

	
public Passaros() {

}
	
public Passaros(String nome, String cor, String sexo, String alimentacao, float peso, float altura, boolean dormindo,
			boolean andando, float tamanhoAsas, boolean podeVoar, boolean voando) {
		super(nome, cor, sexo, alimentacao, peso, altura, dormindo, andando);
		this.tamanhoAsas = tamanhoAsas;
		this.podeVoar = podeVoar;
		this.voando = voando;
	}

public float getTamanhoAsas() {
	return tamanhoAsas;
}

public void setTamanhoAsas(float tamanhoAsas) {
	this.tamanhoAsas = tamanhoAsas;
}

public boolean isPodeVoar() {
	return podeVoar;
}

public void setPodeVoar(boolean podeVoar) {
	this.podeVoar = podeVoar;
}

public boolean isVoando() {
	return voando;
}

public void setVoando(boolean voando) {
	this.voando = voando;
}

@Override
public void voar() {
	if (!isVoando() && isPodeVoar()) {
		this.setVoando(true);
		System.out.println(getNome() +" está decolando!");
		
	}else if(isVoando()) {
		System.out.println(getNome() +" já está voando!");
	}else {
		System.out.println(getNome() +" não consegue voar");
	}
}

@Override
public void pousar() {
	if (isVoando()) {
		this.setVoando(false);
		System.out.println(getNome() +" esta pousando!");
	}else {
		System.out.println(getNome() +" já está pousado!");
	}
}

@Override
public void botarOvos() {
	if (getSexo() == "feminino") {
		System.out.println( getNome() +" botou ovos!");;
	}else {
		System.out.println(getNome() +" não pode botar ovos!");
	}
}

}