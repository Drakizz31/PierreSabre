package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {

// TEST HUMAIN
//		Humain prof = new Humain("Prof", "kombucha", 54);
//
//		prof.direBonjour();
//
//		prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous");
//		prof.boire();
//		prof.acheter("boisson", 12);
//
//		prof.parler("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir un jeu à 2 sous");
//		prof.acheter("jeu", 2);
//
//		prof.parler("Je n'ai plus que " + prof.getArgent()
//				+ " sous en poche. Je ne peux même pas m'offrir un kimono à 50 sous.");
	
//		
//		TEST COMMERCANT
//		Commercant marco = new Commercant("Marco", 20);
//
//        marco.direBonjour();
//        marco.seFaireExtorquer();
//        marco.recevoir(15);
//        marco.boire();
        //TEST YAKUZA
//        Commercant marco = new Commercant("Marco", 20);
//        Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
//
//        yaku.direBonjour();
//        yaku.extorquer(marco);
        
        Commercant marco = new Commercant("Marco", 20); // commerçant déjà créé
        Ronin roro = new Ronin("Roro", "shochu", 60);

        roro.direBonjour();
        roro.donner(marco);
	}
}