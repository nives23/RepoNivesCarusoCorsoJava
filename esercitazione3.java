/*
Senza la valorizzazione diretta, creare 3 variabili (b, 123.34, 1),
sommare i risultati e dividerli per 3, farli stampare accompagnati da "evviva"
solo se c'è uguaglianza tra due variabili bool Bool1=true e Bool2=false
di cui non possiamo modificare il valore
*/
public class esercitazione3 {
    public static void main(String[] args) {

        //inizializzazione variabili
        double val1=123.34;  
        char val2='b';
        int val3=1;
        boolean Bool1=true, Bool2=false;

        //sommo e divido per 3
        double somma=(double)(val1+val2+val3);
        //double somma=(double)(123.34+1+'b');  //se non voglio inzializzare le variabili e fare direttamente il calcolo
        somma/=3;

        //stampo i risultati
        System.out.println(Bool1==!(Bool2)); 
        System.out.println(somma);
        System.out.println("evviva");      
        
    }   //chiusura main
    
}
