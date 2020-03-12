package Controller;

import model.Veicolo;
import model.DAO.VeicoloDAO;

public class VeicoloCTRL {
	

public Veicolo getv() {
	return  new VeicoloDAO().getV();}


}
