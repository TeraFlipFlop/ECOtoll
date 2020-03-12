package view;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;

import Controller.AutostradaCTRL;
import Controller.LoginController;
import model.DAO.AutostradaDAO;
import model.components.Database;
import view.Login;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

public class GestioneAutostrade extends JFrame {
	private static final String CREATE_QUERY_AUTOSTRADA = "insert into autostrada values(?,?,?,?)";
	private static final String DELETE_QUERY = "delete from autostrada where codice = ?";	
	String a;
	
				//FINESTRA PRINCIPALE
	
	public GestioneAutostrade(String  user) {
		getContentPane().setLayout(null);
		setBounds(100, 100, 453, 346);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
					//BOTTONE INDIETRO
		
		JButton btnIndietro = new JButton("indietro");
		btnIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FinestraPrincipale l = new FinestraPrincipale(user);
				l.setVisible(true);
			}
		});
					//DIMENSIONI BOTTONE INDIETRO
		
		btnIndietro.setBounds(327, 6, 117, 29);
		getContentPane().add(btnIndietro);
		
						//BOTTONE CANCELLA
		
		JButton btnCancella = new JButton("cancella");
		btnCancella.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cancellaAutostrade f = new cancellaAutostrade(user);
				f.setVisible(true);
				dispose();
				/*
				Connection con = new Database().Connect();
				String cod= textField.getText() ;
				java.sql.PreparedStatement st = null;
				try {
					st=con.prepareStatement(DELETE_QUERY);
					
					st.setString(1, cod);
		st.execute();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.print("ho cancellato");
				JOptionPane.showMessageDialog(null, "ho cancellato");
				*/
			}
		});
					//DIMENSIONI BOTTONE CANCELLA
		
		btnCancella.setBounds(163, 93, 117, 29);
		getContentPane().add(btnCancella);
		
						//BOTTONE INSERISCI
		
		JButton btnInserisci = new JButton("inserisci");
		btnInserisci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inserisciAutostrade f = new inserisciAutostrade(user);
				f.setVisible(true);
				dispose();
				
				/*
				Connection con = new Database().Connect();
				String cod= textField.getText() ;
				String tipo = textField_1.getText();
				String nome = textField_2.getText();
				
				java.sql.PreparedStatement st = null;
				try {
					st=con.prepareStatement(CREATE_QUERY_AUTOSTRADA);
					
					st.setString(1, cod);
					st.setString(2, nome);
					st.setString(3, tipo);
					st.setString(4, user);
					
					st.execute();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
					System.out.print("ci sto dentro un casino");
					JOptionPane.showMessageDialog(null, "autostrada inserita");

			}*/
			}});
					//DIMENSIONE BOTTONE INSERISCI
		
		btnInserisci.setBounds(20, 93, 117, 29);
		getContentPane().add(btnInserisci);
		
		
					//Label Gestione Autostrade
		
		JLabel lblGestioneAutostrade = new JLabel("Gestione Autostrade");
		lblGestioneAutostrade.setBounds(39, 19, 130, 16);
		getContentPane().add(lblGestioneAutostrade);
				
							//COMBO BOX
		
		ArrayList <String> codlist = new ArrayList <String>() ;
		codlist =  new AutostradaCTRL().getCodAutostrada();
		String [] codicevar = new String[codlist.size()];
		
					//BOTTONE MODIFICA
		
		JButton button = new JButton("scheda modifica");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//CHIAMATE VIEW "ModAUTOSTRADA"
				
				 {
					dispose();
					ModAutostrada p = new ModAutostrada(user);
					p.setVisible(true);
				}
		}
		});
					//DIMENSIONE BOTTONE MODIFICA
		
		button.setBounds(308, 93, 117, 29);
		getContentPane().add(button);
	}
}



