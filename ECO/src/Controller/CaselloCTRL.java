package Controller;

import java.util.ArrayList;

import DAO.CaselloDAO;
import eco.Autostrada;
import eco.Casello;

public class CaselloCTRL {
public ArrayList<Casello> getCaselli(Autostrada a){
	return new CaselloDAO().getCaselli(a);
	}
public Casello getCaselli(String cod) {
	return new CaselloDAO().getCasello(cod);
}
}
