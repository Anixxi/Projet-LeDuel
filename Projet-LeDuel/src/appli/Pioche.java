package appli;

import java.util.ArrayList;
import java.util.Collections;

public class Pioche {

    private ArrayList<Integer> piocheNord;
    private ArrayList<Integer> piocheSud;

    public Pioche(){
        piocheNord = new ArrayList<>();
        piocheSud = new ArrayList<>();

    }

    private void initaliserLesCartes() {
        for(int i = 2; i < 60; i++) {
            piocheNord.add(i);
            piocheSud.add(i);
        }
        Collections.shuffle(piocheNord);
        Collections.shuffle(piocheSud);
    }

    private int piocheTailleSud() {
        return piocheSud.size();
    }

    private int piocheTailleNord() {
        return piocheNord.size();
    }

    public int piocherCartesNord() {
        return piocheNord.get(0);
    }

    public int piocherCartesSud() {
        return piocheSud.get(0);
    }


}