package eco;

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

	@Override
	public double tariffaFinale(ClasseA a) {
		
		return arrotondamento(this.tarParziale(a)+(this.tarParziale(a)*this.iva/100 ));
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
