package RubricaEX;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Rubrica rubrica = new Rubrica();
        
        rubrica.aggiungiContatto("Mario", "Rossi", "1234567890");
        rubrica.aggiungiContatto("Luigi", "Bianchi", "0987654321");
        rubrica.aggiungiContatto("Giovanni", "Verdi", "5678901234");
        
        Scanner scanner = new Scanner(System.in);
        
        int scelta = 0;
        
        do {
            System.out.println("\nSeleziona un'opzione:");
            System.out.println("1) Aggiungi contatto");
            System.out.println("2) Rimuovi contatto");
            System.out.println("3) Cerca contatto");
            System.out.println("4) Visualizza rubrica");
            System.out.println("0) Esci");
            scelta = scanner.nextInt();
            scanner.nextLine();
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Inserisci il cognome:");
                    String cognome = scanner.nextLine();
                    System.out.println("Inserisci il numero di telefono:");
                    String telefono = scanner.nextLine();
                    rubrica.aggiungiContatto(nome, cognome, telefono);
                    System.out.println("\nContatto aggiunto con successo.");                 
                    break;
                case 2:
                    System.out.println("Inserisci il nome:");
                    nome = scanner.nextLine();
                    System.out.println("Inserisci il cognome:");
                    cognome = scanner.nextLine();
                    rubrica.rimuoviContatto(nome, cognome);
                    System.out.println("\nContatto rimosso con successo.");
                    break;
                case 3:
                    System.out.println("Inserisci il nome:");
                    nome = scanner.nextLine();
                    System.out.println("Inserisci il cognome:");
                    cognome = scanner.nextLine();
                    telefono = rubrica.cerca(nome, cognome);
                    if (telefono != null) {
                        System.out.println("\nIl numero di telefono di " + nome + " " + cognome + " è " + telefono);
                    } else {
                        System.out.println("\nNessun contatto trovato con il nome " + nome + " " + cognome);
                    }
                    break;
                case 4:
                    System.out.println(rubrica);
                    break;
                case 0:
                    System.out.println("Arrivederci Simona");
                    scanner.close();
                    break;
                default:
                    System.out.println("\nScelta non valida. Ho previsto tale scelta Simona :)");
                    break;
            }
        } while (scelta != 0);
    }
}

