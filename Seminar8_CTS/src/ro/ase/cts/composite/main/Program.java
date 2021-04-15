package ro.ase.cts.composite.main;

import ro.ase.cts.composite.IOptiuneMeniu;
import ro.ase.cts.composite.Item;
import ro.ase.cts.composite.SectiuneMeniu;

public class Program {
	
	public static void main(String[] args) {
		IOptiuneMeniu meniu = new SectiuneMeniu("Meniu restaurant");
		IOptiuneMeniu optiune1 = new SectiuneMeniu("Bauturi");
		IOptiuneMeniu optiune2 = new SectiuneMeniu("Desert");
		
		IOptiuneMeniu item1 = new Item("Frappe");
		IOptiuneMeniu item2 = new Item("Apa plata");
		IOptiuneMeniu item3 = new Item("Papanasi");
		try {
			optiune1.adaugaNod(item1);
			optiune1.adaugaNod(item2);
			
			optiune2.adaugaNod(item3);
			
			meniu.adaugaNod(optiune1);
			meniu.adaugaNod(optiune2);
			
			meniu.descriere();
			
			optiune1.stergereNod(item1);
			optiune2.adaugaNod(item1);
			
			meniu.descriere();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}