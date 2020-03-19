package model.components;

public class Classe5 extends Veicolo {

	public Classe5(String targa, String modello, String marca, int anno, int peso, double co22, int assi,
			ClasseAmbienale classeAmbientale2, int altezza) {
		super(targa, modello, marca, anno, peso, co22, assi, classeAmbientale2, altezza);
		// TODO Auto-generated constructor stub
	}

	public Classe5() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Classe5(Veicolo v) {
		this.targa = v.targa;
		this.modello = v.modello;
		this.marca = v.marca;
		this.anno =v.anno;
		this.peso = v.peso;
		this.co2 = v.co2;
		this.assi = v.assi;
		this.classeAmbientale = null;
		this.altezza = v.altezza;
		setClasseAmbientale();
	}
}
