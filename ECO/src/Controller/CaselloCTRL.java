package Controller;

import java.util.ArrayList;

import DAO.CaselloDAO;
import eco.Autostrada;
import eco.Casello;

public class CaselloCTRL {
public ArrayList<Casello> buildCasello(Autostrada a){
	return new CaselloDAO().getCaselli(a);
	}
public Casello buildCasello(String cod) {
	return new CaselloDAO().CreateCasello(cod);
}
}
