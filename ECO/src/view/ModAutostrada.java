package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.Login;
import Controller.AutostradaCTRL;
import Controller.CaselloCTRL;
import Controller.LoginController;
import Controller.TariffeCTRL;
import model.components.Autostrada;
import model.components.Database;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

public class ModAutostrada extends JFrame {
//	private static final String MOD_QUERY = "UPDATE `pedaggiautostrade`.`autostrada` SET `Codice` = 'A24', `Nome` = '?', `Tipo` = '?' WHERE (`Codice` = '?');\n" + 
	// "";

	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public ModAutostrada(String user) {
		getContentPane().setLayout(null);
		setBounds(100, 100, 469, 339);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JLabel lblInserisciIdAutostrada = new JLabel("Inserisci Codice Autostrada da modificare");
		lblInserisciIdAutostrada.setBounds(20, 62, 263, 16);
		getContentPane().add(lblInserisciIdAutostrada);

		JLabel lblInserisciNuoviCampi = new JLabel("Inserisci nuovi campi");
		lblInserisciNuoviCampi.setBounds(159, 115, 142, 16);
		getContentPane().add(lblInserisciNuoviCampi);

		textField_1 = new JTextField();
		textField_1.setBounds(20, 154, 130, 26);
		textField_1.setColumns(10);
		getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setBounds(20, 201, 130, 26);
		textField_2.setColumns(10);
		getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setBounds(303, 154, 130, 26);
		textField_3.setColumns(10);
		getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setBounds(303, 201, 130, 26);
		textField_4.setColumns(10);
		getContentPane().add(textField_4);

		JLabel lblNewLabel = new JLabel("Codice");
		lblNewLabel.setBounds(63, 136, 61, 16);
		getContentPane().add(lblNewLabel);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(63, 186, 61, 16);
		getContentPane().add(lblNome);

		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(344, 136, 61, 16);
		getContentPane().add(lblTipo);

		JLabel lblAmministratore = new JLabel("Amministratore");
		lblAmministratore.setBounds(323, 186, 98, 16);
		getContentPane().add(lblAmministratore);

		// BOTTONE INDIETRO

		JButton btnIndietro = new JButton("Indietro");

		btnIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				GestioneAutostrade l = new GestioneAutostrade(user);
				l.setVisible(true);
			}
		});
		// DIMENSIONE BOTTONE INDIETRO

		btnIndietro.setBounds(327, 6, 117, 29);
		getContentPane().add(btnIndietro);

		// BOTTONE APPLICA (MODIFICA)

		JButton btnModifica = new JButton("Applica");
		btnModifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// String id,String nome,String tipo, String user
				String codice = textField_1.getText();
				String tipo = textField_3.getText();
				String nome = textField_2.getText();

				Autostrada a = new Autostrada(codice, nome, tipo, user);
				a.setTariffe(new TariffeCTRL().createTariffe().getTariffa(a));
				a.setCaselli(new CaselloCTRL().getCaselli(a));

				int J = JOptionPane.showConfirmDialog(null, "vuoi?", "", 0);
				if (J == 1) {

				} else {

					new AutostradaCTRL().modAutostrada(a);

					ModAutostrada q = new ModAutostrada(user);
					q.setVisible(true);
					dispose();
				}
			}

		});
		// DIMENSIONE BOTTONE MODIFICA (APPLICA)

		btnModifica.setBounds(170, 243, 117, 29);
		getContentPane().add(btnModifica);

		// COMBO BOX

		ArrayList<String> codlist = new ArrayList<String>();
		codlist = new AutostradaCTRL().getCodAutostrada();
		String[] codicevar = new String[codlist.size()];
		JComboBox<String> jComboBox = new JComboBox<String>(codlist.toArray(codicevar));
		JComboBox<String> codiceComboBox = jComboBox;

		codiceComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String codiceSelected = codiceComboBox.getSelectedItem().toString();
				textField_1.setText(codiceSelected);

			}
		});
		// DIMENSIONI COMBO BOX

		codiceComboBox.setBounds(303, 58, 130, 27);
		getContentPane().add(codiceComboBox);

	}
}
