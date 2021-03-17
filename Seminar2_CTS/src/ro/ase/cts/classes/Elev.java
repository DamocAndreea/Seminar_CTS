package ro.ase.cts.classes;

public class Elev extends Aplicant {
	private int clasa;
	private String tutore;
	private static int sumaFinantare = 30;

	public int getClasa() {
		return clasa;
	}

	public void setClasa(int i) {
		this.clasa = i;
	}

	public String getTutore() {
		return tutore;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	public static int getSumaFinantare() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(int sumaFinantare) {
		Elev.sumaFinantare = sumaFinantare;
	}

	@Override
	public String toString() {
		return "Elev: " + super.toString() + "Clasa=" + clasa + ", Tutore=" + tutore;
	}

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect,
			int clasa, String tutore) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public int finantare() {
		int s = 30;
		System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + s + " Euro/zi in proiect.");
		return s;
	}

	@Override
	public float getSumaFinantata() {
		// TODO Auto-generated method stub
		return sumaFinantare;
	}

}
