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
        notes[0] = 52;
        notes[1] = 40;
        System.out.println(notes.length);
        for (int i=0; i< notes.length;i++ ){
            notes [i] = (int) (rand = Math.random()*100);
        }
        for (int i=0; i< notes.length;i++ ){
            System.out.print(notes[i]+" ");
        }
    }
}
