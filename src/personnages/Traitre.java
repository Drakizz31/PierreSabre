package personnages;

import java.util.Random;

public class Traitre extends Samourai {
	private int niveauTraitrise;

	public Traitre(String nom, String boissonFavorite, int argent, String seigneur) {
		super(nom, boissonFavorite, argent, seigneur);
		this.niveauTraitrise = 0;
	}

	public int getNiveauTraitrise() {
		return niveauTraitrise;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon niveau de traîtrise est de " + niveauTraitrise + ".");
	}

	public void ranconner(Commercant commercant) {
		if (niveauTraitrise >= 3) {
			dire("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
			return;
		}
		int montant = 0;
		if (commercant.getNom().equals("Kumi"))
			montant = 2;
		else if (commercant.getNom().equals("Chonin"))
			montant = 8;
		else if (commercant.getNom().equals("Marco"))
			montant = 4;
		perdreArgent(0); 
		commercant.perdreArgent(montant);
		this.gagnerArgent(montant);
		niveauTraitrise++;
		dire("Si tu veux ma protection contre les Yakuzas, il va falloir payer !\nDonne-moi " + montant
				+ " sous ou gare à toi !");
		commercant.parler("Tout de suite grand Masako.");
	}

	public void faireLeGentil() {
		if (nbConnaissance == 0) {
			dire("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
			return;
		}
		Random rand = new Random();
		Humain humain = memoire[rand.nextInt(nbConnaissance)];
		int don = argent / 20;
		if (don > 0) {
			perdreArgent(don);
			humain.gagnerArgent(don);
			niveauTraitrise = Math.max(niveauTraitrise - 1, 0);
			dire("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + humain.getNom()
					+ ".");
			dire("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			humain.parler("Merci " + getNom() + ". Vous êtes quelqu'un de bien.");
		} else {
			dire("Je n'ai pas assez d'argent pour faire ami-ami.");
		}
	}

}
