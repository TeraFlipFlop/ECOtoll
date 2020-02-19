package eco;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	;
		ClasseA v1= new ClasseA("AA121QQ","q3", "Nissan", 2002, 1500, 53, 2,ClasseAmbienale.Euro2 , 1.50);
	
	System.out.println(">Altezza veicolo:  "+v1.getAltezza()+"  > Classe ecologica:  "+ v1.getClasseAmbientale());
	Casello a=new Casello(300, "Rocca", "A01");
	Casello b=new Casello(310, "Valle", "A01");

	ArrayList <Casello> f=new ArrayList<Casello>();
	f.add(a);
	
	 double y[]={1.10,2.21,2.34,4.22,5};
	
	Autostrada a1 = new Autostrada(f, "a1", y, Tipologia.montagna);
	a1.addCasello(b);
	System.out.println(">Tipo autostrada:  "+a1.getTipoAutostrada() + "  > Tariffa per veicoli classe 3:  "+a1.getTariffe()[2] );
	
	Percorso p= new Percorso (a1.getCaselli().get(0),a1.getCaselli().get(1)) ;
	
	System.out.println(">Km percorsi: "+p.KmPercorsi());
	
	Pedaggio t = new Pedaggio(p,a1);
	
	
	System.out.println(">tariffa complessiva:  "+t.tariffaFinale(v1));
	}

}
