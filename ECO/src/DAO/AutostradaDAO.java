package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Controller.CaselloCTRL;
import Controller.tariffeCTRL;
import eco.Autostrada;
import eco.Casello;
import eco.Database;



public class AutostradaDAO {
	
	public Autostrada createAutostrada(String id) {
		
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
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Autostrada b = new Autostrada (null,cod,null,tipologia);
		
		 if (tipologia.equals("pianura")) {
		 b.setTariffe(new tariffeCTRL().createTariffe().getTariffaP());
		 b.setCaselli(new CaselloCTRL().getCaselli(b));
		 
		 }
		
		 if (tipologia.equals("montagna")) {
		 b.setTariffe(new tariffeCTRL().createTariffe().getTariffaM());
		 b.setCaselli(new CaselloCTRL().getCaselli(b));
		 }
		
		
		 return b;
	}
	
	

}
