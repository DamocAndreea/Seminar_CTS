package ro.ase.cts.main;

import ro.ase.cts.eager.ClinicaVeterinara;
import ro.ase.cts.lazy.ClinicaVeterinaraLazy;
import ro.ase.cts.threadSafe.Advertising;

public class Program {

	public static void main(String[] args) {
//		ClinicaVeterinara clinica1 = ClinicaVeterinara.getInstance();
//		ClinicaVeterinara clinica2 = ClinicaVeterinara.getInstance();
//
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
		
//		ClinicaVeterinaraLazy cl1 = ClinicaVeterinaraLazy.getInstance("ClinVet", "Str. Independentei",4, 4500.45f);
//		ClinicaVeterinaraLazy cl2 = ClinicaVeterinaraLazy.getInstance("VetClin","Str. Libertatii",5, 2500.45f);
//		
//		System.out.println(cl1.toString());
//		System.out.println(cl2.toString());
//		
//		cl1.setNume("Clinica 1!");
//		cl2.setNumarMedici(45);
//		
//		System.out.println(cl1.toString());
//		System.out.println(cl2.toString());
		
		Advertising ad1 = Advertising.getInstance("Unica", "Str. Primaverii",4, 4500.45f);
		Advertising ad2 = Advertising.getInstance("Perfect","Str. Sperantei",5, 2500.45f);
		
		System.out.println(ad1.toString());
		System.out.println(ad2.toString());
		
		ad1.setNumeRevista("Revista super");
		ad2.setNumarAngajati(12);
		
		System.out.println(ad1.toString());
		System.out.println(ad2.toString());
	}

}
