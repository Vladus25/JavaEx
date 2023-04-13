package Veicoli;

public class Bicicletta extends Veicolo {
    public Bicicletta() {
        super(0, 0);
    }

    // pedala caso setta i nuovi valori di nel seguente modo:
    // - accelerazione (num. Pedalate / sec ^2)
    // - velocità (vel. Precedente + acc*sec)
    public void pedala(int numeroPedalate, int secondi) {
        double accelerazione = numeroPedalate / Math.pow(secondi, 2);
        double nuovaVelocita = this.getVelocita() + (accelerazione * secondi);
        this.setVelocita(nuovaVelocita);
        this.setAccelerazione(accelerazione);
    }

    // stampa il numero di ruote del veicolo => 2
    public void printNRuote() {
        System.out.println("La bicicletta ha 2 ruote");
    }
}
