package ro.ase.cts.factoryMethod;

public class Gripa extends Categorie {

	public Gripa(float pretDeBaza) {
		super(pretDeBaza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gripa [pretDeBaza=");
		builder.append(pretDeBaza);
		builder.append("]");
		return builder.toString();
	}

}
