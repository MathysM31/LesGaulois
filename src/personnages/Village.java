package personnages;

import java.util.Iterator;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}

	public String getNom() {
		return nom;
	}
	

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois<villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
		}
	}
	
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef "+ chef.getNom() +" vivent les légendaires gaulois :");
		for (int i=0;i<nbVillageois;i++) {
			System.out.println("- "+ villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30 );
//		Gaulois gaulois = village.trouverHabitant(30); Il y a une levée d'exception car l'indice 30 est trop grand pour un tableau de 30 éléments maximum 
		Chef abra = new Chef("Abraracourcix",6,village);
		village.setChef(abra);
		Gaulois aste = new Gaulois("Astérix",8);
		village.ajouterHabitant(aste);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);          Cela print "null" car asterix est en position 0 dans le tableau et non 1
		Gaulois obelix = new Gaulois("Obélix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
	
}
