package ro.ase.cts.state.main;

import ro.ase.cts.state.classes.Masa;
import ro.ase.cts.state.classes.StareLibera;

public class Program {

	public static void main(String[] args) {
		Masa masa = new Masa(1);
		masa.rezervaMasa();
		masa.rezervaMasa();
		
		//masa.setStareMasa(new StareLibera()); nu mai putem modifica deoarece am schimbat in clasa Masa
		//setter-ul in tipul default 
		masa.ocupaMasa();
		masa.elibereazaMasa();
	}

}
