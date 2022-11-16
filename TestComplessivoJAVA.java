/* Creare un sistema che faccia inserire e che poi controlli password e nome oppure esci
(DIFF: che ci permetta di avere più utenti)
Avere al interno del sistema però salvate le credenziali di un ADMIN, che può ordinare senza pagare e aggiungere e modificare la lista 
piatti e prezzi. Dopo il login dovrà essere assegnato all' utente un budget
Creare un menu con 3 opzioni
- Visualizza Lista CIbo   - Carrello o Paga  - Esci 

- Visualizza Lista CIbo  ---> Dovrà STAMPARE UN MENU DI PIATTI COI PREZZI e permettere di selezionare
- Carrello o Paga ---> Dovrai POTER SCEGLIERE DA QUI SE PAGARE E SE HAI ABBSTANZA SOLDI DOPO LA CONFERMA DELLA PASSWORD SCALERà LA PECUNIA
- Esci ---> VA A STAMPARE IL TOTALE DEGHLI ELEMENTI COMPRATI E IL CONTO TOTALE 

Dovrai tornare alla possibilità di LOGIN e poterlo rifare */

import java.util.Scanner;   //importo la funzionalità scanner dalla libreria di java util
import java.util.ArrayList; //importo la libreria array list
import java.util.Random;    //importo la libreria Random

public class TestComplessivoJAVA{
    /**
     * @param args
     */
    public static void main(String[] args){

        //dichiarazione variabili
        Scanner nome=new Scanner(System.in);
        Scanner pass=new Scanner(System.in);
        String username, password;
        boolean checknome=true, checkprofilo=true, uscita=true, checkmenu1=true, checkAdmin=true;
        Scanner choice1= new Scanner(System.in);
        String admin="boss";    //admin
        String passadmin="capo1234";    //password admin
        int minimo=0, massimo=20;   //valori minimi e massimi per la funzione random che userò per assegnare un budget all'utente
        int budget;
        ArrayList<String> ListaCibo= new ArrayList<String>(); //menu del posto
        ArrayList<Integer> Prezzi=new ArrayList<Integer>(); //prezzi del menu
        ArrayList<String> Carrello= new ArrayList<String>(); //carrello utente
        Scanner input=new Scanner(System.in);
        int dim=6; //inizializzo la dimensione dei miei array
        Scanner modify=new Scanner(System.in);  //per scegliere cosa modificare 
        Scanner modificas=new Scanner(System.in);   //per modificare un piatto
        Scanner modificav=new Scanner(System.in);   //per modificare un prezzo
        Scanner remove=new Scanner(System.in);  //per rimuovere un elemento
        Scanner choiceAccount=new Scanner(System.in);   //per il menu scelta dell'utente
        boolean finitoUtente=true;
        Scanner chartpay=new Scanner(System.in);  //per la scelta di carrello o paga
        int conto=0, dimensionecarrello=0;
        String risposta;    //risposta se si vuole ordinare ancora oppure no
        Scanner answer=new Scanner(System.in);

        //Inizializzo gli elementi del menu
        ListaCibo.add("Pasta");
        ListaCibo.add("Porchetta");
        ListaCibo.add("Lasagne");
        ListaCibo.add("Cotoletta");
        ListaCibo.add("Caprese");
        ListaCibo.add("Frutta");

        //Inizializzo i prezzi del menu di default
        Prezzi.add(8);
        Prezzi.add(6);
        Prezzi.add(9);
        Prezzi.add(8);
        Prezzi.add(7);
        Prezzi.add(5);



        //prima scelta: l'utente sceglie se inserire username e pasword oppure uscire
        do{
            int scelta1; //mi servirà per indicare la scelta dell'utente

            System.out.println("Premi 1 per inserire username e password, Premi 2 per uscire");
            scelta1=choice1.nextInt();

            if(scelta1==1){
                //creazione username e password VALIDI
                do{
                    System.out.println("Inserisci il tuo username: ");
                    username=nome.nextLine();
                    System.out.println("Inserisci la tua password: ");
                    password=pass.nextLine();

                    if(username==" " || password==" ")   //se l'username è vuoto, lo faccio inserire di nuovo
                        checknome=false;
                    else
                        break;  //se non è vuoto posso uscrire dal ciclo
                }while(!checknome);
                
                if(!username.equals(admin) || (!password.equals(passadmin))){ //controllo che l'username e la password inseriti non siano quelle dell'admin

                    //faccio confermare username e password
                    System.out.println("-------------------");  //per separare l'inserimento dal controllo 
                    do{
                        Scanner nome1= new Scanner(System.in);
                        Scanner password1= new Scanner(System.in);

                        System.out.println("Inserisci nuovamente l'username per confermarlo: ");
                        String name1=nome1.nextLine();
                        System.out.println("Inserisci nuovamente la tua password per confermarla: ");
                        String pass1=password1.nextLine();

                        if(name1.equals(username) && (pass1.equals(password)))
                        {
                            System.out.println("--Username e password corretti.--");
                            checkprofilo=true;
                            break;}
                        else{
                            System.out.println("--USERNAME O PASSWORD ERRATI!-- \n Inseriscili di nuovo!");
                            checkprofilo=false;
                        }
                    }while(!checkprofilo);  //fine controllo profilo

                    //dopo il login assegno un budget all'utente
                    budget=randInt(minimo, massimo);
                    System.out.println("\nIl tuo budget è: "+budget);

                    //-----caso utente-----
                    do{
                        System.out.println("Scegli un'azione da fare: \n1)Visualizza Lista Cibo \n2)Ordina \n3)Carrello o paga \n4)Esci.\nDigita 1, 2, 3 0 4 per scegliere un'opzione:");
                        int sceltaUtente=choiceAccount.nextInt();

                        if(sceltaUtente==1){    //visualizzo il menu del posto
                            System.out.println("----VISUALIZZA MENU----");
                            System.out.println("Il menu è: " +ListaCibo);
                            System.out.println("I rispettivi prezzi sono: "+Prezzi);

                            continue;

                        }
                        else if(sceltaUtente==2){   //l'utente ordina
                            System.out.println("----ORDINE----");
                            System.out.println("Il menu è: " +ListaCibo);
                            System.out.println("I rispettivi prezzi sono: "+Prezzi);
                            boolean ordina=true;

                            
                            while(ordina){
                                String sceltaPiattoUtente;
                                Scanner choiceDishUtente= new Scanner(System.in);

                                System.out.println("Cosa vuoi ordinare?");
                                sceltaPiattoUtente=choiceDishUtente.nextLine();
                                
                                for(int c=0; c<dim; c++){
                                    if(sceltaPiattoUtente.equals(ListaCibo.get(c))){
                                        Carrello.add(ListaCibo.get(c));
                                        conto+=Prezzi.get(c);
                                        dimensionecarrello++;
                                        break;
                                    }
                                }

                                System.out.println("Vuoi ordinare ancora? Rispondi si o no.");
                                risposta=answer.nextLine();

                                if(risposta.equals("si")){
                                    continue;
                                }
                                else
                                    {ordina=false;}

                            }

                        }
                        else if(sceltaUtente==3){    //visualizza carrello o paga
                            int chart;
                            System.out.println("----OPZIONI CARRELLO----");
                            System.out.println("Premere 1 per visualizzare il carello, premere 2 per pagare:");
                            chart=chartpay.nextInt();

                            if(chart==1){

                                System.out.println("Nel tuo carrello hai i seguenti elementi: "+Carrello);
                                System.out.println("Il totale da pagare provvisorio è: "+conto);

                            }else if(chart==2){
                                if(conto<budget){
                                    budget-=conto;
                                    System.out.println("->Pagamento effettuato con successo!");
                                }
                                else{
                                    System.out.println("->Il tuo credito non è sufficiente, non puoi pagare!");
                                }
                            }

                            continue;

                        }else if(sceltaUtente==4){
                            System.out.println("Hai scelto di uscire, grazie e arrivederci! :)");
                            finitoUtente=false;
                            checkmenu1=false;
                            break;
                        }

                    }while(finitoUtente);

                }
                //------caso admin------
                else{   
                    int sceltaAdmin;
                    Scanner choiceAd=new Scanner(System.in);

                    //l'admin sceglie se ordinare, aggiungere o modificare un piatto
                    do{
                        System.out.println("Sei l'admin. Premi 1 per ordinare, 2 per aggiungere un piatto al menu, 3 per modificarne uno o 4 per uscire.");
                        sceltaAdmin=choiceAd.nextInt();
                        if(sceltaAdmin==1){ //l'admin vuole ordinare un piatto                            

                            //per prima cosa stampo il menu
                            System.out.println("Il menu è: " +ListaCibo);
                            System.out.println("I rispettivi prezzi sono: "+Prezzi);

                            //poi gli faccio scegliere un elemento dal menu
                            String sceltaPiatto;
                            Scanner choiceDish= new Scanner(System.in);

                            System.out.println("Scegli un elemento dal menu");
                            sceltaPiatto=choiceDish.nextLine();

                            System.out.println("---Sei l'admin, non devi pagare.");
                            checkAdmin=true;
                            
                        }
                        else if(sceltaAdmin==2){    //l'admin vuole aggiungere un piatto al menù

                            System.out.println("Quale piatto vuoi aggiungere?");
                            ListaCibo.add(input.nextLine());
                            System.out.println("Quanto deve costare questo piatto? (inserisci un numero intero)");
                            Prezzi.add(input.nextInt());
                            dim++;

                            System.out.println("\nIl tuo menu è: "+ListaCibo);
                            System.out.println("\nI rispettivi prezzi: "+Prezzi);

                            System.out.println("---Piatto inserito correttamente");
                            checkAdmin=true;  

                        }
                        else if(sceltaAdmin==3){    //l'admin vuole modificare un piatto dal menu
                            
                            int cambia;

                            System.out.println("Premi 1 per modificare un piatto, 2 per modificare un prezzo o 3 per rimuovere un piatto");
                            cambia=modify.nextInt();

                            if(cambia==1){  //cambio piatto
                                System.out.println("\nIl tuo menu è: "+ListaCibo);
                                System.out.println("Quale elemento vuoi modificare?");
                                String vecchias=modificas.nextLine();
                                int i=0;

                                while(i<dim){
                                    if(vecchias.equals(ListaCibo.get(i))){
                                        System.out.println("Inserisci il nuovo elemento:");
                                        ListaCibo.add(input.nextLine());
                                        break;
                                    }   //fine if
                                    i++;
                                } //chiusura while

                                System.out.println("\nIl tuo menu è: "+ListaCibo);

                            } else if(cambia==2){   //cambio prezzo
                                System.out.println("\nIl tuo menu è: "+ListaCibo);
                                System.out.println("\nI rispettivi prezzi prezzi: "+Prezzi);
                                System.out.println("Quale prezzo vuoi modificare?");
                                int vecchioi=modificav.nextInt();
                                int j=0;

                                while(j<dim){   //scorre finchè non trova il prezzo da modificare
                                    if(vecchioi==Prezzi.get(j)){
                                        System.out.println("Inserisci il nuovo elemento:");
                                        Prezzi.add(input.nextInt());
                                        break;
                                    }   //fine if
                                    j++;
                                } //chiusura while

                                System.out.println("\nIl tuo menu è: "+ListaCibo);
                                System.out.println("\nI rispettivi prezzi prezzi: "+Prezzi);

                            } else if(cambia==3){   //vuole rimuovere un elemento
                                System.out.println("\nIl tuo menu è: "+ListaCibo);
                                System.out.println("\nI rispettivi prezzi: "+Prezzi);
                                System.out.println("--->Scrivi il piatto che vuoi eliminare");
                                String elimina=remove.nextLine();   //deve scrivere il piatto

                                for(int k=0; k<dim; k++){  //mi cerco il piatto da eliminare
                                    if(elimina.equals(ListaCibo.get(k))){
                                        ListaCibo.remove(k);
                                        Prezzi.remove(k);
                                        dim--;
                                        break;
                                    }
                                }  

                                System.out.println("\nIl menu modificato è: "+ListaCibo);
                                System.out.println("\nI rispettivi prezzi: "+Prezzi);
                            }  

                            checkAdmin=true;
                             
                        }
                        else if(sceltaAdmin==4){    //caso in cui l'admin vuole uscire
                            System.out.println("Hai scelto di uscire, grazie e arrivederci :)");
                            checkAdmin=false;
                            break;
                        }
                    }while(checkAdmin);

                }   //fine caso admin

            }   //fine caso inserimento e controllo username e password
            else if(scelta1==2){
                System.out.println("Hai scelto di uscire.");
            }    


        }while(!checkmenu1);    //fine primo menu di scelta 
        


    }   //chiusura main

    //-----Funzioni di Utilità-----
    static int randInt(int min, int max) {  //genero un numero casuale che sarà il budget dell'utente (funzione trovata su internet)
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
      }

}   //chiusura classe
