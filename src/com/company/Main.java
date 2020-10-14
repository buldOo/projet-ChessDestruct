package com.company;

import java.awt.*;
import java.io.Console;
import java.util.Scanner;

public class Main {
    //fonction

    public static void main(String[] args) {
	// write your code here
        int boucle = 0;
        Scanner myScan = new Scanner(System.in);

        //print menu
        fonction.writeMenu();
        while (boucle < 1){
            while (!myScan.hasNextInt()) {
                System.out.println("çe n'est pas un nombre");
                myScan.next();
            }
            //used to recover user input
            int inputUtilisateur = myScan.nextInt();

            if (inputUtilisateur == 1){
                fonction.clearConsole();
                fonction.rules();
                System.out.println("tapez 1 pour revenir au menu");
                myScan.nextInt();
                if (inputUtilisateur == 1){
                    fonction.clearConsole();
                    fonction.writeMenu();
                }
            }
            if (inputUtilisateur == 2){
                fonction.clearConsole();
                fonction.tableau();
                fonction.playerChoice(1, 2);
                System.out.println("tapez 2 pour revenir au menu");
                myScan.nextInt();
                if (inputUtilisateur == 2){
                    fonction.clearConsole();
                    fonction.writeMenu();
                }
            }
            if (inputUtilisateur == 3){
                System.out.println("le logiciel vas se fermer");
                boucle = 1;
            }
        }
    }
}

