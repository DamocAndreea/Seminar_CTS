package ro.ase.cts.prototype.classes;

public class Bilet implements AbstractPrototype {
	private int cod;
	private String echipaA;
	private String echipaB;
	private String data;

	// validari
	public Bilet(int cod, String echipaA, String echipaB, String data) {
		super();
		this.cod = cod;
		this.echipaA = echipaA;
		this.echipaB = echipaB;
		this.data = data;
	}

	private Bilet() {
		super();
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bilet [cod=");
		builder.append(cod);
		builder.append(", echipaA=");
		builder.append(echipaA);
		builder.append(", echipaB=");
		builder.append(echipaB);
		builder.append(", data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public AbstractPrototype copiaza() {
		Bilet bilet = new Bilet();
		bilet.cod = this.cod;
		bilet.data=this.data;
		bilet.echipaA=this.echipaA;
		bilet.echipaB=this.echipaB;
		
		return bilet;
	}

}
