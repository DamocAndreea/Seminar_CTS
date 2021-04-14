package ro.ase.cts.decorator;

public abstract class AbstractDecorator implements ICard {
	private ICard card;

	public AbstractDecorator(ICard card) {
		super();
		this.card = card;
	}

	public ICard getCard() {
		return card;
	}

	@Override
	public void platesteOnline() {
		card.platesteOnline();

	}

	@Override
	public void platesteFizic() {
		card.platesteFizic();

	}

	@Override
	public String getDetinatorCard() {
		return card.getDetinatorCard();
	}
	
	public abstract void platesteContactless();
}
