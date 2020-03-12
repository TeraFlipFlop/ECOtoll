package Controller;

import model.Tariffe;
import model.DAO.TariffeDAO;

public class TariffeCTRL {


	public Tariffe createTariffe() {
		
		return new TariffeDAO().buildTariffe();
	};
	public void modtariffe(Tariffe t) {
		new TariffeDAO().update(t);
	}

	

}
