package ro.ase.cts.command.classes;

public abstract class Command {
	private ContBancar cont;
	private float suma;

	public Command(ContBancar cont, float suma) {
		super();
		this.cont = cont;
		this.suma = suma;
	}

	public abstract void executa();

	public ContBancar getCont() {
		return cont;
	}

	public float getSuma() {
		return suma;
	}

}
