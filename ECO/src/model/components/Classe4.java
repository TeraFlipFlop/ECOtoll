package model.components;

import model.interfaces.Veicolointer;

public class Classe4 extends Veicolo  {

	@Override
	public void setClasseAmbientale() {
		// TODO Auto-generated method stub
		super.setClasseAmbientale();
	}

	@Override
	public int checkClasseV() {
		// TODO Auto-generated method stub
		return super.checkClasseV();
	}

	@Override
	public Veicolo factory(String targa, String modello, String marca, int anno, int peso, double co22, int assi,
			int altezza) {
		// TODO Auto-generated method stub
		return super.factory(targa, modello, marca, anno, peso, co22, assi, altezza);
	}

	public Classe4(String targa, String modello, String marca, int anno, int peso, double co22, int assi,
			ClasseAmbienale classeAmbientale2, int altezza) {
		super(targa, modello, marca, anno, peso, co22, assi, classeAmbientale2, altezza);
		// TODO Auto-generated constructor stub
	}

	public Classe4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classe4(Veicolo v) {
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

	@Override
	public Veicolo factory() {
		// TODO Auto-generated method stub
		return null;
	}

}
