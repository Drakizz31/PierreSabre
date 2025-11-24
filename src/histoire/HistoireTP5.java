package histoire;

import personnages.Commercant;
import personnages.GrandMere;
import personnages.Humain;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.Yakuza;


public class HistoireTP5 {
    public static void main(String[] args) {
//        Commercant marco = new Commercant("Marco", 20);
//        Commercant chonin = new Commercant("Chonin", 40);
//        Commercant kumi = new Commercant("Kumi", 10);
//        Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
//        Ronin roro = new Ronin("Roro", "shochu", 60);
//
//        marco.faireConnaissanceAvec(roro);
//        marco.faireConnaissanceAvec(yaku);
//        marco.faireConnaissanceAvec(chonin);
//        marco.faireConnaissanceAvec(kumi);
//
//        marco.listerConnaissance();
//        roro.listerConnaissance();
//        yaku.listerConnaissance();
        
        
        // Test Samurai
//        Commercant marco = new Commercant("Marco", 20);
//        Samourai akimoto = new Samourai("Akimoto", "saké", 80, "Miyamoto");   
//        akimoto.faireConnaissanceAvec(marco);
//        akimoto.listerConnaissance();
//        
//        // Scénario : le samouraï choisit une boisson
//        akimoto.dire("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du thé.");
//        akimoto.boire("thé");
    	
    	//Test Traitre
//    	Commercant marco = new Commercant("Marco", 20);
//        Commercant chonin = new Commercant("Chonin", 40);
//        Commercant kumi = new Commercant("Kumi", 10);
//        Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
//        Samourai akimoto = new Samourai("Akimoto", "saké", 80, "Miyamoto");
//        Ronin roro = new Ronin("Roro", "shochu", 60);
//        Traitre masako = new Traitre("Masako", "whisky", 100, "Miyamoto");
//        masako.faireLeGentil();
//        masako.ranconner(kumi);
//        masako.ranconner(chonin);
//        masako.ranconner(marco);
//        masako.faireConnaissanceAvec(akimoto);
//        masako.faireConnaissanceAvec(yaku);
//        akimoto.direBonjour();
//        masako.direBonjour();
//        masako.faireLeGentil();
//        masako.direBonjour();
//        yaku.direBonjour();
//        roro.direBonjour();
    	
    	//Test GrandMere
    	Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);
    	Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 30);
    	Commercant kumi = new Commercant("Kumi", 50);
    	Commercant marco = new Commercant("Marco", 50);
    	Commercant chonin = new Commercant("Chonin", 50);
    	Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 80, "Warsong");
    	GrandMere grandMere = new GrandMere("Grand-Mère", 10);

    	masako.ranconner(kumi);
    	masako.ranconner(marco);

    	grandMere.faireConnaissanceAvec(akimoto);
    	grandMere.faireConnaissanceAvec(yaku);
    	grandMere.faireConnaissanceAvec(masako);
    	grandMere.faireConnaissanceAvec(kumi);
    	grandMere.faireConnaissanceAvec(marco);
    	grandMere.faireConnaissanceAvec(chonin);

    	grandMere.ragoter();



    }
}
