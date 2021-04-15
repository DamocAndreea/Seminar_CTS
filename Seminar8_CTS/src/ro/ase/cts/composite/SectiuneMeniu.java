package ro.ase.cts.composite;

import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu implements IOptiuneMeniu {
	List<IOptiuneMeniu> lista;
	private String numeSectiune;

	public SectiuneMeniu(String numeSectiune) {

		this.lista = new ArrayList<>();
		this.numeSectiune = numeSectiune;
	}

	@Override
	public void adaugaNod(IOptiuneMeniu optiune) {
		lista.add(optiune);

	}

	@Override
	public void stergereNod(IOptiuneMeniu optiune) {
		lista.remove(optiune);

	}

	@Override
	public IOptiuneMeniu getNod(int index) {

		return lista.get(index);
	}

	@Override
	public void descriere() {
		System.out.println("Sectiunea " + numeSectiune);
		for (IOptiuneMeniu optiune : lista) {
			optiune.descriere();
		}

	}

}