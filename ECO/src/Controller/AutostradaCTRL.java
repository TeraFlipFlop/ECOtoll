package Controller;

import java.util.ArrayList;

import model.DAO.AutostradaDAO;
import model.components.Autostrada;

public class AutostradaCTRL {
	public Autostrada getAutostrada(String id) {
		
		
		return new AutostradaDAO().getAutostrada(id);
		
		
	}

	public ArrayList<String> getCodAutostrada() {
		return new AutostradaDAO().getCod();
	}
		public ArrayList<Autostrada> getAutostrada() {
		return new AutostradaDAO().getAutostrada();
			
			
		}

		public void modAutostrada(Autostrada a) {
			// TODO Auto-generated method stub
			
		}

		

}
