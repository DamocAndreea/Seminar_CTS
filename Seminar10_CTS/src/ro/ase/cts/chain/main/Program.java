package ro.ase.cts.chain.main;

import ro.ase.cts.chain.classes.Cont;
import ro.ase.cts.chain.classes.ContCredit;
import ro.ase.cts.chain.classes.ContCurent;
import ro.ase.cts.chain.classes.ContEconomii;
import ro.ase.cts.chain.classes.ContIndisponibil;

public class Program {

	public static void main(String[] args) {
		Cont contCurent = new ContCurent(1500, "Andreea", null);
		Cont contCredit = new ContCredit(1000, "Andreea", null);
		Cont contEconomii = new ContEconomii(3000, "Andreea", null);
		Cont contIndisponibil = new ContIndisponibil("Andreea");

		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(contIndisponibil);
		
		contCurent.plateste(3500);
	}

}
