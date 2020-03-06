package model;
import java.util.*;
import interfaces.AutostradaInter;

enum  Tipologia {pianura, montagna};
public class Autostrada implements AutostradaInter {
	private ArrayList<Casello> caselli;
	private String id;
	private double [] tariffe=new double[5];
	private Tipologia tipoAutostrada;
	
	
	public Autostrada(ArrayList<Casello> caselli, String id, double[] tariffa, Tipologia tipologia) {
		
		this.caselli = caselli;
		this.id = id;
		this.setTariffe(tariffa);
		this.tipoAutostrada = tipologia;
	}

	public Autostrada(ArrayList<Casello> caselli, String id, double[] tariffa, String tipologia) {
		
		this.caselli = caselli;
		this.id = id;
		this.setTariffe(tariffa);
		if(tipologia.equals("montagna"))
		this.tipoAutostrada = Tipologia.montagna;
		if(tipologia.equals("pianura"))
		this.tipoAutostrada = Tipologia.pianura;
		
	}

	
	
	public ArrayList<Casello> getCaselli() {
		return caselli;
	}


	public void setCaselli(ArrayList<Casello> caselli) {
		this.caselli = caselli;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}



	public Tipologia getTipoAutostrada() {
		return tipoAutostrada;
	}

	public String getTipoAutostrada(Tipologia t) {
		String tipoAutostrada="";
		if(this.tipoAutostrada.equals(Tipologia.montagna))
			tipoAutostrada = "montagna";
			if(this.tipoAutostrada.equals(Tipologia.pianura))
				tipoAutostrada = "pianura";
			
		
		return tipoAutostrada;
	}


	public void setTipoAutostrada(Tipologia tipoAutostrada) {
		this.tipoAutostrada = tipoAutostrada;
	}

	public void setTipoAutostrada(String tipoAutostrada) {
		Autostrada a =new Autostrada(null,null,null,tipoAutostrada);
		
		this.tipoAutostrada = a.tipoAutostrada;
	}
	

	@Override
	public void addCasello(Casello a ) {
		this.caselli.add(a);

	}

	@Override
	public void removeCasello(Casello a) {
	this.caselli.remove(a);

	}


	public double [] getTariffe() {
		return tariffe;
	}


	public void setTariffe(double [] tariffe) {
		this.tariffe = tariffe;
	}

}
