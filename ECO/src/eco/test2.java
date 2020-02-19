package eco;

import Controller.AutostradaCTRL;
import Controller.tariffeCTRL;

public class test2 {

	public static void main(String[] args) {
		Tariffe t= new tariffeCTRL().createTariffe();
		
		
		
		
		Autostrada a =new Autostrada(null,"A01" ,t.getTariffaM() , Tipologia.montagna);
		Autostrada b =new AutostradaCTRL().buildAuto("A01");
		System.out.println(b.getId());
		for(Casello r:b.getCaselli()){System.out.println(r.getNome());}
		System.out.println(b.getTipoAutostrada(b.getTipoAutostrada()));
		

		
		
	}

}
