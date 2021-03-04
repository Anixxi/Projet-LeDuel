package appli;

import java.util.ArrayList;

public class Jeu {

    private static Joueur Joueur1;
    private static Joueur Joueur2;
    private static boolean joueurGagnant;

    public Jeu(Joueur NORD, Joueur SUD){
        this.Joueur1 = NORD;
        this.Joueur2 = SUD;
    }

    private void commencerLapartie() {
        Jeu duel = new Jeu("NORD","SUD");
        ArrayList<Integer> cartesJoueur1 = new ArrayList<>();
        Joueur CartesJoueur1 = new Joueur(cartesJoueur1);


        Joueur CartesJoueur2 = new Joueur(new ArrayList<Integer>());


    }

    private void coupValide() {


    }

}
