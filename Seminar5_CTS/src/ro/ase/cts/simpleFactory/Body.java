package ro.ase.cts.simpleFactory;

public class Body extends Categorie {

	public Body(float pretDeBaza) {
		super(pretDeBaza);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Body [pretDeBaza=");
		builder.append(pretDeBaza);
		builder.append("]");
		return builder.toString();
	}

	
}
