package personnages;

import java.util.Random;

public class GrandMere extends Humain {

    private static enum TypeHumain {
        ronin, grand_mère, samouraï, habitant, yakuza
    }

    public GrandMere(String nom, int argent) {
        super(nom, "tisane", argent);
    }

    private String humainHasard() {
        Random r = new Random();
        TypeHumain[] valeurs = TypeHumain.values();
        return valeurs[r.nextInt(valeurs.length)].toString();
    }

    public void ragoter() {
        for (Humain h : memoire) {
            if (h == null) continue;
            String nom = h.getNom();
            if (h instanceof Traitre) {
                parler("Je sais que " + nom + " est un traître. Petit chenapan !");
            } else {
                parler("Je crois que " + nom + " est un " + humainHasard());
            }
        }
    }

}
