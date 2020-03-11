package Controller;

import DAO.TariffeDAO;
import model.Tariffe;

public class TariffeCTRL {


	public Tariffe createTariffe() {
		
		return new TariffeDAO().buildTariffe();
	};
	public void modtariffe(Tariffe t) {
		new TariffeDAO().update(t);
	}

	

}
