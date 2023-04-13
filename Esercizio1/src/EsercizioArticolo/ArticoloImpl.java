package EsercizioArticolo;

class ArticoloImpl implements Articolo {
    private String nome;
    private double prezzo;

    public ArticoloImpl(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String toString() {
        return nome + " - " + prezzo;
    }
}
