package eco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VeicoloDAO {

	
	
	public Veicolo getV() {
		

		java.sql.PreparedStatement st = null;
		Connection con = new Database().Connect();
		String targa="";
		String marca;
		String modello;
		int peso;
		int assi;
		int altezza;
		int anno;
		String categoria;
		double co2;

		String sql = "select * from veicolo where marca = 'ford' ;" ;
		
		try {
			st = con.prepareStatement(sql);
			
		ResultSet res	=null;

		 st.execute();
		 res = st.getResultSet();
		
			while(res.next()) {
				targa=res.getString("targa");
				marca=res.getString(2);
				modello=res.getString(3);
				peso=res.getInt(4);
				assi=res.getInt(5);
				altezza=res.getInt(6);
				anno=res.getInt(7);
				categoria=res.getString(8);
				co2=res.getDouble(9);
					
				}
				 
				

		
		

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		return null;
		
		
		
	}
	
	
	
}
