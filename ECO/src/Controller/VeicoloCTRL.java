package Controller;

import model.DAO.VeicoloDAO;
import model.components.Veicolo;

public class VeicoloCTRL {
	

public Veicolo getv() {
	return  new VeicoloDAO().getV();}


}
