package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.TariffeCTRL;
import view.Login;
import Controller.TariffeCTRL;
import Controller.LoginController;
import model.Tariffe;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import Controller.*;
public class GestioneTariffe extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	public GestioneTariffe(String username) {
		 Tariffe t = new TariffeCTRL().createTariffe();
		double[] pianura= t.getTariffaP();
		double[] oneri=t.getOneri();
		double[] montagna=t.getTariffaM();
		 double text=  pianura[0];   //("A", "pianura")  ;
		 double text1= pianura[1];
		 double text2= pianura[2];
		 double text3= pianura[3];
		 double text4=pianura[4];
		 double text5 =oneri[0];
		 double text6 = oneri[1];
		 double text7 = oneri[2];
		 double text8 = oneri[3];
		 double text9 = oneri[4];
		 double text10 = oneri[5];
		 double text11 = montagna[0];
		 double text12 =montagna[1];
		 double text13 = montagna[2];
		 double text14 =montagna[3];
		 double text15 = montagna[4];
		
		 
		
		
		
		setBounds(100, 100, 450, 339);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//BOTTONE INDIETRO
		JButton btnIndietro = new JButton("indietro");
		btnIndietro.setBounds(335, 10, 93, 29);
		btnIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FinestraPrincipale u = new FinestraPrincipale(username);
				u.setVisible(true);
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(btnIndietro);
		
		JLabel lblTariffe = new JLabel("Tariffe");
		lblTariffe.setBounds(28, 44, 61, 16);
		getContentPane().add(lblTariffe);
		
		JLabel lblOneri = new JLabel("Oneri");
		lblOneri.setBounds(303, 47, 61, 16);
		getContentPane().add(lblOneri);
		
		JLabel lblClasseA = new JLabel("Classe A");
		lblClasseA.setBounds(28, 84, 61, 16);
		getContentPane().add(lblClasseA);
		
		JLabel lblClasseB = new JLabel("Classe B");
		lblClasseB.setBounds(28, 112, 61, 16);
		getContentPane().add(lblClasseB);
		
		JLabel lblClasse = new JLabel("Classe 3");
		lblClasse.setBounds(28, 139, 61, 16);
		getContentPane().add(lblClasse);
		
		JLabel lblClasse_1 = new JLabel("Classe 4");
		lblClasse_1.setBounds(28, 167, 61, 16);
		getContentPane().add(lblClasse_1);
		
		JLabel lblClasse_2 = new JLabel("Classe 5");
		lblClasse_2.setBounds(28, 195, 61, 16);
		getContentPane().add(lblClasse_2);
		
		JLabel lblEuro = new JLabel("Euro 1");
		lblEuro.setBounds(264, 84, 61, 16);
		getContentPane().add(lblEuro);
		
		JLabel lblEuro_1 = new JLabel("Euro 2");
		lblEuro_1.setBounds(264, 112, 61, 16);
		getContentPane().add(lblEuro_1);
		
		JLabel lblEuro_2 = new JLabel("Euro 3");
		lblEuro_2.setBounds(264, 139, 61, 16);
		getContentPane().add(lblEuro_2);
		
		JLabel lblEuro_3 = new JLabel("Euro 4");
		lblEuro_3.setBounds(264, 167, 61, 16);
		getContentPane().add(lblEuro_3);
		
		JLabel lblEuro_4 = new JLabel("Euro 5");
		lblEuro_4.setBounds(264, 195, 61, 16);
		getContentPane().add(lblEuro_4);
		
		JLabel lblEuro_5 = new JLabel("Euro 6");
		lblEuro_5.setBounds(264, 223, 61, 16);
		getContentPane().add(lblEuro_5);
		
		textField = new JTextField();
		textField.setText(String.valueOf(text));
		textField.setBounds(101, 79, 58, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		 textField_1.setText(String.valueOf(text1));
		textField_1.setBounds(101, 107, 58, 19);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText(String.valueOf(text2));
		textField_2.setBounds(101, 134, 58, 19);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText(String.valueOf(text3));
		textField_3.setBounds(101, 162, 58, 19);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setText(String.valueOf(text4));
		textField_4.setBounds(101, 190, 58, 19);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setText(String.valueOf(text5));
		textField_5.setBounds(335, 81, 52, 19);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setText(String.valueOf(text6));
		textField_6.setBounds(335, 109, 52, 19);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setText(String.valueOf(text7));
		textField_7.setBounds(335, 136, 52, 19);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setText(String.valueOf(text8));
		textField_8.setBounds(335, 164, 52, 19);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setText(String.valueOf(text9));
		textField_9.setBounds(335, 192, 52, 19);
		getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setText(String.valueOf(text10));
		textField_10.setBounds(335, 220, 52, 19);
		getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnCambia = new JButton("Cambia");
		btnCambia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tariffe r = new Tariffe(null, null, null);
				
				 String text= textField.getText();
				 String text1= textField_1.getText();
				 String text2= textField_2.getText();
				 String text3= textField_3.getText();
				 String text4= textField_4.getText();
				 String text5 = textField_5.getText();
				 String text6 = textField_6.getText();
				 String text7 = textField_7.getText();
				 String text8 = textField_8.getText();
				 String text9 = textField_9.getText();
				 String text10 = textField_10.getText();
				 String text11 =  textField_11.getText();
				 String text12 = textField_12.getText();
				 String text13 = textField_13.getText();
				 String text14 = textField_14.getText();
				 String text15 = textField_15.getText();
			
double[] pianura={Double.valueOf(text),Double.valueOf(text1),Double.valueOf(text2),Double.valueOf(text3),Double.valueOf(text4)};
double[] oneri={Double.valueOf(text5),Double.valueOf(text6),Double.valueOf(text7),Double.valueOf(text8),Double.valueOf(text9),Double.valueOf(text10)};
double[] montagna={Double.valueOf(text11),Double.valueOf(text12),Double.valueOf(text13),Double.valueOf(text14),Double.valueOf(text15)};
		t.setTariffaM(montagna);
		t.setOneri(oneri);
		t.setTariffaP(pianura);
		new TariffeCTRL().modtariffe(t);
			}
		});
		btnCambia.setBounds(162, 259, 117, 29);
		getContentPane().add(btnCambia);
		
		String [] pet = {"montagna","pianura"};
		
		JSeparator separator = new JSeparator();
		separator.setBounds(243, 80, 1, 12);
		getContentPane().add(separator);
		
		textField_11 = new JTextField();
		textField_11.setText(String.valueOf(text11));
		textField_11.setBounds(175, 79, 58, 19);
		getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setText(String.valueOf(text12));
		textField_12.setBounds(175, 107, 58, 19);
		getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setText(String.valueOf(text13));
		textField_13.setBounds(175, 134, 58, 19);
		getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setText(String.valueOf(text14));
		textField_14.setBounds(175, 162, 58, 19);
		getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setText(String.valueOf(text15));
		textField_15.setBounds(175, 190, 58, 19);
		getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Pianura");
		lblNewLabel.setBounds(99, 59, 45, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Montagna");
		lblNewLabel_1.setBounds(175, 59, 69, 13);
		getContentPane().add(lblNewLabel_1);

	}	
}
