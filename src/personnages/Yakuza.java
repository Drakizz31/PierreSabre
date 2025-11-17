package personnages;

public class Yakuza extends Humain {
	protected String clan;
	private int reputation;

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
		this.reputation = 4;
	}

	public int getReputation() {
		return reputation;
	}

	public String getClan() {
		return clan;
	}

	public int perdre() {
		int perte = argent;
		argent = 0;
		reputation = Math.max(reputation - 1, 0);
		return perte;
	}

	public void gagner(int gain) {
		argent += gain;
		reputation++;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentVole = victime.seFaireExtorquer();
		argent += argentVole;
		reputation++;
		parler("J’ai piqué les " + argentVole + " sous de " + victime.getNom() + ", ce qui me fait " + argent
				+ " sous dans ma poche. Hi ! Hi !");
	}

	public void afficherDefaite(int argentPerdu) {
		parler("J’ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
	}
	
}
