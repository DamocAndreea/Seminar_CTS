package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.AbstractDecorator;
import ro.ase.cts.decorator.Card;
import ro.ase.cts.decorator.ConcretDecorator;
import ro.ase.cts.decorator.ICard;

public class Program {

	public static void main(String[] args) {
		ICard card = new Card("Maria");
		card.platesteFizic();
		card.platesteOnline();
		
		AbstractDecorator decorator = new ConcretDecorator(card);
		decorator.platesteContactless();
	}

}
