package ro.ase.cts.factoryMethod;

public class FactoryRaceala implements FactoryCategorie{

	@Override
	public Categorie createCategorie(float pretDeBaza) {
		
		return new Raceala(pretDeBaza);
	}

}
