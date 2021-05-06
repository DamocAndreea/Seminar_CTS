package ro.ase.cts.command.classes;

public class Constituire extends Command {

	public Constituire(ContBancar cont, float suma) {
		super(cont, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {

		super.getCont().constituire(super.getSuma());
	}

}
