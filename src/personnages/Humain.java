package personnages;

public class Humain {
	protected String nom;
	protected String boissonFavorite;
	protected int argent;
	protected Humain[] memoire = new Humain[30];
    protected int nbConnaissance = 0;

	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			perdreArgent(prix);
			parler("J’ai acheté " + bien + " pour " + prix + " sous.");
		} else {
			parler("Je n’ai pas assez d’argent pour acheter " + bien + "...");
		}
	}
	public void memoriser(Humain humain) {
        if (nbConnaissance < 30) {
            memoire[nbConnaissance] = humain;
            nbConnaissance++;
        } else {
            for (int i = 1; i < 30; i++) {
                memoire[i - 1] = memoire[i];
            }
            memoire[29] = humain;
        }
    }
	public void repondre(Humain humain) {
        direBonjour();
        memoriser(humain);
    }
	
	public void faireConnaissanceAvec(Humain humain) {
        direBonjour();
        humain.repondre(this);
        memoriser(humain);
    }

    public void listerConnaissance() {
        System.out.print("(" + nom + ") - Je connais : ");
        for (int i = 0; i < nbConnaissance; i++) {
            System.out.print(memoire[i].getNom() + ", ");
        }
        System.out.println();
    }
}
