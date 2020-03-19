package Controller;

import javax.swing.JTextField;

import model.DAO.VeicoloDAO;
import model.components.Veicolo;

public class VeicoloCTRL {
	

public Veicolo getv() {
	return  new VeicoloDAO().getV();}

public Veicolo getv(String string) {
	return new VeicoloDAO().getV(string);
	
}


}
