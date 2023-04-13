package Veicoli;

public abstract class Veicolo {
    private double velocita;
    private double accelerazione;

    public Veicolo() {
        this.velocita = 0;
        this.accelerazione = 0;
    }

    public Veicolo(double velocita, double accelerazione) {
        this.velocita = velocita;
        this.accelerazione = accelerazione;
    }

    // GETTERS
    public double getVelocita() {
        return this.velocita;
    }

    public double getAccelerazione() {
        return this.accelerazione;
    }

    // SETTERS
    public void setVelocita(double velocita) {
        this.velocita = velocita;
    }

    public void setAccelerazione(double accelerazione) {
        this.accelerazione = accelerazione;
    }

    // prende in input un oggetto di classe VEICOLO e ne stampa la velocità
    static public void printVelocita(Veicolo v){
        System.out.println("La velocità del veicolo è: " + v.getVelocita());
    }

    // stampa il numero di ruote del veicolo, METODO ASTRATTO
    public abstract void printNRuote();
}
