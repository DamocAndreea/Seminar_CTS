package ro.ase.acs.factoryMethod;

public class FactoryBody implements FactoryCategorie{

	@Override
	public Categorie createCategorie(float pretDeBaza) {
		
		return new Body(pretDeBaza);
	}
	
	
}
