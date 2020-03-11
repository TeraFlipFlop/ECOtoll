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


public class inserisciCaselli extends JFrame{
	private static final String CREATE_QUERY_CASELLI = "insert into casello values(?,?,?,?)";
	private static final String DELETE_QUERY = "delete from casello where codice = ?";
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	String a;
	
				//SCHERMATA INIZIALE
	
	public inserisciCaselli(String username) {
		getContentPane().setLayout(null);
		setBounds(100, 100, 462, 353);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
				//BOTTONE INDIETRO
		
			JButton btnIndietro = new JButton("indietro");
			btnIndietro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
					FinestraPrincipale u = new FinestraPrincipale(username);
					u.setVisible(true);
				}
			});
					//DIMENSIONI BOTTONE INDIETRO
			
			btnIndietro.setBounds(327, 6, 117, 29);
			getContentPane().add(btnIndietro);
			
			
					//SERIE DI TEXTFIELD
			textField = new JTextField();
			textField.setBounds(272, 60, 130, 26);
			getContentPane().add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBounds(272, 99, 130, 26);
			getContentPane().add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setBounds(272, 137, 130, 26);
			getContentPane().add(textField_2);
			textField_2.setColumns(10);
			
			textField_3 = new JTextField();
			textField_3.setBounds(272, 175, 130, 26);
			getContentPane().add(textField_3);
			textField_3.setColumns(10);
			
			
			
			//BOTTONE REFRESH
			
JButton btnRefresh = new JButton("refresh");
btnRefresh.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		inserisciCaselli f = new inserisciCaselli (username);
		f.setVisible(true);
		dispose();
		
	}
});
			//DIMENSIONI BOTTONE REFRESH

btnRefresh.setBounds(198, 6, 117, 29);
getContentPane().add(btnRefresh);
			
			
						//SERIE DI LABEL
			JLabel lblAutostrada = new JLabel("autostrada");
			lblAutostrada.setBounds(47, 65, 61, 16);
			getContentPane().add(lblAutostrada);
			
			JLabel lblID = new JLabel("ID");
			lblID.setBounds(47, 104, 76, 16);
			getContentPane().add(lblID);
			
			JLabel lblKm = new JLabel("km");
			lblKm.setBounds(47, 142, 76, 16);
			getContentPane().add(lblKm);
			
			JLabel lblNome = new JLabel("Nome");
			lblNome.setBounds(47, 180, 61, 16);
			getContentPane().add(lblNome);
			
			
						//BOTTONE INSERISCI
			
			JButton btnInserisci = new JButton("inserisci");
			btnInserisci.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
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
						JOptionPane.showMessageDialog(null, "inserito");

				}
			});
						//DIMENSIONE BOTTONE INSERISCI
			
			btnInserisci.setBounds(20, 225, 117, 29);
			getContentPane().add(btnInserisci);
			
			
					//Bottone Mostra Tutto
			
			JButton btnMostraTutto = new JButton("Mostra Tutto");
			btnMostraTutto.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Autostrada q=new AutostradaCTRL().getAutostrada(textField.getText());
					mostra m=new mostra(q);
					m.setVisible(true);
					m.setBounds(200, 200, 450, 339);
				}
			});
						//Dimensioni bottone Mostra Tutto
			
			btnMostraTutto.setBounds(285, 225, 117, 29);
			getContentPane().add(btnMostraTutto);
				
				

				
							//LABEL CASELLI
				
				JLabel lblGestioneCaselli = new JLabel("Gestione Caselli");
				lblGestioneCaselli.setBounds(20, 11, 103, 16);
				getContentPane().add(lblGestioneCaselli);
				
				
				
				
				ArrayList <String> codlist = new ArrayList <String>() ;
				
				codlist =  new AutostradaCTRL().getCodAutostrada();
				String [] codicevar = new String[codlist.size()];
				JComboBox jComboBox = new JComboBox(codlist.toArray(codicevar));
				JComboBox codiceComboBox = jComboBox;
				
			
								//DIMENSIONI COMBO BOX
				
				codiceComboBox.setBounds(157, 62, 103, 22);
				getContentPane().add(codiceComboBox);
				
				
				
				
				
				
				
				
				
				/*
				ArrayList <String> codlist1 = new ArrayList <String>() ;
				
				codlist1 =  new AutostradaCTRL().getCodAutostrada();
				String [] codicevar1 = new String[codlist1.size()];
				codicevar1=(String[]) codlist1.toArray();
				JComboBox<String> comboBox = new JComboBox<String>();//codlist1.toArray(codicevar1));
				for(String s:codicevar1) {comboBox.addItem(s);}
				
				
				comboBox.setBounds(157, 62, 103, 22);
				getContentPane().add(comboBox);
				*/
				//String	codiceSelected = comboBox.getSelectedItem().toString();
				//textField.setText(codiceSelected);

				JComboBox<String> comboBox_1 =new JComboBox<String>();
				comboBox_1.setBounds(157, 101, 103, 22);
				getContentPane().add(comboBox_1);
				//COMBO BOX
				
				
				
				
				
				codiceComboBox.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
					String	codiceSelected = codiceComboBox.getSelectedItem().toString();
					textField.setText(codiceSelected);
					create2(comboBox_1);
					
				
					
				}});

				
				comboBox_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
					String	codiceSelected = (String) comboBox_1.getSelectedItem();
					textField_1.setText(codiceSelected);
					
					
				
					
				}});
				
	
	
	}
					
					public void create2(JComboBox<String> combo) {
					combo.removeAllItems();
					
					Autostrada b = new AutostradaCTRL().getAutostrada(textField.getText());
					System.out.println(b.getId());
					ArrayList<Casello> c = new CaselloCTRL().getCaselli(b);
					
					
					
					for(Casello p:c) {combo.addItem(p.getNome());}
					getContentPane().add(combo);
						};
					
				
				
				
				}


					
			
				  			