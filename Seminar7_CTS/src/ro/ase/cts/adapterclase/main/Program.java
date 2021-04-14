package ro.ase.cts.adapterclase.main;

import ro.ase.cts.adapterclase.AdapterCredit;
import ro.ase.cts.adapterclase.InterfataCredit;

public class Program {
	public static void oferaInfoCredit(InterfataCredit credit, String numeClient, float suma) {
		credit.acordaCredit(numeClient, suma);
	}
	
	public static void main(String[] args) {
		AdapterCredit adapterCredit = new AdapterCredit();
		oferaInfoCredit(adapterCredit, "Gigel", 322.43f);

	}

}
