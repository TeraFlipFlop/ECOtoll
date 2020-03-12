package Controller;

import java.util.ArrayList;

import model.Autostrada;
import model.Casello;
import model.DAO.CaselloDAO;

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
