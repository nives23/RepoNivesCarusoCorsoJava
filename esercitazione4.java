/*
ESERCIZIO IF: creare un sistema di if che controllino l'uguaglianza di tre 
valori numerici (3,13, 13) prima in sequenza e poi in modo annidato, in modo
tale da arrivare più in profondità possibile. 

 */

public class esercitazione4 {
    public static void main(String[] args) {

        //dichiarazione ed inizializzazione variabili
        int a=3;
        int b=13;
        int c=13;

        //controllo uguaglianze con if in sequenza
        if(a==b)    //inizio controllo tra a e b
            System.out.println("a e b sono uguali!");
        else
            System.out.println("a e b sono diversi!");  //fine controllo tra a e b

        if(a==c)    //inizio controllo tra a e c
            System.out.println("a e c sono uguali!");
        else 
            System.out.println("a e c sono diversi!");  //fine controllo tra a e c

        if(b==c)    //inizio controllo tra b e c
            System.out.println("b e c sono uguali!");
        else 
            System.out.println("b e c sono diversi!");  //fine controllo tra b e c

        System.out.println("--- PARTE 2 ---");
       
        //controllo uguaglianze con if annidati 
        if(a!=b){   //if controllo uguaglianza tra a e b
            if(a!=c){
                if(b!=c){
                    System.out.println("b e c sono diversi!");
                }
                else{
                    System.out.println("b e c sono uguali!");
                    System.out.println("a e c sono diversi!");
                    System.out.println("a e b sono diversi!");
                }
            }
            else{
                System.out.println("a e c sono uguali!");
            }
        }
        else{
            System.out.println("a e b sono uguali!");
        }
            
   
    }   //chiusura main

    
}   //chiusura classe

