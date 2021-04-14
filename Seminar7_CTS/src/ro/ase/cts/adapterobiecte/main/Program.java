package ro.ase.cts.adapterobiecte.main;

import ro.ase.cts.adapterobiecte.AdapterCreditObj;
import ro.ase.cts.adapterobiecte.InterfataCredit;
import ro.ase.cts.adapterobiecte.Leasing;

public class Program {

	public static void oferaInfoCredit(InterfataCredit credit, String numeClient, float suma) {
		credit.acordaCredit(numeClient, suma);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leasing leasing = new Leasing();
		AdapterCreditObj adapter = new AdapterCreditObj(leasing);
		oferaInfoCredit(adapter, "Ionel", 245.50f);
	}

}