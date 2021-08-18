package com.jonasermert;

import java.util.Scanner;

public class EmailFinder {

    public static void main(String[] args) {


            String[] emails = {"Hier die email Adressen eintragen aus denen gesucht werden soll"};

            for(int i=0; i<emails.length; i++) {
                emails[i] = emails[i].toLowerCase();
            }
            System.out.println("Diese Adressen wurden bisher eingegeben: ");

            for(String element:emails) {
                System.out.println(element);
            }

            System.out.println("Bitte gib eine Email Adresse ein, um nach ihr zu suchen: ");

            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine().toLowerCase();

            for(int j=0; j<emails.length; j++){

                if(emails[j].equals(userInput)) {

                    System.out.println("Die eingegebene Adresse wurde an der folgenden Stelle gefunden: " + j);
                    break;
                }
                else {
                    System.out.println("Email nicht gefunden");
                }
            }

        }
}
