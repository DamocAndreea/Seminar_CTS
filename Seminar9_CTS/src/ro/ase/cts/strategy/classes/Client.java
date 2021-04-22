package ro.ase.cts.strategy.classes;

public class Client {
	private ModPlata modPlata;
	private String numeClient;

	public ModPlata getModPlata() {
		return modPlata;
	}

	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}

	public Client(ModPlata modPlata, String numeClient) {
		super();
		this.modPlata = modPlata;
		this.numeClient = numeClient;
	}

	public Client(String numeClient) {
		super();
		this.numeClient = numeClient;
		this.modPlata= new Cash();
		
	}
	
	public void platesteNota(double suma) {
		System.out.println(numeClient + " trebuie sa realizeze o plata.");
		modPlata.plateste(suma);
	}
	

	
}
