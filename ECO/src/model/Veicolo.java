package model;


enum ClasseAmbienale{Euro1,Euro2,Euro3,Euro4,Euro5,Euro6}
public abstract class  Veicolo {
public String targa,modello,marca;
public int anno, peso, assi;
double co2;
int altezza;
ClasseAmbienale classeAmbientale;


//costruttore per classe ambientale e classe by numero assi e QtaCO2


public Veicolo(String targa, String modello, String marca, int anno, int peso, double co22, int assi, ClasseAmbienale classeAmbientale2,
		int altezza) {
	this.targa = targa;
	this.modello = modello;
	this.marca = marca;
	this.anno = anno;
	this.peso = peso;
	this.co2 = co22;
	this.assi = assi;
	this.classeAmbientale = classeAmbientale2;
	this.altezza = altezza;
}
public Veicolo() {
	this.targa = null;
	this.modello = null;
	this.marca = null;
	this.anno = 0;
	this.peso = 0;
	this.co2 = 0;
	this.assi = 0;
	this.classeAmbientale = null;
	this.altezza = 0;
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
public double getCo2() {
	return co2;
}
public void setCo2(double co2) {
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

public void setClasseAmbientale() {
	if (this.co2>10) this.classeAmbientale=classeAmbientale.Euro1;
	if (this.co2<=10 && this.co2>8 ) this.classeAmbientale=classeAmbientale.Euro2;
	if (this.co2<=8 && this.co2>6 ) this.classeAmbientale=classeAmbientale.Euro3;
	if (this.co2<=6 && this.co2>4 ) this.classeAmbientale=classeAmbientale.Euro4;
	if (this.co2<=4 && this.co2>2 ) this.classeAmbientale=classeAmbientale.Euro4;
	if (this.co2<2)this.classeAmbientale=classeAmbientale.Euro6;
}

public int getAltezza() {
	return altezza;
}
public void setAltezza(int altezza) {
	this.altezza = altezza;
}











}
