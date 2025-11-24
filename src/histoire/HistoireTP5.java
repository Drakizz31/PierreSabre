package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Samourai;
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
        Commercant marco = new Commercant("Marco", 20);
        Samourai akimoto = new Samourai("Akimoto", "saké", 80, "Miyamoto");   
        akimoto.faireConnaissanceAvec(marco);
        akimoto.listerConnaissance();
        
        // Scénario : le samouraï choisit une boisson
        akimoto.dire("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du thé.");
        akimoto.boire("thé");
    }
}
