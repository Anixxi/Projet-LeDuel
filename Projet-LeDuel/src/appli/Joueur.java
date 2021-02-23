package appli;

import static appli.Pioche.*;

public class Joueur {
	
	 private static String nom;
	    private static int cartesEnMain[];

	    private static int baseAscendante[];
	    private static int basedescendante[];

	    public static void commencerLapartie {
	        //  cartesEnMain ; //
	        setNbCartesPioche(54);





	    }

	    private static void poseSesCartes {


	        //assert(cartesEnMain == 6);
	        if(cartesEnMain != 4){
	            System.out.println("La partie est perdu");
	        }


	    }

	    private static void poseUneCarteBaseAdverse {

	      //   assert(cartesEnMain != 5) // il doit poser qu'une seule carte
	        //piocherDesCartes()

	    }

	    private static void Vainqueur {
	        if(cartesEnMain == 0 && getNbCartesPioche() == 0){
	            System.out.println("patie terminé");
	        }
	    }

	    @Override
	    public String toString() {

	        "[" + "]"
	        return super.toString();
	    }

	    /*
	    public static void chiffre {
	        for (int i = 1; i < 20; ++i)
//				System.out.println(String.format("%02d", i));

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
