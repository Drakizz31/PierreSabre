package personnages;

public class Samourai extends Ronin {
	private String seigneur;

	public Samourai(String seigneur, String nom, String boissonFavorite, int argent) {
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
	    parler("Bonjour ! Je m’appelle " + this.nom + " et j’aime boire du " + boissonFavorite + ".");
	    parler("Je suis fier de servir le seigneur " + seigneur + ".");
	}

}
