package com.company;

import java.util.Scanner;

public class fonction {

    public static void clearConsole() {
        for (int i = 0; i < 50; ++i) System.out.println();
    }

    public static void writeMenu() {
        System.out.println("|-----------------------------|");
        System.out.println("|bienvenu dans destruct chess!|");
        System.out.println("|-----------------------------|");
        System.out.println(" ");
        System.out.println("tapez 'rules' pour voir les règles");
        System.out.println("tapez 'play' pour jouer");
        System.out.println("tapez 'leave' pour quittez");
        System.out.println("tapez 'menu' pour revenir au menu");
    }

    public static void optionMenu(){
        System.out.println(" ");
        System.out.println("tapez 'rules' pour affichez les régles");
        System.out.println("tapez 'play' pour jouez");
        System.out.println("tapez 'leave pour quitter");
        System.out.println("tapez 'menu' pour revenir au menu");
    }

    public static void optionMenuInGame(){
        System.out.println(" ");
        System.out.println("tapez 'rules' pour affichez les régles");
        System.out.println("tapez 'play' pour commencer une nouvelle partie");
        System.out.println("tapez 'leave pour quitter");
        System.out.println("tapez 'menu' pour revenir au menu");
    }

    public static void rules() {
        System.out.println("Règlement :");
        System.out.println("- Votre but est de coincer l'adversaire sur une case.");
        System.out.println("- Vous ne pouvez bouger que d'une case par tour, à la verticale ou à l'horizontale.");
        System.out.println("- Après votre mouvement, vous devez détruire une case, de votre choix, sur le plateau en tapant ses coordonnées dans la console de jeu.");
        System.out.println("- Le dernier sur le plateau remporte la partie et un coup à boire de la part de Lordofbarbie.");
    }

    public static void keys() {
        System.out.println(" ");
        System.out.println("commandes");
        System.out.println("joueur rouge");
        System.out.println("avancer(z) gauche(q) reculer(s) droite(d)");
        System.out.println("joueur bleu");
        System.out.println("avancer(i) gauche(j) reculer(k) droite(l)");

    }

    public static String[][] initBoard() {
        String[][] board = new String[11][12];
        // the first [] tie in to the abscissa line / the second [] tie in to the ordinate line
        int abscisses = 0;
        int ordonnées = 0;
        char var = 'A';

        // two variables to define the vertical and horizontal lines
        // a variables to define a letter to the abscissa line
        for (var = 'A'; var <= 'L'; var++) {
                board[0][ordonnées] = "" + var;
                ordonnées++;
        }
        // we create a loop 'for' for the abscissa and the the ordinate lines
        for (abscisses = 0; abscisses < 11; abscisses++) {
            board[abscisses][0] = "" + abscisses;
        }
        for (abscisses = 1; abscisses < 11; abscisses++) {
            for (ordonnées = 1; ordonnées < 12; ordonnées++) {
                board[abscisses][ordonnées] = ANSI_WHITE + "□" + ANSI_RESET;
                board [6][6] = ANSI_RED  + "■" + ANSI_RESET;
                board [5][6] = ANSI_BLUE + "■" + ANSI_RESET;
            }
        }
        for (abscisses = 0; abscisses < 11; abscisses++) {
            for (ordonnées = 0; ordonnées < 12; ordonnées++) {
                System.out.print(board[abscisses][ordonnées] + "  ");
                // a system to display the board with interval
            }
            // a system to display the board
            System.out.println();
        }

        return board;
    }

    public static String[][] showPlayer(){
        String[][] board = new String[11][12];
        // the first [] tie in to the abscissa line / the second [] tie in to the ordinate line
        int abscisses = 0;
        int ordonnées = 0;
        char alphabet = 'A';
        Scanner myScan = new Scanner(System.in);


        // two variables to define the vertical and horizontal lines
        // a variables to define a letter to the abscissa line
        for (alphabet = 'A'; alphabet <= 'L'; alphabet++) {
            board[0][ordonnées] = "" + alphabet;
            ordonnées++;
        }
        // we create a loop 'for' for the abscissa and the the ordinate lines
        for (abscisses = 0; abscisses < 11; abscisses++) {
            board[abscisses][0] = "" + abscisses;
        }
        for (abscisses = 1; abscisses < 11; abscisses++) {
            for (ordonnées = 1; ordonnées < 12; ordonnées++) {
                board[abscisses][ordonnées] = ANSI_WHITE + "□" + ANSI_RESET;
                    board[variables_globals.RY][variables_globals.RX] = ANSI_RED + "■" + ANSI_RESET;
                    board[variables_globals.BY][variables_globals.BX] = ANSI_BLUE + "■" + ANSI_RESET;
            }
        }
        for (abscisses = 0; abscisses < 11; abscisses++) {
            for (ordonnées = 0; ordonnées < 12; ordonnées++) {
                System.out.print(board[abscisses][ordonnées] + "  ");
                // a system to display the board with interval
            }
            // a system to display the board
            System.out.println();

        }
        optionMenuInGame();

        return board;
    }

    public static void playerChoice(int Min, int Max) {
        //we create two variables to choose a player randomly to start the game
        int player = Min + (int) (Math.random() * ((Max - Min) + 1));
        if (player == Min) {
            System.out.println(" ");
            System.out.println("joueur rouge");
        } else {
            System.out.println(" ");
            System.out.println("joueur bleu");
        }
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
}




