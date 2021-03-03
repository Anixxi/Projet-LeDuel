package appli;

import java.util.ArrayList;

public class Jeu {

    private static String nomJoueur1;
    private static String nomJoueur2;

    public Jeu(String nomJoueur1, String nomJoueur2){
        this.nomJoueur1 = nomJoueur1;
        this.nomJoueur2 = nomJoueur2;
    }

    private void commencerLapartie() {
        Jeu duel = new Jeu("NORD","SUD");
        ArrayList<Integer> cartesJoueur1 = new ArrayList<>();
        Joueur CartesJoueur1 = new Joueur(cartesJoueur1);


        Joueur CartesJoueur2 = new Joueur(new ArrayList<Integer>());
        cartesJoueur1.get()

    }

    private void gagnerUnePartie() {

    }

}
