package appli;

import java.util.ArrayList;
import java.util.Scanner;


public class Joueur {

    private ArrayList<Integer> cartesEnMain;

    private static int pileAscendanteNord;
    private static int pileDescendanteNord;
    private static int pileAscendanteSud;
    private static int pileDescendanteSud;

    private static int PILE_ASCENDANT_VALUE = 1;
    private static int PILE_DESCENDANT_VALUE = 60;

    private Pioche pioche;

    public Joueur(ArrayList<Integer> cartesEnMain) {
        this.cartesEnMain = cartesEnMain;
        pileAscendanteNord = PILE_ASCENDANT_VALUE;
        pileDescendanteNord = PILE_DESCENDANT_VALUE;
        pileAscendanteSud = PILE_ASCENDANT_VALUE;
        pileDescendanteSud = PILE_DESCENDANT_VALUE;

        pioche = new Pioche();

        this.cartesEnMain = new ArrayList<Integer>();

    }
    /*
    private void initialiserJoueur(){
        for(int i = 0; i<6; i++){
            cartesEnMain.add(Pioche.piocherCartesNord());
            cartesEnMain.add(Pioche.piocherCartesSud());
        }
    }
*/

    private void initialiserJoueur(){
        for(int i = 0; i<6; i++){
            int tmp1 = Pioche.piocherCartesNord();
            int tmp2 = Pioche.piocherCartesSud();
            cartesEnMain.add(tmp1);
            cartesEnMain.add(tmp2);
        }
    }

    private void poseSesCartes() {
        //assert(nbCartesEnMain < 2);
        if(cartesEnMain.size() < 2 ){
            System.out.println("La partie est perdu");
        }

        Scanner sc = new Scanner(System.in);
        String entreeClavier = sc.next();



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

    private static void décompose(String s) {
        // une solution
        String[] tab = s.split("\\s+");
        for (String mot : tab)
            System.out.println(mot);
    }


    @Override
    public String toString() {
        String nord =  "NORD"+" "+ "^" + "["+ pileAscendanteNord + "]" + "v" + "["+ pileDescendanteNord + "]" + " " + "(m" + nbCartesEnMainNord + "p" + NbCartesPiocheNord + ")";
        String sud =  "SUD"+" "+ "^" + "["+ pileAscendanteSud + "]" + "v" + "["+ pileDescendanteSud + "]" + " " + "(m" + nbCartesEnMainSud + "p" + NbCartesPiocheSud + ")";
        String cartesNord = "cartes NORD {" + Pioche.piocheNord.get(0) + piocheNord.get(1) + piocheNord.get(2) + piocheNord.get(3) + piocheNord.get(4) + piocheNord.get(5);
        return nord + sud;
    }


}