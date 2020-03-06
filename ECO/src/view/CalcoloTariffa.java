package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.VeicoloCTRL;
import view.Login;
import Controller.AutostradaCTRL;
import Controller.CaselloCTRL;
import Controller.LoginController;

import model.Autostrada;
import model.Casello;
import model.Pedaggio;
import model.Percorso;
import model.Veicolo;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class CalcoloTariffa extends JFrame {//da rifare
	public String id =null;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String entrata ="";
	private String uscita ="";
	private String autostrada= "A01";
	
	
	public CalcoloTariffa(String username) {
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
				btnIndietro.setBounds(526, 17, 117, 29);
				getContentPane().add(btnIndietro);
		
		
		getContentPane().setLayout(null);
		
		JLabel lblCalcoloPedaggio = new JLabel("Calcolo Pedaggio");
		lblCalcoloPedaggio.setBounds(21, 23, 108, 16);
		getContentPane().add(lblCalcoloPedaggio);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(33, 99, 155, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(33, 169, 155, 19);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnCarta = new JRadioButton("carta");
		buttonGroup.add(rdbtnCarta);
		rdbtnCarta.setBounds(33, 244, 103, 21);
		getContentPane().add(rdbtnCarta);
		
		JRadioButton rdbtnContanti = new JRadioButton("contanti");
		buttonGroup.add(rdbtnContanti);
		rdbtnContanti.setBounds(33, 282, 103, 21);
		getContentPane().add(rdbtnContanti);
		
		JButton btnAcquisisciTarga = new JButton("acquisisci targa");
		btnAcquisisciTarga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g = new VeicoloCTRL().getv().getTarga();
			textField.setText(g);
			}
		});
		btnAcquisisciTarga.setBounds(257, 98, 123, 21);
		getContentPane().add(btnAcquisisciTarga);
		
	
		
		JButton btnEffettuaPagamento = new JButton("effettua pagamento");
		btnEffettuaPagamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Pagamento Effettuato");
			}
		});
		btnEffettuaPagamento.setBounds(257, 244, 167, 29);
		getContentPane().add(btnEffettuaPagamento);
		
		JLabel lblTarga = new JLabel("targa");
		lblTarga.setBounds(32, 76, 45, 13);
		getContentPane().add(lblTarga);
		
		JLabel lblImporto = new JLabel("importo");
		lblImporto.setBounds(32, 150, 97, 13);
		getContentPane().add(lblImporto);
			
		
		JLabel lblAutostrada = new JLabel("autostrada");
		lblAutostrada.setBounds(484, 74, 96, 16);
		getContentPane().add(lblAutostrada);
		
		JLabel lblEntrata = new JLabel("entrata");
		lblEntrata.setBounds(484, 130, 56, 16);
		getContentPane().add(lblEntrata);
		
		JLabel lblUscita = new JLabel("uscita");
		lblUscita.setBounds(484, 179, 56, 16);
		getContentPane().add(lblUscita);
		
		
							//combobox Autostrada
		
		JComboBox jComboBox = new JComboBox();
		
		ArrayList <String> codlist = new ArrayList <String>() ;
		codlist =  new AutostradaCTRL().getCodAutostrada();
		String [] codicevar = new String[codlist.size()];
		JComboBox jComboBox1 = new JComboBox(codlist.toArray(codicevar));
		JComboBox codiceComboBox = jComboBox1;
		
		codiceComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String	codiceSelected = codiceComboBox.getSelectedItem().toString();
		ArrayList <String> codlist =  new AutostradaCTRL().getCodAutostrada();
		String []codicevar = new String[codlist.size()];
		
			}
		});
		
		jComboBox1.setBounds(484, 97, 76, 22);
		getContentPane().add(jComboBox1);
		
		
		
		
		
		
		
		
		JComboBox comboBox_1 = new JComboBox();
		//qua
		ArrayList<Casello> c=new ArrayList <Casello>() ;//= new ArrayList <Casello>(new CaselloCTRL().getCaselli(new AutostradaCTRL().getAutostrada("*")));
		ArrayList <String> codlistcaselli= new ArrayList<String>(); 
		 for(Casello w:c)codlistcaselli.add(w.getNome());
		String [] codicevar1 = new String[codlistcaselli.size()];
		JComboBox jComboBox11 = new JComboBox(codlistcaselli.toArray(codicevar1));
		JComboBox codiceComboBox1 = jComboBox11;
		
		codiceComboBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String	codiceSelected = codiceComboBox1.getSelectedItem().toString();
			entrata =codiceComboBox1.getSelectedItem().toString();
		ArrayList <String> codlistcaselli = new ArrayList<String>(); //=  new CaselloCTRL().getCaselli(codiceSelected);//
		String []codicevar1 = new String[codlistcaselli.size()];
		
			}
		});
		
		codiceComboBox1.setBounds(484, 144, 114, 27);
		getContentPane().add(codiceComboBox1);
		setBounds(100, 100, 711, 380);
		
		
		
		JComboBox comboBox_2 = new JComboBox();
		
		ArrayList <String> codlistcaselli2 = new ArrayList <String>();//new AutostradaCtrl().getCodCaselli()); 
		 
		String [] codicevar2 = new String[codlistcaselli2.size()];
		JComboBox jComboBox12 = new JComboBox(codlistcaselli2.toArray(codicevar2));
		JComboBox codiceComboBox2 = jComboBox12;
		
		codiceComboBox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String	codiceSelected2 = codiceComboBox2.getSelectedItem().toString();
			uscita=codiceComboBox2.getSelectedItem().toString();
		ArrayList <String> codlistcaselli2 =new ArrayList <String>();// =  new CaselloCTRL().getCaselli(new AutostradaCTRL().getAutostrada(autostrada));;
		String []codicevar2 = new String[codlistcaselli2.size()];
		
			}
		});
		
		codiceComboBox2.setBounds(484, 197, 114, 27);
		getContentPane().add(codiceComboBox2);
	

	JButton btnCalcola = new JButton("calcola");
	btnCalcola.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			////////////////////////////////////////////////
			
			
			Veicolo g = new VeicoloCTRL().getv();
			Casello en = new CaselloCTRL().getCaselli(entrata);
			Casello us = new CaselloCTRL().getCaselli(uscita);
			Percorso p = new Percorso (en,us);
			Autostrada A=new AutostradaCTRL().getAutostrada(autostrada);
			Pedaggio pedaggio =new Pedaggio (p,A);
			
			
			
		textField_1.setText(String.valueOf(pedaggio.tariffaFinale(g)));}});
	
	///////////////////////////////////////////////////////
	btnCalcola.setBounds(257, 167, 123, 21);
	getContentPane().add(btnCalcola);
}}

