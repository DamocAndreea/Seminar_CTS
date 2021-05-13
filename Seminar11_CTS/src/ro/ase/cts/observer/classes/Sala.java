package ro.ase.cts.observer.classes;

import java.util.ArrayList;
import java.util.List;

public class Sala implements Subiect {
	private List<Observer> observeri;
	private String numeSala;

	public Sala(String numeSala) {
		super();
		this.observeri = new ArrayList<>();
		this.numeSala = numeSala;
	}

	@Override
	public void aboneazaClient(Observer observer) {
		observeri.add(observer);

	}

	@Override
	public void dezaboneazaClient(Observer observer) {
		observeri.remove(observer);

	}

	@Override
	public void trimiteMesaj(String mesaj) {
		for (Observer obs : observeri) {
			obs.receptionareMesaj(numeSala + ": " + mesaj);
		}
	}

	public void anuntaMeciFotbal() {
		trimiteMesaj("Urmeaza un meci de fotbal.");
	}

	public void anuntaMeciVolei() {
		trimiteMesaj("Urmeaza un meci de volei.");
	}

}
