package com.company;

import java.util.Scanner;

public class Main {
    //fonction

    public static void main(String[] args) {
        // write your code here
        int boucle = 0;
        int boucle2 = 0;
        int boucle3 = 0;
        int A = 0;
        Scanner myScan = new Scanner(System.in);

        //print menu
        fonction.writeMenu();
        while (boucle < 1) { // create a loop for the menu
            String inputUser = myScan.nextLine();

            if (inputUser.equals("rules")) {
                // access the game's rules
                fonction.clearConsole();
                fonction.rules();
                fonction.optionMenu();
            }
            else if (inputUser.equals("play")) {
                // start the game
                fonction.clearConsole();
                fonction.initBoard();
                fonction.playerChoice(1, 2);
                fonction.keys();
                System.out.println(" ");
                System.out.println("tapez 'rules' pour affichez les régles");
                System.out.println("tapez 'leave pour quitter");
                System.out.println("tapez 'menu' pour revenir au menu");
                while (boucle3 < 1) {
                    inputUser = myScan.nextLine();
                    if (inputUser.equals("rules")) {
                        // access the game's rules
                        fonction.clearConsole();
                        fonction.rules();
                        fonction.optionMenu();
                    }
                    if (inputUser.equals("menu")) {
                        fonction.clearConsole();
                        fonction.writeMenu();
                    }
                    if (inputUser.equals("play")){
                        fonction.clearConsole();
                        fonction.initBoard();
                        fonction.keys();
                        System.out.println(" ");
                        System.out.println("tapez 'rules' pour affichez les régles");
                        System.out.println("tapez 'leave pour quitter");
                        System.out.println("tapez 'menu' pour revenir au menu");
                    }
                     if (inputUser.equals("leave")) {
                        // close the game
                        fonction.clearConsole();
                        System.out.println("le logiciel vas se fermer");
                        boucle3 = 1;
                        boucle = 1;
                    }
                    if (inputUser.equals("d")) {
                        variables_globals.RX++;
                        fonction.clearConsole();
                        fonction.showPlayer();
                        fonction.keys();
                    }
                    if (inputUser.equals("q")) {
                        variables_globals.RX--;
                        fonction.clearConsole();
                        fonction.showPlayer();
                        fonction.keys();
                    }
                    if (inputUser.equals("s")) {
                        variables_globals.RY++;
                        fonction.clearConsole();
                        fonction.showPlayer();
                        fonction.keys();
                    }
                    if (inputUser.equals("z")) {
                        variables_globals.RY--;
                        fonction.clearConsole();
                        fonction.showPlayer();
                        fonction.keys();
                    }
                    if (inputUser.equals("k")) {
                        variables_globals.BY++;
                        fonction.clearConsole();
                        fonction.showPlayer();
                        fonction.keys();
                    }
                    if (inputUser.equals("i")) {
                        variables_globals.BY--;
                        fonction.clearConsole();
                        fonction.showPlayer();
                        fonction.keys();
                    }
                    if (inputUser.equals("l")) {
                        variables_globals.BX++;
                        fonction.clearConsole();
                        fonction.showPlayer();
                        fonction.keys();
                    }
                    if (inputUser.equals("j")) {
                        variables_globals.BX--;
                        fonction.clearConsole();
                        fonction.showPlayer();
                        fonction.keys();
                    }
                }
            }
            else if (inputUser.equals("leave")) {
                // close the game
                fonction.clearConsole();
                System.out.println("le logiciel vas se fermer");
                boucle = 1;
            }
            else if (inputUser.equals("menu")) {
                // write menu
                fonction.clearConsole();
                fonction.writeMenu();
            }
        }

    }
}


