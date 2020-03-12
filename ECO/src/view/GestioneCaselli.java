package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLDocument.Iterator;

import view.Login;
import Controller.AutostradaCTRL;
import Controller.CaselloCTRL;
import Controller.LoginController;
import model.Autostrada;
import model.Casello;
import model.Database;

import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.AbstractButton;
import javax.swing.GroupLayout;


public class GestioneCaselli extends JFrame{
	private static final String CREATE_QUERY_CASELLI = "insert into casello values(?,?,?,?)";
	private static final String DELETE_QUERY = "delete from casello where codice = ?";
	String a;
	
				//SCHERMATA INIZIALE
	
	public GestioneCaselli(String user) {
		getContentPane().setLayout(null);
		setBounds(100, 100, 462, 353);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
				//BOTTONE INDIETRO
		
			JButton btnIndietro = new JButton("indietro");
			btnIndietro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
					FinestraPrincipale u = new FinestraPrincipale(user);
					u.setVisible(true);
				}
			});
					//DIMENSIONI BOTTONE INDIETRO
			
			btnIndietro.setBounds(327, 6, 117, 29);
			getContentPane().add(btnIndietro);
			
			
						//BOTTONE INSERISCI
			
			JButton btnInserisci = new JButton("inserisci");
			btnInserisci.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					inserisciCaselli f = new inserisciCaselli (user);
					f.setVisible(true);
					dispose();
					
					
					
					/*
					Connection con = new Database().Connect();
					String codice= textField_1.getText();
					String Km = textField_2.getText();
					String nome = textField_3.getText();
					String Autostrada = textField.getText();
					
					
					java.sql.PreparedStatement st = null;
					try {
						st=con.prepareStatement(CREATE_QUERY_CASELLI);
						
						st.setString(1, codice);
						st.setString(2, Km);
						st.setString(3, Autostrada);
						st.setString(4, nome);
						
						st.execute();
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
						System.out.print("ci sto dentro un casino");
						btnRefresh.doClick();
						JOptionPane.showMessageDialog(null, "inserito");*/
					
					

				}
			});
						//DIMENSIONE BOTTONE INSERISCI
			
			btnInserisci.setBounds(20, 77, 117, 29);
			getContentPane().add(btnInserisci);
			
			
			
						//BOTTONE MODIFICA
			
			JButton button = new JButton("sotto menù modifica");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//CHIAMATE VIEW "ModAUTOSTRADA"
					
					 {
						dispose();
						ModCasello p = new ModCasello(user);
						p.setVisible(true);
					}
			}
			});
			
			
						//DIMENSIONE BOTTONE MODIFICA
			button.setBounds(167, 77, 117, 29);
			getContentPane().add(button);
			
						//BOTTONE CANCELLA
			
			JButton btnCancella = new JButton("Cancella");
			btnCancella.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					cancellaCaselli f = new cancellaCaselli(user);
					f.setVisible(true);
					dispose();
					
					/*
					Connection con = new Database().Connect();
					String codice = textField.getText();
			
					java.sql.PreparedStatement st = null;
					
					try {
						st=con.prepareStatement(DELETE_QUERY);
						
						st.setString(1, codice);

						st.execute();
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
						System.out.print("dovrebbe andare");
						btnRefresh.doClick();
						JOptionPane.showMessageDialog(null, "eliminato");*/

				}
			});
						//DIMENSIONI BOTTONE CANCELLA
			
			btnCancella.setBounds(327, 77, 117, 29);
			getContentPane().add(btnCancella);
				
				

				
							//LABEL CASELLI
				
				JLabel lblGestioneCaselli = new JLabel("Gestione Caselli");
				lblGestioneCaselli.setBounds(20, 11, 103, 16);
				getContentPane().add(lblGestioneCaselli);
				
				
				
				
				ArrayList <String> codlist = new ArrayList <String>() ;
				
				codlist =  new AutostradaCTRL().getCodAutostrada();
				String [] codicevar = new String[codlist.size()];
				
	
	
	}
					
					
					
				
				
				
				}


					
			
				  			