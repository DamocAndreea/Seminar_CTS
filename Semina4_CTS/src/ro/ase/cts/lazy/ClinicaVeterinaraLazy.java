package ro.ase.cts.lazy;

public class ClinicaVeterinaraLazy {
	private String nume;
	private String adresa;
	private int numarMedici;
	private float buget;

	private static ClinicaVeterinaraLazy instanta = null;

	private ClinicaVeterinaraLazy(String nume, String adresa, int numarMedici, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.numarMedici = numarMedici;
		this.buget = buget;
	}

	public static ClinicaVeterinaraLazy getInstance(String nume, String adresa, int numarMedici, float buget) {
		if (instanta == null) {
			instanta = new ClinicaVeterinaraLazy(nume, adresa, numarMedici, buget);
		}
		return instanta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClinicaVeterinaraLazy [nume=");
		builder.append(nume);
		builder.append(", adresa=");
		builder.append(adresa);
		builder.append(", numarMedici=");
		builder.append(numarMedici);
		builder.append(", buget=");
		builder.append(buget);
		builder.append("]");
		return builder.toString();
	}

}
