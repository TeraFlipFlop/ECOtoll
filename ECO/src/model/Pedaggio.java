package model;

import interfaces.PedaggioInter;

public class Pedaggio implements PedaggioInter {
private int iva = 22;
private Percorso percorso;
private Autostrada autostrada;



public Pedaggio(Percorso percorso, Autostrada autostrada) {
	
	this.percorso = percorso;
	this.autostrada = autostrada;
}

public int getIva() {
	return iva;
}

public void setIva(int iva) {
	this.iva = iva;
}

public Percorso getPercorso() {
	return percorso;
}

public void setPercorso(Percorso percorso) {
	this.percorso = percorso;
}

public Autostrada getAutostrada() {
	return autostrada;
}

public void setAutostrada(Autostrada autostrada) {
	this.autostrada = autostrada;
}


	@Override
	public double arrotondamento(double a ) {
		
		return Math.round(a);
	}
	
public double tariffaFinale(Veicolo g) {
		
	if(g.getClass().equals(new ClasseB().getClass() )) {return tariffaFinale((ClasseB)g);}
	if(g.getClass().equals(new ClasseA().getClass() )) {return tariffaFinale((ClasseA)g);}
	if(g.getClass().equals(new Classe3().getClass() )) {return tariffaFinale((Classe3)g);}
	if(g.getClass().equals(new Classe4().getClass() )) {return tariffaFinale((Classe4)g);}
	if(g.getClass().equals(new Classe5().getClass() )) {return tariffaFinale((Classe5)g);}
	return 0;
	}
	

	@Override
	public double tariffaFinale(ClasseA g) {
		
		return arrotondamento(this.tarParziale(g)+(this.tarParziale(g)*this.iva/100 ));
	}

	@Override
	public double tariffaFinale(ClasseB a) {
		
		return arrotondamento(this.tarParziale(a)+(this.tarParziale(a)*this.iva/100 ));
	}

	@Override
	public double tariffaFinale(Classe3 a) {
		return arrotondamento(this.tarParziale(a)+(this.tarParziale(a)*this.iva/100 ));
	}

	@Override
	public double tariffaFinale(Classe4 a) {
		return arrotondamento(this.tarParziale(a)+(this.tarParziale(a)*this.iva/100 ));
	}

	@Override
	public double tariffaFinale(Classe5 a) {
		return arrotondamento(this.tarParziale(a)+(this.tarParziale(a)*this.iva/100 ));
	}

	public double tarParziale(ClasseA a){return this.percorso.KmPercorsi() *(this.autostrada.getTariffe()[1]); }
	public double tarParziale(ClasseB a){return this.percorso.KmPercorsi() *(this.autostrada.getTariffe()[2]); }
	public double tarParziale(Classe3 a){return this.percorso.KmPercorsi() *(this.autostrada.getTariffe()[3]); }
	public double tarParziale(Classe4 a){return this.percorso.KmPercorsi() *(this.autostrada.getTariffe()[4]); }
	public double tarParziale(Classe5 a){return this.percorso.KmPercorsi() *(this.autostrada.getTariffe()[5]); }

}
