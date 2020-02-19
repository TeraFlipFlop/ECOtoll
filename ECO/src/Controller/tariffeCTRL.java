package Controller;

import DAO.TariffeDAO;
import eco.Tariffe;

public class tariffeCTRL {


	public Tariffe createTariffe() {
		
		return new TariffeDAO().buildTariffe();
	};
	
	

}
