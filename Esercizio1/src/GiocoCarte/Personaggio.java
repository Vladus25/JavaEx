package GiocoCarte;

public abstract class Personaggio {
    private int forzaFisica;
    
    public Personaggio(int forzaFisica) {
        this.forzaFisica = forzaFisica;
    }
    
    public int getForzaFisica() {
        return forzaFisica;
    }
    
    public void setForzaFisica(int forzaFisica) {
        this.forzaFisica = forzaFisica;
    }
    
    public abstract String getTipo();
    
    public abstract void descrivi();
}

