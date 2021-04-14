package ro.ase.cts.decorator;

public class Card implements ICard {
	public String detinatorCard;
	
	public Card(String detinatorCard) {
		super();
		this.detinatorCard = detinatorCard;
	}

	public String getDetinatorCard() {
		return detinatorCard;
	}

	@Override
	public void platesteOnline() {
		System.out.println(detinatorCard + " a platit online.");
		
	}

	@Override
	public void platesteFizic() {
		System.out.println(detinatorCard + " a platit fizic.");
		
	}

}
