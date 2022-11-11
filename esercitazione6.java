/*
Creare un sistema di inserimentodi tre variabili dette Nome: String, 
Cognome:String e Età:int. Stampare poi tutte le variabili assieme a "Questo è il tuo profilo: "
 */

import java.util.Scanner;   //importo la funzionalità scanner dalla libreria di java until

class esercitazione6{
    public static void main(String[] args) {

        //creo nuovi elementi
        Scanner myName= new Scanner(System.in); 
        Scanner mySurname= new Scanner(System.in); 
        Scanner myAge= new Scanner(System.in); 

        //faccio inserire all'utente i suoi dati
        System.out.print("Inserisci il tuo nome: ");
        String nome=myName.nextLine();    //Read user input
        System.out.print("Inserisci il tuo cognome: ");
        String cognome=mySurname.nextLine();    //Read user input
        System.out.print("Inserisci la tua età: ");
        int eta=myAge.nextInt();    //Read user input

        System.out.println(" ");    //mi serve a separare le due cose

        //stampo a video il profilo
        System.out.println("Questo è il tuo profilo:");
        System.out.println(" -Nome: " +nome);
        System.out.println(" -Cognome: " +cognome);
        System.out.println(" -Età: "+eta);

        
    }   //chiusura main
}   //chiusura classe