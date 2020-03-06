package model;

import java.util.ArrayList;
import java.util.Iterator;

import Controller.AutostradaCTRL;
import Controller.VeicoloCTRL;
import Controller.tariffeCTRL;

public class test2 {

	public static void main(String[] args) {
		Tariffe t= new tariffeCTRL().createTariffe();
		
		Autostrada a =new Autostrada(null,"A01" ,t.getTariffaM() , Tipologia.montagna);
		Autostrada b =new AutostradaCTRL().getAutostrada("A01");
		
		System.out.println(b.getId());
		
		for(Casello r:b.getCaselli()){System.out.println(r.getNome());}
		
		System.out.println(b.getTipoAutostrada(b.getTipoAutostrada()));
		
		for (double r :  t.getTariffaM()) {
			System.out.println(r);
			
		}
	    
		Veicolo s =new VeicoloCTRL().getv();
	    
		if(s.getClass().equals(new ClasseB().getClass() )) 
		{		
			System.out.println("yes");
}
		else {		
	
			System.out.println("no");
}
	
		ArrayList<Autostrada> w = new AutostradaCTRL().getAutostrada();

		Iterator<Autostrada> i= w.iterator();
	
		while (i.hasNext()) {
	
			System.out.println(i.next().getId())	;}
		
	
		ArrayList<String> q = new AutostradaCTRL().getCodAutostrada();
	
		Iterator<String> z = q.iterator();
	
		while (z.hasNext()){
		
			System.out.println(z.next())	;
	}
		
	

		
	}}


