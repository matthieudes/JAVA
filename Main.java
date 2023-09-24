
import jdk.jshell.execution.Util;

import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str="dlrow olleh";
        String newStr ="";

        for(int i= str.length() -1; i>=0; i--){
            newStr= newStr + str.charAt(i);
        }
        System.out.println(newStr);
        reverse();
        pyramide();
        calcul();
        scanner();
        jeuDuNombre();
        compteur();
        sauvegarde();
        lecture();
    }

    public static void reverse(){
        String str="hello" ;

        StringBuilder hello= new StringBuilder() ;

        hello.append(str);

        hello = hello.reverse();

        System.out.println(hello);
    }

    public static void pyramide(){
        int lignes=4 ;
        for (int i=0; i< lignes;i++){

            for(int j=0; j<=lignes -i; j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=i; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void calcul(){
        int var=0 ;
        for (int i= 0; i <=10000; i++){
            var += i;
        }
        System.out.print(""+ var);
    }

    public static void scanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("saisir un nombre entier:");
        String input = scanner.nextLine();
        int nombre = Integer.parseInt(input);
        if (nombre % 2 == 0){
            System.out.print("le nombre est pair");
        } else {
            System.out.print("le nombre est impair");
        }

    }

    public static void jeuDuNombre(){
        Random random= new Random();
        int nb;
        nb = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        boolean isfound=false;
        int compte = 0;
        while (isfound==false) {
            System.out.print("saisir un nombre entier entre 0 et 10:");
            int nombre = scanner.nextInt();
            compte ++ ;
            if (nombre - nb > 0) {
                System.out.println("plus petit");
            } else if (nombre - nb == 0) {
                isfound = true;
                System.out.println("bien joué");
                System.out.print("nombre de coups :"+ compte);
            } else {
                System.out.println("plus grand");
            }

        }
    }

    public static void compteur(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("saisir une phrase : ");
        String phrase = scanner.nextLine();
        String[] mots = phrase.split("\\s+");
        int nb =mots.length;
        System.out.print(nb);
    }
    public static void sauvegarde() {
        Scanner scanner= new Scanner(System.in);
        System.out.print("écrire une phrase à sauvegarder : ");
        String phrase = scanner.nextLine();
        String nomFichier="phrase.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomFichier))){
            writer.write(phrase);
            System.out.println("La phrase a été sauvegardée dans le fichier " + nomFichier);
        } catch (IOException e){
            System.out.println("Exception occuried : " + e.getMessage());

        }
        scanner.close();
    }

    public static void lecture(){
        try {
            FileInputStream file= new FileInputStream("phrase.txt");
            Scanner scanner= new Scanner(file);

            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch(IOException e){
            e.printStackTrace();
            System.out.println("erreur parvenue : " +e.getMessage());
        }
    }
}

