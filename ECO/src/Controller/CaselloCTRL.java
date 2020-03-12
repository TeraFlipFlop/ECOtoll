package Controller;

import java.util.ArrayList;

import model.DAO.CaselloDAO;
import model.components.Autostrada;
import model.components.Casello;

public class CaselloCTRL {
public ArrayList<Casello> getCaselli(Autostrada a){
	return new CaselloDAO().getCaselli(a);
	}
public Casello getCaselli(String cod) {
	return new CaselloDAO().getCasello(cod);
}


public void modCasello(Casello casello) {
new CaselloDAO().update(casello);}



}
