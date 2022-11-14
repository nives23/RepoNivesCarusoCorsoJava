/*
Inizializzare 3 variabili del tipo che pensate adatto 
X = 11     Y = 22       Z = 12.5
Creare un menu con quattro opzioni:
- Aggiungi - Sottrai - Stampa -Esci
->Tramite aggiungi dovremo poter scegliere a quale variabile e poi aggiungere un numero a scelta
->Tramite sottrai dovremo poter scegliere a quale variabile e poi sottrarre un numero a scelta 
->senza poter scendere sotto 1 di valore minimo
->Tramite stampa dovrà Poter stampare o tutte le variabili o una a scelta.
->Tramite Esci dovrà uscire dal loop e ringraziare.
 */

import java.util.Scanner;   //importo la funzionalità scanner dalla libreria di java until

public class CicliEIteratori_Singolo{
    public static void main(String[] args) {

        //dichiarazione ed inizialiazzazione variabili
        double z=12.5, x=11, y=22;
        boolean check=true;
        
        //creo nuovi elementi
        Scanner option= new Scanner(System.in); //mi servirà per far scegliere l'opzione all'utente
        Scanner number= new Scanner(System.in); //mi serve per far scegliere all'utente con quale numero operare
        Scanner a=new Scanner(System.in);   //mi serve per far dire all'utente quanto vuole aggiungere o sottrarre

        //mostro all'utente quali sono i numeri di partenza
        System.out.println("\n I numeri di partenza sono: x=11, y=22, z=12.5");

        //mostro all'utente quali sono le opzioni del menu
        System.out.println("Menu: \n1)Aggiungi \n2)Sottrai \n3)Stampa \n4)Esci");
        System.out.println(" ");    //spazio che uso per separare il menu dalla scelta
        
        do{
            //faccio scegliere all'utente un comando del menu
            System.out.println("Cosa vuoi fare?\n");
            System.out.print("Premi 1 per aggiungere, 2 per sottrare, 3 per stampare o 4 per uscire:  ");
            int opzione=option.nextInt();

            //caso in cui l'utente vuole stampare
            if(opzione==3){
                stampa(opzione, x,y,z);
            } else if(opzione==4){  //caso in cui l'utente vuole uscire
                check=false;
                break;
            }

            //faccio scegliere all'utente a quale numero adottare il comando
            System.out.println("Con quale numero vuoi operare? \n Premere 1 per operare con x, 2 per  y  e 3 per z:  ");
            int numero=number.nextInt();    //uso l'int al posto della stringa per far funzionare i controlli successivi

            //faccio scegliere all'utente quanto aggiungere o sottrarre al numero 
            double a1=0;
            if(opzione==1){
                System.out.println("Quanto vuoi aggiugere al numero scelto?");
                a1=a.nextInt();    
            }else if(opzione==2){
                System.out.println("Quanto vuoi sottrarre al numero scelto?");
                a1=a.nextInt();
            }

            
                if(numero==1){ //l'utente ha scelto x
                    x=calcoli(opzione, x, a1);
                } else if(numero==2){  //l'utente ha scelto y
                    y=calcoli(opzione, y, a1);
                } else if(numero==3){  //l'utente ha scelto z
                    z=calcoli(opzione, z, a1);
                }

        
            if(opzione==4){
                System.out.println("Grazie e arrivederci!");
            }

            
        }while(check);

        System.out.println("Grazie e arrivederci!");
       
    }   //chiusura main

    //---------------------------
    
    //funzioni di utilità
    public static double calcoli(int opz, double num, double operatore) {   //funzione per fare i calcoli
        double nummodificato=num;
        double op=operatore;
        if(opz==1){
            nummodificato+=op;
        }else if(opz==2){
            nummodificato-=op;
            if(nummodificato<1){    //controllo che sottraendo il numero non diventi minore di 1
                System.out.println("Sottrazione non possibile!");
                nummodificato+=op;  //se ciò accade ripristino il numero al valore di prima
            }
        }  
              
        return nummodificato;
    }   //fine funzione

    public static void stampa(int opz, double num1, double num2, double num3){  //funzione per stampare in base alla scelta dell'utente

        Scanner choice=new Scanner(System.in); //per far scegliere all'utente cosa stampare
        Scanner see=new Scanner(System.in); //per far scegliere all'utente quale numero stampare

        System.out.println("Premere 1 per stampare tutti i numeri, 2 per stamparne uno solo:"); //l'utente sceglie se stampare solo un numero o tutti
        int scelta=choice.nextInt();

        if(scelta==1){  //l'utente vuole vedere tutti i numeri
            System.out.println("I numeri sono:");
            System.out.print("x:" +num1);
            System.out.print("  y:" +num2);
            System.out.print("  z:" +num3);
        }else if(scelta==2){    //l'utente vuole vedere solo un numero
            System.out.println("Quale numero vuoi vedere? (scrivere 1 per x, 2 per y o 3 per z)");  
            int vedi=see.nextInt(); //per la scelta uso l'int al posto della stringa per far funzionare i controlli successivi
            
            System.out.print("Il tuo numero è-> ");
            if(vedi==1) //se vuole vedere x
            { System.out.println("x: "+num1);}
            else if(vedi==2)    //se vuole vedere y
                {System.out.println("y: "+num2);}
            else if(vedi==3)    //se vuole vedere z
                {System.out.println("z: "+num3);}
        }

}   //fine funzione
    


 }  //chiusura classe