package model.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import Controller.AutostradaCTRL;
import Controller.CaselloCTRL;
import Controller.TariffeCTRL;
import model.components.Autostrada;
import model.components.Casello;
import model.components.Database;



public class AutostradaDAO {
	
	public Autostrada getAutostrada(String id) {
		
		String cod = "";
		String tipologia= "";
		java.sql.PreparedStatement st = null;
		Connection con = new Database().Connect();
		String sql = "select * from autostrada where Codice ='"+id+"' " ;
		
		try {
			st = con.prepareStatement(sql);
			
		ResultSet res	=null;

		 st.execute();
		 res = st.getResultSet();
		
			while(res.next()) {
				
				 cod=res.getString("codice");
				 tipologia= res.getString("tipo");
				

		}
		

		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
		Autostrada b = new Autostrada (null,cod,null,tipologia);
		
		 if (tipologia.equals("pianura")) {
		 b.setTariffe(new TariffeCTRL().createTariffe().getTariffaP());
		 b.setCaselli(new CaselloCTRL().getCaselli(b));
		 
		 }
		
		 if (tipologia.equals("montagna")) {
		 b.setTariffe(new TariffeCTRL().createTariffe().getTariffaM());
		 b.setCaselli(new CaselloCTRL().getCaselli(b));
		 }
		
		
		 return b;
	}

	public ArrayList<String> getCod() {
		
		String cod = "";
		ArrayList<String> a =new ArrayList<String>();
		
		
		
		java.sql.PreparedStatement st = null;
		Connection con = new Database().Connect();
		
		

		String sql = "select codice from autostrada  " ;
		
		try {
			st = con.prepareStatement(sql);
			
		ResultSet res	=null;

		 st.execute();
		 res = st.getResultSet();
		
			while(res.next()) {
				
				 cod=res.getString("codice");
				
				a.add(cod);

		}
		

		} catch (SQLException e1) {
		
			e1.printStackTrace();
		}
		
		return a;
	}
	
	
	public ArrayList<Autostrada> getAutostrada() {
		 ArrayList<Autostrada> a=new ArrayList<Autostrada>();
		 ArrayList<String>c = new AutostradaDAO().getCod();
		 for(String s:c) {
			 a.add(new AutostradaDAO().getAutostrada(s));
			 }
		 return a;
	}}
	

