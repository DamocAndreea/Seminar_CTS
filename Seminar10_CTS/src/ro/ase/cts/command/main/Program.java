package ro.ase.cts.command.main;

import ro.ase.cts.command.classes.Command;
import ro.ase.cts.command.classes.Constituire;
import ro.ase.cts.command.classes.ContBancar;
import ro.ase.cts.command.classes.Depunere;
import ro.ase.cts.command.classes.ManagerComenzi;
import ro.ase.cts.command.classes.Retragere;

public class Program {

	public static void main(String[] args) {

		ManagerComenzi manager = new ManagerComenzi();
		manager.invoca(new Constituire(new ContBancar("Valeria"), 500f));
		manager.invoca(new Depunere(new ContBancar("Oana"), 200f));

		manager.executaComanda();

		manager.invoca(new Retragere(new ContBancar("Cosmina"), 600f));

		manager.executaComanda();
		manager.executaComanda();

	}

}
