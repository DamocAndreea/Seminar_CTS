package ro.ase.cts.main;

import ro.ase.cts.Categorie;
import ro.ase.cts.CategorieFactory;
import ro.ase.cts.CategoriiMedicamente;

public class Main {

	public static CategoriiMedicamente getTipCategorie() {
		return CategoriiMedicamente.Body;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CategorieFactory factory = new CategorieFactory();
			Categorie durere = factory.creareCategorie(CategoriiMedicamente.Durere, 5);
			Categorie body = factory.creareCategorie(CategoriiMedicamente.Body, 10);
			Categorie categorie = factory.creareCategorie(getTipCategorie(), 15);
			
			System.out.println(durere.toString());
			System.out.println(body.toString());
			System.out.println(categorie.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
