package ro.ase.acs.factoryMethod;

public class Durere extends Categorie {

	public Durere(float pretDeBaza) {
		super(pretDeBaza);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Durere [pretDeBaza=");
		builder.append(pretDeBaza);
		builder.append("]");
		return builder.toString();
	}

	
}
