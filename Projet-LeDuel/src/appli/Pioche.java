package appli;

import java.util.ArrayList;
import java.util.Random;

public class Pioche {


    private static int NbCartesPioche = 60;
    private ArrayList<Integer> piocheNord = new ArrayList<Integer>();
    private ArrayList<Integer> piocheSud = new ArrayList<Integer>();


    private void InitaliserLesCartes() {
        NbCartesPioche = 56;
        for(int i = 2; i <= 59; i++) {
            piocheNord.add(i);
        }
        // mélanger
    }


    public void AfficherList() {
        for(int i = 0; i < piocheNord.size(); i++) {
            System.out.println(piocheNord.get(i));
        }

    }

    private static void MelangerLesCartes() {
        int x;
        Random random = new Random();
        x = random.nextInt(59)+2;
    }


    public static void getMelangerLesCartes() {
        return MelangerLesCartes;
    }

    public static void setNbCartesPioche(int CartesPioche) {
        NbCartesPioche = CartesPioche;
    }



    public static void piocherDesCartes{



        if(NbCartesPioche == 0){
            piocheEpuisee();
        }
    }

    public static void piocheEpuisee{
        System.out.println("La partie est perdu");
    }
}

