package Veicoli;

public class Automobile extends Veicolo {
	
    private String targa;
    private boolean avviata;

    public Automobile(String targa) {
        super();
        this.targa = targa;
        this.avviata = false;
    }

    // "accende" e "spegne" la macchina, agendo sul boolean avviata
    public void avvia() {
        this.avviata = true;
    }

    public void spegni() {
        this.avviata = false;
        this.setAccelerazione(0);
    }

    // accelera controlla se la macchina è avviata, nel qual caso setta i nuovi valori di accelerazione e velocità (vel. Precedente + acc*sec)
//    public void accelera(double accelerazione, int secondi) {
//        if (this.avviata) {
//            double nuovaVelocita = this.getVelocita() + (accelerazione * secondi);
//            this.setVelocita(nuovaVelocita);
//            this.setAccelerazione(accelerazione);
//        }
//    }
    // accelera controlla se la macchina è avviata, nel qual caso setta i nuovi valori di accelerazione e velocità (vel. Precedente + acc*sec)
    public void accelera(double accelerazione, int secondi) {
        if (avviata) {
            double velPrec = getVelocita();
            setVelocita(velPrec + accelerazione * secondi);
            setAccelerazione(accelerazione);
        } else {
            System.out.println("La macchina non è avviata, impossibile accelerare.");
        }
    }


    // stampa il numero di ruote del veicolo => 4
    public void printNRuote() {
        System.out.println("Il veicolo con targa " + this.targa + " ha 4 ruote");
    }
}
