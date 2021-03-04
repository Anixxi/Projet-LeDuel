package appli;

import java.util.ArrayList;
import java.util.Collections;

public class Pioche {

    private static ArrayList<Integer> piocheNord;
    private static ArrayList<Integer> piocheSud;

    public Pioche(){
        piocheNord = new ArrayList<>();
        piocheSud = new ArrayList<>();

    }

    public void initaliserLesCartes() {
        for(int i = 2; i < 60; i++) {
            piocheNord.add(i);
            piocheSud.add(i);
        }
        Collections.shuffle(piocheNord);
        Collections.shuffle(piocheSud);
    }

    public int piocheTailleSud() {
        return piocheSud.size();
    }

    public int piocheTailleNord() {
        return piocheNord.size();
    }

    public static int piocherCartesNord() {
        return piocheNord.get(0);
    }

    public static int piocherCartesSud() {
        return piocheSud.get(0);
    }


}