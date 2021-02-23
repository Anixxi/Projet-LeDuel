package appli;

import java.util.ArrayList;
import java.util.Random;

public class Pioche {

    private static int NbCartesPioche;
    private static int x;
    ArrayList<Integer> pioche = new ArrayList<Integer>(NbCartesPioche);

    private static void MelangerLesCartes {
        Random random = new Random();
        x = random.nextInt(59)+2;
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

