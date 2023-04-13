package Veicoli;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Automobile a = new Automobile("AB123CD");
		Bicicletta b = new Bicicletta();

		int scelta = 0;

		do {
			System.out.println("\nCon quale mezzo vuoi andare oggi a lavoro:");
			System.out.println("1) Automobile");
			System.out.println("2) Bicicletta");
			System.out.println("0) Smart Working");
			scelta = scanner.nextInt();
			scanner.nextLine();
			switch (scelta) {
			case 1:
				// accelera la macchina di 10 m/s^2 per 5 secondi

				a.accelera(10, 5);
				System.out.println("\nVuoi avviare la macchina?");
				System.out.println("1) Si");
				System.out.println("2) No");

				int sceltaM = 0;
				sceltaM = scanner.nextInt();
				scanner.nextLine();

				switch (sceltaM) {
				case 1:
					a.avvia();
					a.accelera(10, 5);
					// stampa la velocità e il numero di ruote di automobile
					printVelocita(a);
					printNRuote(a);
					break;
				case 2:
					break;
				};

				break;
			case 2:
				//pedala la bicicletta per 10 volte al secondo per 5 secondi
				b.pedala(10, 5);

				// stampa la velocità e il numero di ruote di bicicletta
				printVelocita(b);
				printNRuote(b);

				break;
			case 0:
				System.out.println("\nApplicazione chiusa");
				scanner.close();
				break;
			default:
				System.out.println("\nScelta non valida");
				break;
			}
		} while (scelta != 0);

	}

	// prende in input un oggetto di classe VEICOLO e ne stampa la velocità
	static public void printVelocita(Veicolo v) {
		System.out.println("La velocità del veicolo è: " + v.getVelocita() + " m/s");
	}

	// stampa il numero di ruote del veicolo
	static public void printNRuote(Veicolo v) {
		v.printNRuote();
	}
}

