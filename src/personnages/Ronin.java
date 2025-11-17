package personnages;

public class Ronin extends Humain {
    private int honneur;

    public Ronin(String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent);
        this.honneur = 1; 
    }


    public void donner(Commercant beneficiaire) {
        int montant = this.argent / 10; 
        this.argent -= montant;         
        parler(beneficiaire.getNom() + " prend ces " + montant + " sous."); 
        beneficiaire.recevoir(montant); 
    }


    public int getHonneur() {
        return honneur;
    }
}
