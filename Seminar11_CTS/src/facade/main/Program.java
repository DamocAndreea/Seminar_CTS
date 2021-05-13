package facade.main;

import facade.classes.*;

public class Program {

	public static void main(String[] args) {
		Pacient p1 = new Pacient("Dani", false);
		Pacient p2 = new Pacient("Catalin", true);

		System.out.println(FacadeInternarePacient.verificaPacient(p1));
		System.out.println(FacadeInternarePacient.verificaPacient(p2));
	}

}
