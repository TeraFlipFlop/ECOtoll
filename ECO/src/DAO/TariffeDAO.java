package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import eco.Database;
import eco.Tariffe;

public class TariffeDAO {
	
	
	public Tariffe buildTariffe() {
		Tariffe t =new Tariffe(null,null,null);
		String montagna="montagna";
		String pianura ="pianura";
		String [] cat= {"a","b","3","4","5"};
		double []d = {0,0,0,0,0,0};
		int i = 0;
		
		
		Connection con = new Database().Connect();
		try {
			Statement st=con.createStatement();
			
			for (i=0;i<5;i++) {
			ResultSet result=st.executeQuery("select Valore from tariffa where tipo ='"+ montagna+"' and  categoria ='"+ cat[i]+"'");
	
			
	
			
			if(result.next()) {
				
					d[i]=result.getDouble("Valore");
				}
				
			}
			t.setTariffaM(d);

			
			
		

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
///////////////////////////////////////////////////////////////////////////////////////////////////
		try {
			Statement st=con.createStatement();
			
			for (i=0;i<5;i++) {
			ResultSet result=st.executeQuery("select Valore from tariffa where tipo ='"+ pianura+"' and  categoria ='"+ cat[i]+"'");
	
			
	
			
			if(result.next()) {
				
					d[i]=result.getDouble("Valore");
				}
				
			}
			t.setTariffaP(d);

			
			
		

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		try {
			Statement st=con.createStatement();
			
			for (i=0;i<6;i++) {
			ResultSet result=st.executeQuery("select importo from oneri ");
	
			
	
			for (i=0;i<6;i++) {
			if(result.next()) {
				
					d[i]=result.getDouble("importo");
				}
				
			}
			t.setOneri(d);

			
			
		

			}} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		return t;
		
		
	

} }
