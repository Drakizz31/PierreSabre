package personnages;

public class Ronin extends Humain {
    private int honneur;

    public Ronin(String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent);
        honneur = 1;
    }

    public void donner(Commercant beneficiaire) {
        int montant = argent / 10;
        argent -= montant;
        parler(beneficiaire.getNom() + " prend ces " + montant + " sous.");
        beneficiaire.recevoir(montant);
    }

	public void provoquer(Yakuza adversaire) {
        int force = honneur * 2;
        parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
        if (force >= adversaire.getReputation()) {
            int gain = adversaire.perdre();
            argent += gain;
            honneur++;
            parler("Je t’ai eu petit yakusa!");
            adversaire.afficherDefaite(gain);
        } else {
            int perte = argent;
            argent = 0;
            honneur = Math.max(honneur - 1, 0);
            adversaire.gagner(perte);
        }
    }
}