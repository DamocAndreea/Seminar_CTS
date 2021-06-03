package clase;

import java.util.List;

public class FakeStudent implements IStudent {
	private String nume;
	private float medie;
	private boolean areRestanta;
	
	public FakeStudent(String nume, float medie, boolean areRestanta) {
		super();
		this.nume = nume;
		this.medie = medie;
		this.areRestanta = areRestanta;
	}
	
	public FakeStudent() {
		
	}

	public void setMedie(float medie) {
		this.medie = medie;
	}

	public void setAreRestanta(boolean areRestanta) {
		this.areRestanta = areRestanta;
	}

	@Override
	public String getNume() {
		return nume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		return medie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return areRestanta;
	}
	
}
