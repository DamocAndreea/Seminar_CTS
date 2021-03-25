package ro.ase.acs.factoryMethod;

public class FactoryDurere implements FactoryCategorie{

	@Override
	public Categorie createCategorie(float pretDeBaza) {
		
		return new Durere(pretDeBaza);
	}

}
