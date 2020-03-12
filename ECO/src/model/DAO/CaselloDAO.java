package model.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Autostrada;
import model.Casello;
import model.Database;


public class CaselloDAO {
public Casello getCasello(String codice) {

	String nome = null;
	String idAuto = null;
	int km = 0;
	Connection con = new Database().Connect();
	
	java.sql.PreparedStatement st = null;
	String sql =null;
	
	sql="select * from casello where codice ='"+codice+"' " ;
	
	try {
st=con.prepareStatement(sql);
		
	ResultSet res	=null;

	 st.execute();
	 res = st.getResultSet();
	
		while(res.next()) {
			 km=res.getInt("km");
			 idAuto=res.getString("codice");
			 nome= res.getString("nome");
}
		} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	Casello c = new Casello (km, nome,idAuto);
	return c; 
	}

///////////////////////////////////////////////////////////////////////////////////////////////////
public ArrayList<Casello> getCaselli(Autostrada a) {
	
	Connection con = new Database().Connect();
	int km=0;
	String cod = null;
	
	String nome=null;
	String autostrada =null;
	java.sql.PreparedStatement st = null;
	String sql =null;
	
	sql="select * from casello where Autostrada='"+a.getId()+"'";
	ArrayList<Casello> alist=new ArrayList<Casello>();
	
	
	try {
		st=con.prepareStatement(sql);
				
			ResultSet res	=null;

			 st.execute();
			 res = st.getResultSet();
			while(res.next()) {
				
				km=res.getInt("km");
				cod=res.getString("codice");
				nome= res.getString("nome");
				autostrada=res.getString("autostrada");
				
				Casello c =new Casello (km,cod,autostrada);
				System.out.println("casello added");
			alist.add(c);
				};
			} catch (SQLException e1) {
			
				e1.printStackTrace();
			}
	return alist;}

public void update(Casello casello) {
	// TODO Auto-generated method stub
	
}







}
