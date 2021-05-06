package ro.ase.cts.command.classes;

public class Retragere extends Command {

	public Retragere(ContBancar cont, float suma) {
		super(cont, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.getCont().retragere(super.getSuma());

	}

}
