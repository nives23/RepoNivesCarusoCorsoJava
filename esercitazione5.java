/*
In ultima analisi dovremo creare una struttura di if-else dove sia possibile far 
stampare tutti e tre i casi tramite lo scanner. 
 */

import java.util.Scanner;   //importo la funzionalità scanner dalla libreria di java until

class esercitazione5{
    public static void main(String[] args) {

        //creo nuovi elementi
        Scanner x1= new Scanner(System.in); 
        Scanner y1= new Scanner(System.in); 
        Scanner z1= new Scanner(System.in); 

        //faccio inserire all'utente tre interida tastiera
        System.out.print("Inserisci l'intero x: ");
        int x=x1.nextInt();    //Read user input
        System.out.print("Inserisci l'intero y: ");
        int y=y1.nextInt();    //Read user input
        System.out.print("Inserisci l'intero z: ");
        int z=z1.nextInt();    //Read user input

        //controllo uguaglianza tra gli interi con blocco di if-else
        if(x==y)    //inizio controllo tra a e b
            System.out.println("x e y sono uguali!");
        else
            System.out.println("x e y sono diversi!");  //fine controllo tra a e b

        if(x==z)    //inizio controllo tra a e c
            System.out.println("x e z sono uguali!");
        else 
            System.out.println("x e z sono diversi!");  //fine controllo tra a e c

        if(y==z)    //inizio controllo tra b e c
            System.out.println("y e z sono uguali!");
        else 
            System.out.println("y e z sono diversi!");  //fine controllo tra b e c

        
    }   //chiusura main
}   //chiusura classe