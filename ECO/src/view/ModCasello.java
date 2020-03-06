package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.AutostradaCTRL;
import Controller.CaselloCTRL;
import view.Login;
import Controller.AutostradaCTRL;
import Controller.LoginController;
import model.Autostrada;
import model.Casello;

import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

public class ModCasello extends JFrame {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	public ModCasello( String user) {
		getContentPane().setLayout(null);
		setBounds(100, 100, 450, 339);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel lblInserisciIdAutostrada = new JLabel("Inserisci Codice Casello da modificare");
		lblInserisciIdAutostrada.setBounds(20, 55, 263, 16);
		getContentPane().add(lblInserisciIdAutostrada);
		
		JLabel lblInserisciNuoviCampi = new JLabel("Inserisci nuovi campi");
		lblInserisciNuoviCampi.setBounds(166, 110, 142, 16);
		getContentPane().add(lblInserisciNuoviCampi);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(20, 162, 130, 26);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(20, 201, 130, 26);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(303, 162, 130, 26);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(303, 201, 130, 26);
		getContentPane().add(textField_4);
		
		JLabel lblNewLabel = new JLabel("Codice");
		lblNewLabel.setBounds(63, 143, 61, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(63, 186, 61, 16);
		getContentPane().add(lblNome);
		
		JLabel lblTipo = new JLabel("Km");
		lblTipo.setBounds(344, 143, 61, 16);
		getContentPane().add(lblTipo);
		
		JLabel lblAmministratore = new JLabel("Autostrada");
		lblAmministratore.setBounds(323, 186, 98, 16);
		getContentPane().add(lblAmministratore);
		
		JButton btnModifica = new JButton("Modifica");
		btnModifica.setBounds(173, 243, 117, 29);
		getContentPane().add(btnModifica);
		
		//BOTTONE INDIETRO
		
JButton btnIndietro = new JButton("Indietro");

btnIndietro.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	dispose();
	GestioneCaselli l = new GestioneCaselli (user);
	l.setVisible(true);
	}
});


btnIndietro.setBounds(327, 6, 117, 29);
getContentPane().add(btnIndietro);

				
		btnModifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String codice =textField_1.getText();
				String km = textField_3.getText() ;
				String nome = textField_2.getText() ;
				String autostrada =  textField_4.getText() ;
				Casello CASELLO = new Casello (Integer.valueOf(km),codice,autostrada);
				new CaselloCTRL().modCasello(CASELLO);
				
				btnIndietro.doClick();
		
		
			}
		});
		
		
						//COMBO BOX
		
		ArrayList <String> codlist1 = new ArrayList <String>() ;
				
				//codlist1 //=  new CaselloCTRL().getCaselli(a);/////////////////////////////////////////////////777
				String [] codicevar1 = new String[codlist1.size()];
		JComboBox comboBox = new JComboBox(codlist1.toArray(codicevar1));
		comboBox.setBounds(303, 51, 130, 27);
		getContentPane().add(comboBox);
		
				
				comboBox.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					String	codiceSelected = comboBox.getSelectedItem().toString();
					textField_1.setText(codiceSelected);
				
				
					}
			});
}}
