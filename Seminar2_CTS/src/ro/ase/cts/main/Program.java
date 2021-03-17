package ro.ase.cts.main;

import ro.ase.cts.readers.AplicantReader;
import ro.ase.cts.readers.StudentReader;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.classes.Angajat;
import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.classes.Proiect;
import ro.ase.cts.classes.Student;

public class Program {

	public static List<Aplicant> citesteAplicanti(AplicantReader reader)
			throws NumberFormatException, FileNotFoundException {
		return reader.citesteAplicanti();
	}

	public static void main(String[] args) {

		System.out.println(Student.getSumaFinantare());
		System.out.println(Angajat.getSumaFinantare());
		List<Aplicant> listaAplicanti;
		AplicantReader aplicantReader = new StudentReader("studenti.txt");
		try {
			listaAplicanti = citesteAplicanti(aplicantReader);
			Proiect proiect = new Proiect(80);
			for (Aplicant angajat : listaAplicanti) {
				System.out.println(angajat.toString());
				angajat.afiseazaStatus(proiect);
				System.out.println(angajat.getSumaFinantata());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
