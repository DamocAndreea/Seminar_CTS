package ro.ase.cts.threadSafe;

public class Advertising {
	private String numeRevista;
	private String adresaRedactie;
	private int numarAngajati;
	private float buget;
	
	private static Advertising instanta = null;

	private Advertising(String numeRevista, String adresaRedactie, int numarAngajati, float buget) {
		super();
		this.numeRevista = numeRevista;
		this.adresaRedactie = adresaRedactie;
		this.numarAngajati = numarAngajati;
		this.buget = buget;
	}
	
	public static synchronized Advertising getInstance(String numeRevista, String adresaRedactie, int numarAngajati, float buget) {
		if (instanta == null) {
			instanta = new Advertising(numeRevista, adresaRedactie, numarAngajati, buget);
		}
		return instanta;
	}

	public void setNumeRevista(String numeRevista) {
		this.numeRevista = numeRevista;
	}

	public void setAdresaRedactie(String adresaRedactie) {
		this.adresaRedactie = adresaRedactie;
	}

	public void setNumarAngajati(int numarAngajati) {
		this.numarAngajati = numarAngajati;
	}

	public void setBuget(float buget) {
		this.buget = buget;
	}

	public static void setInstanta(Advertising instanta) {
		Advertising.instanta = instanta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Advertising [numeRevista=");
		builder.append(numeRevista);
		builder.append(", adresaRedactie=");
		builder.append(adresaRedactie);
		builder.append(", numarAngajati=");
		builder.append(numarAngajati);
		builder.append(", buget=");
		builder.append(buget);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
