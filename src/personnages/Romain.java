package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement;
	
	public Romain(String nom, int force) {
		assert (force>0);
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2];
	}

	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert (force>0);
		int forceAvantCoup = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}
		assert (forceAvantCoup > force);
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:{
			System.out.println("Le soldat "+getNom()+" est déjà bien protégé !");
			break;
		}
		
		case 1:{
			if (equipements[0]==equipement) {
				System.out.println("Le soldat "+getNom()+" possède déjà un "+equipement+" !");
				break;
			}
			else {
				equiper(equipement);
				break;
			}
		}

		default:
			equiper(equipement);
			break;
		}
	}
		
	private void equiper(Equipement equipement) {
		equipements[nbEquipement] = equipement;
		nbEquipement++;
		System.out.println("Le soldat " + nom + " s'equipe d'un " + equipement + ".");
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		System.out.println(minus.prendreParole());
		minus.parler("Bonjour");
		minus.recevoirCoup(5);
		minus.recevoirCoup(10);
		System.out.println(Equipement.BOUCLIER);
		System.out.println(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}

}

