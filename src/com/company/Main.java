package com.company;

import java.awt.*;
import java.io.Console;
import java.util.Scanner;

public class Main {
    //fonction
    public static void clearConsole() {
        for (int i = 0; i < 50; ++i) System.out.println();
    }

    public static void main(String[] args) {
	// write your code here
        int boucle = 0;
        Scanner monScanner = new Scanner(System.in);

        System.out.println("bienvenu dans destruct chess!");
        System.out.println("tapez 1 pour voir les règles");
        System.out.println("tapez 2 pour quittez");
        while (boucle < 1){
            int inputUtilisateur = monScanner.nextInt();
            if (inputUtilisateur == 1){
                clearConsole();
                System.out.println("blabla règles");
                System.out.println("tapez 1 pour revenir au menu");
                monScanner.nextInt();
                if (inputUtilisateur == 1){
                    clearConsole();
                    System.out.println("bienvenu dans destruct chess!");
                    System.out.println("tapez 1 pour voir les règles");
                    System.out.println("tapez 2 pour quittez");
                }
            }
            if (inputUtilisateur == 2){
                System.out.println("le logiciel vas se fermer");
                boucle = 1;
            }
        }
    }
}

