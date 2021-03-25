package ro.ase.cts.simpleFactory;

public class CategorieFactory {
	public Categorie creareCategorie(
			CategoriiMedicamente categoriiMedicamente, float pretDeBaza) throws Exception {
		switch (categoriiMedicamente) {
			case Raceala:
				return new Raceala(pretDeBaza);
			case Durere:
				return new Durere(pretDeBaza);
			case Body:
				return new Body(pretDeBaza);
			default:
				throw new Exception("Categorie incorecta!");
		}
			
	}
}
