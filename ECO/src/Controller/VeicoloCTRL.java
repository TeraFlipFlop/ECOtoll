package Controller;

import DAO.VeicoloDAO;

import model.Veicolo;

public class VeicoloCTRL {
	

public Veicolo getv() {
	return  new VeicoloDAO().getV();}


}
