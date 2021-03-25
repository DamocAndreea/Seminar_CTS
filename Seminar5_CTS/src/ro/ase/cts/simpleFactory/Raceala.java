package ro.ase.cts.simpleFactory;

public class Raceala extends Categorie {

	public Raceala(float pretDeBaza) {
		super(pretDeBaza);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Raceala [pretDeBaza=");
		builder.append(pretDeBaza);
		builder.append("]");
		return builder.toString();
	}
	
	
}
