package ro.ase.cts.simpleFactory;

public abstract class Categorie {
	public float pretDeBaza;

	public Categorie(float pretDeBaza) {
		super();
		this.pretDeBaza = pretDeBaza;
	}

	public float getPretDeBaza() {
		return pretDeBaza;
	}
	
}
