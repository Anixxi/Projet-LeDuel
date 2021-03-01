package appli;

import java.util.ArrayList;

import static appli.Pioche.*;

public class Joueur {

    private ArrayList<Integer> cartesEnMain;

    private static int pileAscendanteNord;
    private static int pileDescendanteNord;
    private static int pileAscendanteSud;
    private static int pileDescendanteSud;

    private void initialiserJoueur(){
        pileAscendanteNord = 1;
        pileDescendanteNord = 60;
        pileAscendanteSud = 1;
        pileDescendanteSud = 60;
    }

    private void poseSesCartes() {
        //assert(nbCartesEnMain < 2);
        if(cartesEnMain.size() < 2 ){
            System.out.println("La partie est perdu");
        }

    }

    private static void poseUneCarteBaseAdverse() {
        //   assert(cartesEnMain != 5) // il doit poser qu'une seule carte
        //piocherDesCartes()
    }

    private void vainqueur() {
        // if(cartesEnMain == 0 && getNbCartesPioche() == 0){
        //   System.out.println("patie terminé");
        // }
    }

    /*
    @Override
    public String toString() {
        String nord =  "NORD"+" "+ "^" + "["+ pileAscendanteNord + "]" + "v" + "["+ pileDescendanteNord + "]" + " " + "(m" + nbCartesEnMainNord + "p" + NbCartesPiocheNord + ")";
        String sud =  "SUD"+" "+ "^" + "["+ pileAscendanteSud + "]" + "v" + "["+ pileDescendanteSud + "]" + " " + "(m" + nbCartesEnMainSud + "p" + NbCartesPiocheSud + ")";
        String cartesNord = "cartes NORD {" + Pioche.piocheNord.get(0) + piocheNord.get(1) + piocheNord.get(2) + piocheNord.get(3) + piocheNord.get(4) + piocheNord.get(5);
        return nord + sud;
    }
    */


}