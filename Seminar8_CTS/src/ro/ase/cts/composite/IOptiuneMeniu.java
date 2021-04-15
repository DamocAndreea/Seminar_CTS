package ro.ase.cts.composite;

public interface IOptiuneMeniu {
	void adaugaNod(IOptiuneMeniu optiune) throws Exception;

	void stergereNod(IOptiuneMeniu optiune);

	IOptiuneMeniu getNod(int index);

	void descriere();
}
