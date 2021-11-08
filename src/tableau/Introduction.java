package tableau;

import java.util.Random;

public class Introduction {
    public static void main(String[] args) {
        //Pour declarer un tableau
//        int [] entier;
//        entier = new int[]{12, 15, 4, 8, 66, 9, 88, 7, 4, 5,8};
//        System.out.println("La taille du tableau est "+entier.length);
//        for (int i =0;i< entier.length;i++){
//            System.out.print(entier[i]+" ");
//        }
        int[] notes = new int[10];
        double rand;
//        notes[0] = 52;
//        notes[1] = 40;
//        System.out.println(notes.length);
//        for (int i=0; i< notes.length;i++ ){
//            notes [i] = (int) (rand = Math.random()*100);
//        }
//        // Une façon de parcourir un tableau. Très limité car on ne peut pas modifier les valeurs
//        for (int i:notes ){
//            System.out.print(i+" ");
//        }

        // Tableau a deux dimensions
        int ville = 5;
        int code = 5;
        int [][] codeVille = new int[ville][code];
        // Remplissage par une boucle
        for (int i =0;i<codeVille.length;i++){
            for (int j=0;j<codeVille[i].length;j++){
                codeVille[i][j] = (int) (rand = Math.random()*100);
            }
        }
        // Pour afficher ses valeur on utilise une boucle imbriqué
        for (int i =0;i<codeVille.length;i++){
            for (int j=0;j<codeVille[i].length;j++){
                System.out.print(codeVille[i][j]+" ");
            }
            System.out.println();
        }
    }
}
