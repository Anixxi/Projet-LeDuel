package appli;

import java.util.ArrayList;

import static appli.Pioche.*;

public class Joueur {

    private static int nbCartesEnMain;
    private ArrayList<Integer> cartesEnMain;

    private String nom;
    private static int pileAscendanteNord;
    private static int pileDescendanteNord;
    private static int pileAscendanteSud;
    private static int pileDescendanteSud;

    public Joueur(String nom) {
        this.nom = nom;

    }

    private void InitialiserJoueur(){
        pileAscendanteNord = 1;
        pileDescendanteNord = 60;
        pileAscendanteSud = 1;
        pileDescendanteSud = 60;
        ArrayList<Integer> cartesEnMain = new ArrayList<Integer>();

    }



    private static void poseSesCartes() {
        //assert(nbCartesEnMain < 2);
        if(nbCartesEnMain < 2 ){
            System.out.println("La partie est perdu");
        }

    }

    private static void poseUneCarteBaseAdverse() {
      //   assert(cartesEnMain != 5) // il doit poser qu'une seule carte
        //piocherDesCartes()
    }

    private void Vainqueur() {
       // if(cartesEnMain == 0 && getNbCartesPioche() == 0){
         //   System.out.println("patie terminé");
       // }
    }

    @Override
    public String toString() {


        return super.toString();
    }

    /*
    public static void chiffre {
        for (int i = 1; i < 20; ++i)
//			System.out.println(String.format("%02d", i));

            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("> ");
        s = sc.nextLine();
        while (!s.equals("fin")) {
            décompose(s);
            System.out.print("> ");
            s = sc.nextLine();
        }
    }

    private static void décompose(String s) {
        // une solution
        String[] tab = s.split("\\s+");
        for (String mot : tab)
            System.out.println(mot);
    }
    */

}
