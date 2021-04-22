package ro.ase.cts.state.classes;

public class StareOcupata implements StareMasa {

	@Override
	public void modificaStare(Masa masa) {
		if (!(masa.getStareMasa() instanceof StareOcupata)) {
			System.out.println("Masa cu numarul " + masa.getNrMasa() + " poate fi ocupata.");
			masa.setStareMasa(this);
		} else {
			System.out.println("Masa este deja ocupata.");
		}
	}

}
