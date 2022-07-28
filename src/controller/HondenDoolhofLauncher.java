package controller;

import model.Beweging;
import model.LandkaartMetStrepen;
import model.RouteUitstippelaar;

import java.util.Scanner;

public class HondenDoolhofLauncher {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        LandkaartMetStrepen landkaartMetStrepen = new LandkaartMetStrepen();
        RouteUitstippelaar routeUitstippelaar = new RouteUitstippelaar();

        System.out.print("Hallo hondje. Welke kant wil je op?\n" +
                "1. links\n2. rechts\n3. vooruit\n4. achteruit\n9. stop ");
        int richting = keyboard.nextInt();
        String opgegevenRichting = "";
        int opgegevenAfstand = 0;
        int aantalCheckpoints = 0;


        while (richting != 9) {

            switch (richting) {
                case 1:
                    opgegevenRichting = "links";
                    break;
                case 2:
                    opgegevenRichting = "rechts";
                    break;
                case 3:
                    opgegevenRichting = "vooruit";
                    break;
                case 4:
                    opgegevenRichting = "achteruit";
                    break;
            }

            System.out.println("Hoeveel meter wil je afleggen? ");
            opgegevenAfstand = keyboard.nextInt();
            landkaartMetStrepen.setBeweging(new Beweging(opgegevenRichting, opgegevenAfstand));
            routeUitstippelaar.voegToe(landkaartMetStrepen.bewaarBewegingInCheckpoint());

            System.out.println("Huidige status: " + landkaartMetStrepen.getBeweging());
            if (aantalCheckpoints > 0) {
                landkaartMetStrepen.haalBewegingUitCheckpoint(routeUitstippelaar.get(aantalCheckpoints - 1));
                System.out.println("Vorige status: " + landkaartMetStrepen.getBeweging());
            }
            aantalCheckpoints ++;
            System.out.println("Hallo hondje. Welke kant wil je op?\n" +
                    "1. links\n2. rechts\n3. vooruit\n4. achteruit\n9. stop ");
            richting = keyboard.nextInt();
        }

//        landkaartMetStrepen.setBeweging(new Beweging("links", 500));
//        landkaartMetStrepen.setBeweging(new Beweging("rechtdoor", 600));
//        routeUitstippelaar.voegToe(landkaartMetStrepen.bewaarBewegingInCheckpoint());
//
//        landkaartMetStrepen.setBeweging(new Beweging("rechts", 400));
//        landkaartMetStrepen.setBeweging(new Beweging("achteruit", 700));
//        routeUitstippelaar.voegToe(landkaartMetStrepen.bewaarBewegingInCheckpoint());



    }
}
