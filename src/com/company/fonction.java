package com.company;

import java.util.Scanner;

public class fonction {
    public static void clearConsole() {
        for (int i = 0; i < 50; ++i) System.out.println();
    }
    public static void writeMenu() {
        System.out.println("bienvenu dans destruct chess!");
        System.out.println("tapez 1 pour voir les règles");
        System.out.println("tapez 2 pour jouer");
        System.out.println("tapez 3 pour quittez");
    }
    public static void rules() {
            System.out.println("Règlement :");
            System.out.println("- Votre but est de coincer l'adversaire sur une case.");
            System.out.println("- Vous ne pouvez bouger que d'une case par tour, à la verticale ou à l'horizontale.");
            System.out.println("- Après votre mouvement, vous devez détruire une case, de votre choix, sur le plateau en tapant ses coordonnées dans la console de jeu.");
            System.out.println("- Le dernier sur le plateau remporte la partie et un coup à boire de la part de Lordofbarbie.");
    }
    public static void tableau(){
        int [][] Tableau= new int[11][12];
        // Le premier [] correspond à la ligne des abscisses / Le deuxième [] correspond à la ligne des ordonnées

        int abscisses = 0;
        int ordonnées = 0;


        // Deux variables pour définir les lignes horizontale et verticale

        for (abscisses = 0; abscisses<11; abscisses++) {
            for (ordonnées = 0; ordonnées<12; ordonnées++){
                Tableau[0][ordonnées] = ordonnées;
            }
        } // On crée une boucle for pour les abscisses et une pour les lignes,

        for (abscisses = 0; abscisses<11; abscisses++ ) {
            for (ordonnées = 0; ordonnées<12; ordonnées++){
                Tableau[abscisses][0] = abscisses;
            }
        }

        for (abscisses = 1; abscisses<11; abscisses++) {
            for (ordonnées = 1; ordonnées<12; ordonnées++) {
                Tableau[abscisses][ordonnées] = 0;
            }
        }

        for (abscisses = 0; abscisses<11; abscisses++) {
            for (ordonnées = 0; ordonnées<12; ordonnées++) {
                System.out.print(Tableau[abscisses][ordonnées] + "|" );
                // System.out.println(Tableau +"|");
            }
            System.out.println();
        }
    }
    public static void playerChoice (int Min, int Max){
        int player = Min + (int)(Math.random() * ((Max - Min) + 1));
        if (player == Min){
            System.out.println("joueur 1 commence");
        }
        else {
            System.out.println("joueur 2 commence");
        }
    }
}


