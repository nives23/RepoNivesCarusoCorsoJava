/*Creiamo un sistema che ti permetta di inserire username e password
Solo dopo questo inserimento il sistema deve proseguire e chiederti di confermare entrambi gli elementi
Dopo averli confermati potremmo accedere a Quattro opzioni:
1)Aggiungi ad ArrayConstringhe (  Nome casuale )
2)Aggiungi ad ArrayConNumeri  (  Nome casuale )
3)Stampa
4)Esci
All'uscita dovrà stampare uno alla volta ogni elemento dell'array e chiederti la password per confermare le modifiche.  

Difficile:  Far anche rimuovere e modificare gli elementi. Aggiungendo al menu due sotto funzioni per ogni scelta di aggiunta possibile 
*/

import java.util.Scanner;   //importo la funzionalità scanner dalla libreria di java util
import java.util.ArrayList; //importo la libreria array list

class EsercizioTotale1{
    /**
     * @param args
     */
    public static void main(String[] args){
        
        //dichiarazione variabili
        Scanner nome=new Scanner(System.in);
        Scanner pass=new Scanner(System.in);
        boolean checknome=true, checkprofilo=true, checkmenu=true;
        String username;
        int dimv=0, dims=0;
        ArrayList<Integer> vett = new ArrayList<Integer>(); //vettore di interi
        ArrayList<String> stringa= new ArrayList<String>(); //array di stringhe
        Scanner choice= new Scanner(System.in);
        Scanner choice2= new Scanner(System.in);
        Scanner choice3= new Scanner(System.in);
        Scanner modificas=new Scanner(System.in);   //per modificare la stringa
        Scanner modificav=new Scanner(System.in);   //per modificare l'intero
        Scanner eliminas= new Scanner(System.in); //per eliminare un elemento dall'array stringa
        Scanner eliminav=new Scanner(System.in);  //per eliminare un elemento dall'array di interi
        Scanner news= new Scanner(System.in);   //per la stringa nuova
        Scanner newi= new Scanner(System.in);   //per l'intero nuovo
        Scanner input=new Scanner(System.in);


        //l'utente crea username e pasword
        do{
            System.out.println("Scegli il tuo username: ");
            username=nome.nextLine();

            if(username==" ")   //se l'username è vuoto, lo faccio inserire di nuovo
                checknome=false;
            else
                break;  //se non è vuoto posso uscrire dal ciclo
        }while(!checknome);

        System.out.println("Crea la tua password: ");
        String password=pass.nextLine();

        //faccio confermare all'utente username e password
        System.out.println("-------------------");  //per separare l'inserimento dal controllo 
        do{
            Scanner nome1= new Scanner(System.in);
            Scanner password1= new Scanner(System.in);

            System.out.println("Inserisci nuovamente l'username per confermarlo: ");
            String name1=nome1.nextLine();
            System.out.println("Inserisci nuovamente la tua password per confermarla: ");
            String pass1=password1.nextLine();

            if((name1.equals(username)) && (pass1.equals(password)))
                {checkprofilo=true;
                 break;}
            else{
                System.out.println("username o password errati!");
                checkprofilo=false;
            }
        }while(!checkprofilo);  //fine controllo profilo

        //mostro il menu all'utente e faccio scegliere
        do{
            
            int scelta; //mi servirà per indicare la scelta dell'utente

            System.out.println("-------------------");  //per separare dal controllo di prima
            System.out.println("Menu: \n1)Aggiungi ad ArrayConstringhe \n2)Aggiungi ad ArrayConNumeri \n3)Stampa \n4)Esci \n5)Modifica elemento \n6)Rimuovi elemento \nPremere 1,2,3,4, 5 o 6 per scegliere");
            scelta=choice.nextInt();
            
            //eseguo le azioni in base alla scelta
            if(scelta==1){          //aggiungo stringa all'array di stringhe

                System.out.println("Inserisci la parola: ");    //riempimento array di stringhe
                stringa.add(input.nextLine());
                dims++;
                continue;
            }
            else if(scelta==2){
                System.out.println("Inserisci il numero: "); //riempimento array di interi
                vett.add(input.nextInt());
                dimv++;
                continue;
            }
            else if(scelta==3){ //caso stampa
                System.out.println("\nIl tuo array di interi: "+vett);
                System.out.println("\nIl tuo array di stringhe: "+stringa);
                continue;
            }
            else if(scelta ==4){    //caso uscita
                System.out.println("Hai scelto di uscire.");
                checkmenu=false;
            }
            else if(scelta==5){ //caso modifica elemento
                System.out.println("\n Premi 1 per modificare l'ArrayConstringhe, 2 per modificare ArrayConNumeri");
                int scelta2=choice2.nextInt();

                if(scelta2==1){ //modifico l'array stringa
                    System.out.println("\nIl tuo array di stringhe è: "+stringa);
                    System.out.println("Quale elemento vuoi modificare?");
                    String vecchias=modificas.nextLine();
                    int i=0;

                    while(i<dims){
                        if(vecchias.equals(stringa.get(i))){
                            System.out.println("Inserisci il nuovo elemento:");
                            stringa.add(input.nextLine());
                            break;
                        }   //fine if
                        i++;
                    } //chiusura while
                }
                else if(scelta2==2){ //modifico l'array di interi
                    System.out.println("\nIl tuo array di interi è: "+vett);
                    System.out.println("Quale elemento vuoi modificare?");
                    int vecchioi=modificav.nextInt();
                    int j=0;

                    while(j<dimv){
                        if(vecchioi==vett.get(j)){
                            System.out.println("Inserisci il nuovo elemento:");
                            vett.add(input.nextInt());
                            break;
                        }   //fine if
                        j++;
                    } //chiusura while

                }//else if
            } //fine caso 5
            else if(scelta==6){ //caso elimina elemento
                System.out.println("\n Premi 1 per rimuovere un elemento da ArrayConstringhe, 2 per rimuovere da ArrayConNumeri");
                int scelta3=choice3.nextInt();

                if(scelta3==1){ //elimino dall'array stringa
                    System.out.println("\nIl tuo array di stringhe è: "+stringa);
                    System.out.println("Quale elemento vuoi togliere?");
                    String elems=eliminas.nextLine();
                    
                    for(int k=0; k<dims; k++){
                        if(elems.equals(stringa.get(k))){
                            stringa.remove(k);
                            dims--;
                            break;
                        }
                    }
                }//fine caso array
                else if(scelta3==2){ //elimino dall'array di interi
                    System.out.println("\nIl tuo array di stringhe è: "+vett);
                    System.out.println("Quale elemento vuoi togliere?");
                    int elemc=eliminav.nextInt();
                
                    for(int p=0; p<dimv; p++){
                        if(elemc==vett.get(p)){
                            stringa.remove(p);
                            dimv--;
                            break;
                        }
                    }
                }//fine caso vettore
                
            }

            
                
        }while(checkmenu);//fine ciclo menu


    }//chiusura main

    
    
}//chiusura classe