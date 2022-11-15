/* Creare un sistema di inserimento in ciclo che riempa due array
 * uno di numeri ed uno di stringhe, usando la libreria ArrayList
 */

import java.util.Scanner;   //importo la funzionalità scanner dalla libreria di java util
import java.util.ArrayList; //importo la libreria array list

public class array_esercizio1bis {

    public static void main(String[] args){

        //dichiarazione variabili
        ArrayList<Integer> vett = new ArrayList<Integer>(); //vettore di interi
        ArrayList<String> stringa= new ArrayList<String>(); //array di stringhe
        Scanner inserimento=new Scanner(System.in);
        Scanner input=new Scanner(System.in);
        Scanner choice=new Scanner(System.in);
        boolean check=true;

        do{
           
                System.out.println("Scrivi 'aggiungi' per aggiungere un elemento oppure 'esci' per uscire");    //l'utente sceglie se vuole aggiungere un elemento ad uno dei due array o uscire
                String scelta=choice.nextLine();

                if(scelta.equals("aggiungi")){
                    System.out.println("Se vuoi inserire un intero digita 'intero', se vuoi inserire una parola digita 'stringa' ");
                    String tipoelem=inserimento.nextLine();

                    if(tipoelem.equals("intero")){  //l'utente vuole inserire un intero

                        System.out.println("Inserisci il numero: "); //riempimento array di interi
                        vett.add(input.nextInt());
                

                    }   //fine caso inserimento interi
                    else if(tipoelem.equals("stringa")){
                        
                        System.out.println("Inserisci la parola: ");    //riempimento array di stringhe
                        stringa.add(input.nextLine());

                    }   //fine caso inserimento parola
                }   //fine caso inserimento
                else if(scelta.equals("esci")){
                    check=false;

                    System.out.println("Il tuo array di interi: "+vett);
                    System.out.println("-------------------");  //per separare le due stampe
                    System.out.println("Il tuo array di stringhe: "+stringa);
                    System.out.println("-------------------");  //per separare le due stampe
                    System.out.println("Grazie e arrivederci!");

                }
           
        }while(check);  //fine ciclo




    }//fine main
}//fine classe