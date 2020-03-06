package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;

import Controller.AutostradaCTRL;
import Controller.CaselloCTRL;
import view.Login;
import Controller.AutostradaCTRL;
import Controller.LoginController;
import model.Autostrada;
import model.Casello;

import model.Database;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.TextArea;
import javax.swing.JList;
public class mostra  extends JFrame{
	public mostra() {
		this.setBounds(200, 200, 484, 364);
		this.setLocation(1000, 1000);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblMostraTutto = new JLabel("mostra tutto");
		lblMostraTutto.setBounds(105, 10, 247, 16);
		lblMostraTutto.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblMostraTutto);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 28, 434, 283);
		getContentPane().add(scrollPane);
		
		JTextArea ta = new JTextArea();
		scrollPane.setViewportView(ta);
		
		
		 
		ArrayList<Autostrada> alist=new ArrayList<Autostrada>();
		String li="";
		
		

		//
			
			alist= new AutostradaCTRL().getAutostrada();
	
		
		
	//
					
					
					li="autostrada\t tipo\t \n";
					for (Autostrada s:alist) {
						 {li=li+s.getId()+"\t"+s.getTipoAutostrada(s.getTipoAutostrada())+"\n";}
						
					ta.setText(li);
					
					JButton btnRefresh = new JButton("refresh");
					btnRefresh.setBounds(311, 8, 117, 20);
					btnRefresh.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							mostra m=new mostra();
							m.setVisible(true);
							m.setBounds(200, 200, 450, 339);
							dispose();			
			}
					});{
					getContentPane().add(btnRefresh);
					} }
	}
	
	public mostra (Autostrada a) {
		
		this.setBounds(200, 200, 484, 364);
		this.setLocation(1000, 1000);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblMostraTutto = new JLabel("mostra tutto");
		lblMostraTutto.setBounds(105, 10, 247, 16);
		lblMostraTutto.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblMostraTutto);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 28, 434, 283);
		getContentPane().add(scrollPane);
		
		JTextArea ta = new JTextArea();
		scrollPane.setViewportView(ta);
		ArrayList<Casello> alist = new CaselloCTRL().getCaselli(a);
		
		
		
			
			String li = "codice\tAutostrada\tkm\n";
			for (Casello s:alist) {
				 li=li+s.getNome()+"\t"+s.getId()+"\t"+s.getKm()+"\n ";}
			
				
			ta.setText(li);
			
		

			JButton btnRefresh = new JButton("refresh");
			btnRefresh.setBounds(311, 8, 117, 20);
			btnRefresh.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mostra m=new mostra(a);
					m.setVisible(true);
					m.setBounds(200, 200, 450, 339);
					dispose();			
	}
			});{
			getContentPane().add(btnRefresh);
			} }
		}
	
	

