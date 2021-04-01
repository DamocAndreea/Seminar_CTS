package ro.ase.cts.builderV1.main;

import ro.ase.cts.builderV1.classes.Builder;
import ro.ase.cts.builderV1.classes.Rezervare;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare1 = new Builder().setCodRezervare(2).setBauturaRacoritoare(true).build();
		
		System.out.println(rezervare1.toString());
		
		Rezervare rezervare2 = new Builder().setCodRezervare(3).setMancareInclusa(true).build();
		
		System.out.println(rezervare2.toString());
		
		Rezervare rezervare3 = new Builder().setCodRezervare(5).setBauturaRacoritoare(true).build();
		
		System.out.println(rezervare3.toString());
	}

}
