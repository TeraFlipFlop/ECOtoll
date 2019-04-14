package eco;
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


	public void setTipoAutostrada(Tipologia tipoAutostrada) {
		this.tipoAutostrada = tipoAutostrada;
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
