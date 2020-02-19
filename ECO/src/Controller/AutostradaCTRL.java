package Controller;

import DAO.AutostradaDAO;
import eco.Autostrada;

public class AutostradaCTRL {
	public Autostrada buildAuto(String id) {
		
		
		return new AutostradaDAO().createAutostrada(id);
		
		
	}

}
