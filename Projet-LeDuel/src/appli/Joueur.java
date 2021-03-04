package appli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Joueur {

    private ArrayList<Integer> cartesEnMain;

    private static int pileAscendanteNord;
    private static int pileDescendanteNord;
    private static int pileAscendanteSud;
    private static int pileDescendanteSud;

    private static boolean estNord;

    private static int PILE_ASCENDANT_VALUE = 1;
    private static int PILE_DESCENDANT_VALUE = 60;

    private Pioche pioche;

    public Joueur(ArrayList<Integer> cartesEnMain,boolean estNord) {
        this.cartesEnMain = cartesEnMain;
        estNord = true;
        pileAscendanteNord = PILE_ASCENDANT_VALUE;
        pileDescendanteNord = PILE_DESCENDANT_VALUE;
        pileAscendanteSud = PILE_ASCENDANT_VALUE;
        pileDescendanteSud = PILE_DESCENDANT_VALUE;

        pioche = new Pioche();

        this.cartesEnMain = new ArrayList<Integer>();

    }

    public void initialiserJoueur(){
        for(int i = 0; i<6; i++){
            cartesEnMain.add(Pioche.piocherCartesNord());
            cartesEnMain.add(Pioche.piocherCartesSud());

        }
        Collections.sort(cartesEnMain);
    }


    public void poseSesCartes(boolean estNord) {
        int nbCartesPoser;
        Scanner sc = new Scanner(System.in);
        String entreeClavier = sc.next();
        decompose(entreeClavier);



        /*
        assert(cartesEnMain.size() < 2);
        if(cartesEnMain.size() < 2 ){
            System.out.println("La partie est perdu");
        }


        */
    }

    public static void poseUneCarteBaseAdverse() {
        //   assert(cartesEnMain != 5) // il doit poser qu'une seule carte
        //piocherDesCartes()
    }

    public void piocheDeuxCartes(boolean estNord) {

        if(estNord = true){
            for(int i=0;i<3;i++){
                cartesEnMain.add(Pioche.piocherCartesNord());
            }
        }
        else if(estNord = false){
            for(int i=0;i<3;i++){
                cartesEnMain.add(Pioche.piocherCartesSud());
            }
        }

    }

    public void piochePlusieursCartes(boolean estNord) {
        if(estNord = true){
            for(int i=0;cartesEnMain.size()<6;i++){
                cartesEnMain.add(Pioche.piocherCartesNord());
            }
        }
        else if(estNord = false){
            for(int i=0;cartesEnMain.size()<6;i++){
                cartesEnMain.add(Pioche.piocherCartesSud());
            }
        }

    }
    private void vainqueur() {
        // if(cartesEnMain == 0 && getNbCartesPioche() == 0){
        //   System.out.println("patie terminé");
        // }
    }

    public static void decompose(String s) {
        // une solution
        String[] tab = s.split("\\s+");
        for (String mot : tab)
            System.out.println(mot);
    }

    public String toString(boolean estNord) {
        if (estNord = true) {
            String nord = "NORD" + " " + "^" + "[" + pileAscendanteNord + "]" + "v" + "[" + pileDescendanteNord + "]" + " " + "(m" + cartesEnMain.size() + "p" + Pioche.piocheNord.size() + ")\n";
            String cartesNord = "cartes NORD {" ; //+ cartesEnMain.get(0) + cartesEnMain.get(1) + cartesEnMain.get(2) + cartesEnMain.get(3) + cartesEnMain.get(4) + cartesEnMain.get(5) + "}\n";

            for(int i=0; cartesEnMain.size()> i+1; i++){
                cartesNord += cartesEnMain.get(0);
            }
            return nord + cartesNord + ">";
        }
        else if (estNord = false) {
            String sud = "SUD" + " " + "^" + "[" + pileAscendanteSud + "]" + "v" + "[" + pileDescendanteSud + "]" + " " + "(m" + cartesEnMain.size() + "p" + Pioche.piocheSud.size() + ")";
            String cartesSud = "cartes SUD {" //+ cartesEnMain.get(0) + cartesEnMain.get(1) + cartesEnMain.get(2) + cartesEnMain.get(3) + cartesEnMain.get(4) + cartesEnMain.get(5);
            for(int i=0; cartesEnMain.size()> i+1; i++){
                cartesSud += cartesEnMain.get(0);
            }

            return sud + cartesSud + ">";
        }

    }

}