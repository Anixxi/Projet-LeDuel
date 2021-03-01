package appli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Pioche {

    private ArrayList <Integer> piocheNord = new ArrayList<Integer>();
    private ArrayList <Integer> piocheSud = new ArrayList<Integer>();

    public Pioche(ArrayList<Integer> pioche){

    }

    private void initaliserLesCartes() {
        for(int i = 2; i < 60; i++) {
            piocheNord.add(i);
        }
        Collections.shuffle(piocheNord);
        Collections.shuffle(piocheSud);
    }


    public void afficherList() { // test
        for(int i = 0; i < piocheNord.size(); i++) {
            System.out.println(piocheNord.get(i));
        }

    }

    private void piocheEpuisee(){
        if(piocheNord.isEmpty()) {
            System.out.println("partie finie, SUD a gagné");
        }
        else if(piocheSud.isEmpty()) {
            System.out.println("partie finie, NORD a gagné");
        }

    }

}