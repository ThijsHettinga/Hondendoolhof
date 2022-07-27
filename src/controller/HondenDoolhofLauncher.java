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

        System.out.println("Hallo hondje. Welke kant wil je op?\n" +
                "1. links\n2. rechts\n3. vooruit\n4. achteruit ");

        landkaartMetStrepen.setBeweging(new Beweging("links", 500));
        landkaartMetStrepen.setBeweging(new Beweging("rechtdoor", 600));
        routeUitstippelaar.voegToe(landkaartMetStrepen.bewaarBewegingInCheckpoint());

        landkaartMetStrepen.setBeweging(new Beweging("rechts", 400));
        landkaartMetStrepen.setBeweging(new Beweging("achteruit", 700));
        routeUitstippelaar.voegToe(landkaartMetStrepen.bewaarBewegingInCheckpoint());

        System.out.println("Huidige status: " + landkaartMetStrepen.getBeweging());

        landkaartMetStrepen.haalBewegingUitCheckpoint(routeUitstippelaar.get(0));
        System.out.println("Vorige status: " + landkaartMetStrepen.getBeweging());

    }
}
