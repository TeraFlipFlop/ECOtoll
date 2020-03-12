package model.interfaces;

import model.Classe3;
import model.Classe4;
import model.Classe5;
import model.ClasseA;
import model.ClasseB;
import model.Veicolo;

public interface PedaggioInter {

public double arrotondamento(double a);
public double tariffaFinale (ClasseA a);
public double tariffaFinale (ClasseB a);
public double tariffaFinale (Classe3 a);
public double tariffaFinale (Classe4 a);
public double tariffaFinale (Classe5 a);


}