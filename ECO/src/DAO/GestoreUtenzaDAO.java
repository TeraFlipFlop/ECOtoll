package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import model.Database;

public class GestoreUtenzaDAO {

	
	
	public String login(String username, String password) {
			
			
			
			
			Connection con = new Database().Connect();
			try {
				Statement st=con.createStatement();
				
				
				
				
				System.out.println(username);
				System.out.println(password);
				
				ResultSet result=st.executeQuery("select * from amministratore where Username='"+username+"'and Password='"+password+"'");
				
				if(result.next()) {
					return "amministratore";
					
				}

				
				
			

			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			
			return "";
		}

}
