package personnages;

public class Samourai extends Ronin {
	private String seigneur;

	public Samourai(String nom, String boissonFavorite, int argent, String seigneur) {
	    super(nom, boissonFavorite, argent); 
	    this.seigneur = seigneur;
	}
	
	public void boire(String boisson) {
	    parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}


	public void dire(String texte) {
	    System.out.println("(" + nom + ") - " + texte);
	}

	public String getSeigneur() {
		return seigneur;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je sers le seigneur " + seigneur + ".");
	}
}
