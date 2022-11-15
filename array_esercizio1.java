/* Creare un sistema di inserimento in ciclo che riempa due array
 * uno di numeri ed uno di stringhe
 */
import java.util.Scanner;   //importo la funzionalità scanner dalla libreria di java util

public class array_esercizio1{
    public static void main(String[] args){

        //dichiaro e inizializzo le variabili
        int[] vett={0,0,0,0,0};
        String[] stringa={" ", " ", " ", " ", " "};
        Scanner scelta=new Scanner(System.in);

        int choice=0;

        //in continuazione l'utente deve scegliere se riempire la stringa o il vettore di interi e deve inserire l'elemento
        do{
             System.out.println("Premi 1 se vuoi inserire un intero, premi 2 se vuoi inserire una stringa, premi 3 per uscire");
             choice=scelta.nextInt();

             if(choice==3)  //se l'utente non vuole fare niente esco immediatamente dal ciclo
                break;

             if(choice==1){ //metto l'elemento nel vettore di interi
                Scanner valore=new Scanner(System.in);
                int i=0;
     
                while(i<5){
                    if(vett[i]==0){
                     System.out.println("Inserisci l'elemento: ");
                     int val=valore.nextInt();
                     vett[i]=val;
                     break; //una volta inserito l'elemento torna al menu della scelta
                    }  
                    else
                        i++;
                }
            }else if(choice==2){    //metto l'elemento nella stringa
                Scanner parola=new Scanner(System.in);
                int j=0;

                while(j<5){
                    if(stringa[j]==" "){    //così controlla se il valore è almeno falso e NON se c'è falsità di valore, però funziona quindi va bene uguale
                        System.out.println("Inserisci la parola: ");
                        String par=parola.nextLine();
                        stringa[j]=par;
                        break;  //una volta inserita la parola torna al menu della scelta
                    }
                        j++;
                }
            }

        }while(choice!=3);  //fine ciclo

        //ora deve stampare entrambi gli array
        System.out.println("\nArray vettore di interi:");
        int k=0;
        while(k<5){
            System.out.println(vett[k]);
            k++;
        }

        System.out.println("\nArray di stringhe");
        int l=0;
        while(l<5){
            System.out.println(stringa[l]);
            l++;
        }

    }//fine main   
        
}//fine classe