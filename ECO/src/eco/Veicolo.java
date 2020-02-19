package eco;


enum ClasseAmbienale{Euro1,Euro2,Euro3,Euro4,Euro5,Euro6}
abstract class  Veicolo {
public String targa,modello,marca;
public int anno, peso, co2, assi;
public double altezza;
ClasseAmbienale classeAmbientale;


//costruttore per classe ambientale e classe by numero assi e QtaCO2


public Veicolo(String targa, String modello, String marca, int anno, int peso, int co2, int assi, ClasseAmbienale classeAmbientale2,
		double altezza) {
	this.targa = targa;
	this.modello = modello;
	this.marca = marca;
	this.anno = anno;
	this.peso = peso;
	this.co2 = co2;
	this.assi = assi;
	this.classeAmbientale = classeAmbientale2;
	this.altezza = altezza;
}

public String getTarga() {
	return targa;
}
public void setTarga(String targa) {
	this.targa = targa;
}
public String getModello() {
	return modello;
}
public void setModello(String modello) {
	this.modello = modello;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public int getAnno() {
	return anno;
}
public void setAnno(int anno) {
	this.anno = anno;
}
public int getPeso() {
	return peso;
}
public void setPeso(int peso) {
	this.peso = peso;
}
public int getCo2() {
	return co2;
}
public void setCo2(int co2) {
	this.co2 = co2;
}
public int getAssi() {
	return assi;
}
public void setAssi(int assi) {
	this.assi = assi;
}

public ClasseAmbienale getClasseAmbientale() {
	return classeAmbientale;
}

public void setClasseAmbientale(ClasseAmbienale classeAmbientale) {
	this.classeAmbientale = classeAmbientale;
}

public double getAltezza() {
	return altezza;
}
public void setAltezza(double altezza) {
	this.altezza = altezza;
}











}
