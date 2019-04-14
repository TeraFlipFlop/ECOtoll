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
		
		return a;
	}

	@Override
	public double tariffaFinale(ClasseA a) {
		
		return arrotondamento(this.tarParziale(0)+(this.tarParziale(0)*this.iva/100 ));
	}

	@Override
	public double tariffaFinale(ClasseB a) {
		
		return arrotondamento(this.tarParziale(1)+(this.tarParziale(1)*this.iva/100 ));
	}

	@Override
	public double tariffaFinale(Classe3 a) {
		return arrotondamento(this.tarParziale(2)+(this.tarParziale(2)*this.iva/100 ));
	}

	@Override
	public double tariffaFinale(Classe4 a) {
		return arrotondamento(this.tarParziale(3)+(this.tarParziale(3)*this.iva/100 ));
	}

	@Override
	public double tariffaFinale(Classe5 a) {
		return arrotondamento(this.tarParziale(4)+(this.tarParziale(4)*this.iva/100 ));
	}

	public double tarParziale(int i){return this.percorso.KmPercorsi() *(this.autostrada.getTariffe()[i]); }
	

}
