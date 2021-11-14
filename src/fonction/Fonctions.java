package fonction;

import java.util.Scanner;

public class Fonctions {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int t = 51;
        System.out.println(t);
        System.out.println("Veuillez saisir votre nom: ");
        String name = clavier.next();
        System.out.println("Votre nom est "+ afficheNom(name));
    }
    //Déclaration d'une fonction
    static String afficheNom (String name){

        return name;
    }

}
