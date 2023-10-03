package personnages;

import java.util.Random;
import java.util.random.*;

public class Druide {
	
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}
	
	public void preparerPotion( ) {
		Random rnd = new Random();
	    forcePotion = rnd.nextInt(effetPotionMax+1-effetPotionMin);
	    forcePotion += effetPotionMin;
	    if (forcePotion > 7) {
			parler("J'ai pr�par� une super potion de force : " + forcePotion +" ");
		} else {
			parler("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force : " + forcePotion +" ");
		}
	}
	
	public void booster(Gaulois gaulois) {
		if ("Ob�lix".equals(gaulois.getNom())) {
			parler("Non, Ob�lix !... Tu n�auras pas de potion magique ");
		}
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public static void main(String[] args) {
		Druide pano = new Druide("Panoramix",5,10);
		pano.preparerPotion();
		Gaulois obelix = new Gaulois("Ob�lix",25);
		pano.booster(obelix);
	}
}
