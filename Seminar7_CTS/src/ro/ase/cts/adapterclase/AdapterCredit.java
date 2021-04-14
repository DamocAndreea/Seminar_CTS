package ro.ase.cts.adapterclase;

public class AdapterCredit extends Leasing implements InterfataCredit {

	public AdapterCredit() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acordaCredit(String numeClient, float suma) {
		// TODO Auto-generated method stub
		super.oferaLeasing(numeClient, suma);
	}

}
