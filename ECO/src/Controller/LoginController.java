package Controller;

import DAO.GestoreUtenzaDAO;
public class LoginController {
	
		public String login(String username,String password) {
			return new GestoreUtenzaDAO().login(username, password);
		}		
}
