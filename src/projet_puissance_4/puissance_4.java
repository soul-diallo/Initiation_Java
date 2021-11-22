package projet_puissance_4;

import java.util.Scanner;

public class puissance_4 {
    // Declaration des constantes
    private final static int VIDE =0;
    private final static int JAUNE = 1;
    private final static int ROUGE = 2;

    public static  Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {
        int [][] grille = new int[6][7];
        initialise(grille);
        affiche(grille);

        int couleurJoeur = JAUNE;

        do{
            demandeEtJoue(grille,couleurJoeur);

            affiche(grille);
            // on change la couleur pour la couleur de l'autre joueur
            if (couleurJoeur == JAUNE){
                couleurJoeur =ROUGE;
            }else {
                couleurJoeur = JAUNE;
            }
        } while ()
    }

    static void demandeEtJoue(int[][] grille, int couleurJoeur) {
        boolean valide;

        do {
            System.out.print("Joueur ");
            if (couleurJoeur == JAUNE){
                System.out.print("X");
            }else {
                System.out.print("O");
            }
            System.out.println(" : entrez un numero de colonne");

            int colonne = clavier.nextInt();
            // les indices des tableaux commencent par 0 en Java
            --colonne;

            valide = joue(grille, colonne, couleurJoeur);
            if (!valide){
                System.out.println(" > Ce coup n'est pas valide");
            }
        } while (!valide);
    }

    static void initialise(int [][] grille){
        for (int i = 0; i< grille.length;i++){
            for (int j =0;j<grille[i].length;j++){
                grille[i][j] = VIDE;
            }
        }
    }

    //affiche O pour une case rouge, X pour une case jaune
    static void affiche(int[][] grille){
        for (int[] ligne : grille){
            System.out.print(" |");
            for (int cellule :ligne){
                if (cellule == VIDE){
                    System.out.print(' ');
                }
                else if (cellule == ROUGE){
                    System.out.print('O');
                }
                else {
                    System.out.print('X');
                }
                System.out.print('|');
            }
            System.out.println();
        }
        System.out.print('=');
        for (int i = 1; i<= grille[0].length; ++i){
            System.out.print("=" + i);
        }
        System.out.println("==\n");
    }

    static boolean joue (int[][] grille, int colonne, int couleur){
        if (colonne >= grille[0].length){
            return false;
        }

        int ligne = grille.length - 1;

        boolean pleine = false;
        while ((!pleine) && (grille[ligne][colonne] != VIDE)){
            if (ligne == 0){
                pleine = true;
            }else {
                --ligne;
            }
        }

        if (!pleine){
            grille[ligne][colonne] = couleur;
            return true;
        }else {
            return false;
        }
    }
}
