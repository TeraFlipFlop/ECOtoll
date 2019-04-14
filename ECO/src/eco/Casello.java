package eco;


public class Casello {
private int km;
private String nome;
private int id;



public Casello(int km, String nome, int id) {

	this.km = km;
	this.nome = nome;
	this.id = id;
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
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
