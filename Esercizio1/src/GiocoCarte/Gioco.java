package GiocoCarte;

import java.util.Scanner;


public class Gioco {

    public static void main(String[] args) {
    	
    	// Creo tre istanze dei personaggi del gioco
        Eroe eroe = new Eroe();
        Vampiro vampiro = new Vampiro();
        Licantropo licantropo = new Licantropo();
        
        // Creo una nuova istanza della classe Scanner per leggere input dall'utente
        Scanner scanner = new Scanner(System.in);
        // Dichiaro una variabile intera per memorizzare la scelta dell'utente
        int scelta;
        
        // Stampo un messaggio di benvenuto e descrivo i personaggi del gioco
        System.out.println("Benvenuto nel gioco delle carte!");
        System.out.println("I personaggi sono:");
        eroe.descrivi();
        vampiro.descrivi();
        licantropo.descrivi();
        
        // Stampo un messaggio per segnalare l'inizio della partita
        System.out.println("Inizia la partita!");
        // Ciclo finché tutti i personaggi hanno ancora forza fisica
        while (eroe.getForzaFisica() > 0 && vampiro.getForzaFisica() > 0 && licantropo.getForzaFisica() > 0) {
        	// Chiedo all'utente di fare una scelta
            System.out.println("\nCosa vuoi fare?");
            System.out.println("1. Fai combattere l'Eroe");
            System.out.println("2. Fai azzannare il Vampiro");
            System.out.println("3. Fai combattere il Licantropo");
            scelta = scanner.nextInt();
            
            // In base alla scelta dell'utente, eseguo l'azione corrispondente
            switch (scelta) {
                case 1:
                    eroe.combatti();
                    System.out.println("L'Eroe ha " + eroe.getForzaFisica() + " di forza fisica rimanente.");
                    break;
                case 2:
                    vampiro.azzanna();
                    System.out.println("Il Vampiro ha " + vampiro.getForzaFisica() + " di forza fisica rimanente.");
                    break;
                case 3:
                	// Con una probabilità del 50%, imposto o tolgo lo stato "notte di luna piena" del Licantropo
                	if (Math.random() < 0.5) {
                        licantropo.setNotteDiLunaPiena(!licantropo.isNotteDiLunaPiena());
                    }
                	
                    licantropo.combatti();
                    System.out.println("Il Licantropo ha " + licantropo.getForzaFisica() + " di forza fisica rimanente.");
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }
        // Chiudo l'istanza del Scanner
        scanner.close();
        // Stampo un messaggio per segnalare la fine della partita e descrivo la forza fisica rimanente dei personaggi
        System.out.println("\nFine della partita!");
        System.out.println("Forza fisica rimanente:");
        eroe.descrivi();
        vampiro.descrivi();
        licantropo.descrivi();
    }
}


