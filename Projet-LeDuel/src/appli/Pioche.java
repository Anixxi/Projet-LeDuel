package appli;

import java.util.ArrayList;
import java.util.Random;

public class Pioche {


    public static int NbCartesPiocheNord = 60;
    private static int NbCartesPiocheSud = 60;
    private ArrayList<Integer> piocheNord = new ArrayList<Integer>();
    private ArrayList<Integer> piocheSud = new ArrayList<Integer>();


    private void InitaliserLesCartes() {
        //NbCartesPioche = 56;
        for(int i = 2; i <= 59; i++) {
            piocheNord.add(i);
        }
        melangerLesCartes();
    }


    public void afficherList() { // test
        for(int i = 0; i < piocheNord.size(); i++) {
            System.out.println(piocheNord.get(i));
        }

    }

    private static void melangerLesCartes() {
        int x;
        Random random = new Random();
        x = random.nextInt(59)+2;
    }


    public static void setNbCartesPioche(int CartesPioche) {
        NbCartesPioche = CartesPioche;
    }



    private void piocherDesCartes(){
    	
    	piocheEpuisee();
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

