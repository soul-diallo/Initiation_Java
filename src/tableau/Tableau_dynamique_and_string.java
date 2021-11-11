package tableau;

import java.util.ArrayList;

public class Tableau_dynamique_and_string {
    public static void main(String[] args) {
//        //Declaration et initialisation d'un string
//        String unNom;
//        String message = "Gang";
//        System.out.print(message.charAt(0));

        //Decalration d'un tableau dynamique

        ArrayList<String> tableau = new ArrayList<String>();
        System.out.println(tableau.size());
        tableau.add(0,"Gang");
        System.out.println(tableau.get(0));
        tableau.add("Souai");

        
    }
}
