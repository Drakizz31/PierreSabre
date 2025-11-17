package personnages;

public class Yakuza extends Humain {
    private String clan;
    private int reputation;

    public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
        super(nom, boissonFavorite, argent);
        this.clan = clan;
        this.reputation = 0; // par défaut
    }

    public void extorquer(Commercant victime) {
        parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
        
        int argentVole = victime.seFaireExtorquer();
        this.argent += argentVole;
        reputation += 1;

        parler("J’ai piqué les " + argentVole + " sous de " + victime.getNom() +
               ", ce qui me fait " + argent + " sous dans ma poche. Hi ! Hi !");
    }

    public int getReputation() {
        return reputation;
    }

    public String getClan() {
        return clan;
    }
}
