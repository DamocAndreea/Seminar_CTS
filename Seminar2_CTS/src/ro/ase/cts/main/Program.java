package ro.ase.cts.main;

import ro.ase.cts.readers.AngajatReader;
import ro.ase.cts.readers.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.classes.Angajat;
import ro.ase.cts.classes.Aplicant;

public class Program {

	public static List<Aplicant> citesteAplicanti(AplicantReader reader) throws NumberFormatException, FileNotFoundException{
		return reader.citesteAplicanti();
	}
	
	public static void main(String[] args) {
		
		List<Aplicant> listaAplicanti;
		
		try {
			listaAplicanti = citesteAplicanti(new AngajatReader("angajati.txt"));
			for(Aplicant angajat:listaAplicanti)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
