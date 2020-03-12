package model;

import model.interfaces.Casellointer;

public class Casello implements Casellointer {
private int km;
private String nome;
private String idAuto;



public Casello(int km, String nome, String id) {

	this.km = km;
	this.nome = nome;
	this.idAuto = id;
}


public int getKm() {
	return km;
}
public void setKm(int km) {
	this.km = km;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getId() {
	return idAuto;
}
public void setId(String id) {
	this.idAuto = id;
}

}
