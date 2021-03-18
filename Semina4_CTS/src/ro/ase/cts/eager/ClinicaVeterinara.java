package ro.ase.cts.eager;

public class ClinicaVeterinara {
	private String nume;
	private String adresa;
	private int numarMedici;
	private float buget;
	// instanta este initializata la momentul declararii la EagerInitialization
	private static final ClinicaVeterinara clinica = new ClinicaVeterinara("Clinica Vet", "Str. Dorobanti", 5, 3000.2f);

	// constructorul obligatoriu trebuie sa fie private!!!
	private ClinicaVeterinara(String nume, String adresa, int numarMedici, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.numarMedici = numarMedici;
		this.buget = buget;
	}

	// functia statica publica care va returna instanta
	public static ClinicaVeterinara getInstance() {
		return clinica;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClinicaVeterinara [nume=");
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
