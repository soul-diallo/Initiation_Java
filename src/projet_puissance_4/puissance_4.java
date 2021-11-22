package projet_puissance_4;

public class puissance_4 {
    // Declaration des constantes
    private final static int VIDE =0;
    private final static int JAUNE = 1;
    private final static int ROUGE = 2;

    public static void main(String[] args) {
        int [][] grille = new int[6][7];
        initialise(grille);
        grille[2][3] = JAUNE;
        grille[2][4] = ROUGE;
        affiche(grille);
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

    static
}
