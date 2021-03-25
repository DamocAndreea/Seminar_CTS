package ro.ase.acs.factoryMethod.main;

import ro.ase.acs.factoryMethod.Categorie;
import ro.ase.acs.factoryMethod.FactoryBody;
import ro.ase.acs.factoryMethod.FactoryCategorie;
import ro.ase.acs.factoryMethod.FactoryDurere;
import ro.ase.acs.factoryMethod.FactoryGripa;

public class Program {
	
	public static FactoryCategorie getTipFactory() {
		return new FactoryGripa();
	}
	
	public static void printeazaCategorie(FactoryCategorie factoryCategorie, float pretDeBaza) {
		Categorie categorie = factoryCategorie.createCategorie(pretDeBaza);
		System.out.println(categorie.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printeazaCategorie(getTipFactory(), 10);
	}

}
