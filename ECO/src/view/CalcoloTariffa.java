package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.VeicoloCTRL;
import model.components.Autostrada;
import model.components.Casello;
import model.components.Pedaggio;
import model.components.Percorso;
import model.components.Veicolo;
import view.Login;
import Controller.AutostradaCTRL;
import Controller.CaselloCTRL;
import Controller.LoginController;
import Controller.*;

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
	private String autostrada= "";
	Autostrada a;
	
	public CalcoloTariffa(String username) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 500);
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
		
		
		
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(484, 202, 76, 22);
		getContentPane().add(comboBox_2);
		
		
							//combobox Autostrada
		
		JComboBox jComboBox = new JComboBox();
		
		ArrayList <String> codlist = new ArrayList <String>() ;
		codlist =  new AutostradaCTRL().getCodAutostrada();
		codlist.add(0, " ");
		String [] codicevar = new String[codlist.size()];
		JComboBox jComboBox1 = new JComboBox(codlist.toArray(codicevar));
		JComboBox codiceComboBox = jComboBox1;
		
		
		
		codiceComboBox.setBounds(484, 97, 76, 22);
		getContentPane().add(codiceComboBox);
		
		
		
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(484, 148, 76, 22);
		getContentPane().add(comboBox);
	
		    comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String	codiceSelected = comboBox.getSelectedItem().toString();
			entrata =comboBox.getSelectedItem().toString();
			textField_1.setText(codiceSelected);

		
			}
		});
		
	
		
		
		
		    comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String	codiceSelected2 = comboBox_2.getSelectedItem().toString();
			uscita=comboBox_2.getSelectedItem().toString();
			textField_1.setText(codiceSelected2);

			}});
		
		
		
		    codiceComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String	codiceSelected = codiceComboBox.getSelectedItem().toString();
				
				a=new AutostradaCTRL().getAutostrada(codiceSelected);

				create2(comboBox,codiceSelected);
				create2(comboBox_2,codiceSelected);
			
			}
		});
		
		
		

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
	btnCalcola.setBounds(257,167, 123, 21);
	getContentPane().add(btnCalcola);
}
	public void create1(JComboBox<String> combo) {
		combo.removeAllItems();
		combo.addItem(" ");
		
		System.out.println(a.getId());
		ArrayList<Autostrada> c = new AutostradaCTRL().getAutostrada();
		
		
		for(Autostrada p:c) {combo.addItem(p.getId());}
		
		getContentPane().add(combo);
			};
			
			public void create2(JComboBox<String> combo,String  a) {
				combo.removeAllItems();
				combo.addItem(" ");
				Autostrada b = new AutostradaCTRL().getAutostrada(a);

				System.out.println(b.getId());
				ArrayList<Casello> c = new CaselloCTRL().getCaselli(b);
				
				
				
				for(Casello p:c) {combo.addItem(p.getNome());}
				
				getContentPane().add(combo);
					};
			
}

