package HerancaPolimorfismo;

public class TesteAnimais {

	public static void main(String[] args) {
		Passaros pato = new Passaros();
		pato.setNome("pato");
		pato.setSexo("feminino");
		pato.setAlimentacao("Herbívoro");
		pato.setAltura(1.5f);
		pato.setAndando(false);
		pato.setCor("Marrom");
		pato.setDormindo(false);
		pato.setPeso(0.5f);
		pato.setPodeVoar(true);
		pato.setTamanhoAsas(1.5f);
		pato.setVoando(false);
		
		pato.voar();
		pato.pousar();
		pato.botarOvos();
		
		Mamiferos gato = new Mamiferos("gato","Amarela", "feminino", "Carnívoro", 5, 0.3f, true, false, true, false);
		Mamiferos ornitorrinco = new Mamiferos("ornitorrinco","Marrom", "feminino", "Onívoro", 3, 0.5f, true, false, false, true);
		Passaros galo = new Passaros("galo", "Preta", "Masculino", "Onívoro", 1, 0.5f, false, false, 0.7f, false, false);
		
		gato.parar();
		
		gato.acordar();
		gato.amamentar();
		gato.botarOvos();
		ornitorrinco.acordar();
		ornitorrinco.parar();
		ornitorrinco.botarOvos();
		ornitorrinco.amamentar();
		galo.botarOvos();
		galo.voar();
		
		
		
		

	}

}
