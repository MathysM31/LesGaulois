package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois aste = new Gaulois("Ast�rix", 8);
		Romain minus = new Romain("Minus", 6);
		Gaulois obelix = new Gaulois("Ob�lix", 25);
		Druide pano = new Druide("Panoramix", 5, 10);
		pano.parler("Je vais aller pr�parer une petite potion...");
		pano.preparerPotion();
		pano.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		aste.boirePotion(2);
		aste.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		do {
			aste.frapper(minus);
		} while (minus.getForce()>0);
	}

}
