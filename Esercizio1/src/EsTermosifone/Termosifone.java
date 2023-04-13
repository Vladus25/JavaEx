package EsTermosifone;

public class Termosifone {
    private int temperatura;
    private boolean acceso;

    public void accendi() {
        this.acceso = true;
    }

    public void spegni() {
        this.acceso = false;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        if (temperatura < 20) {
            accendi();
        } else if (temperatura > 30) {
            spegni();
        }
    }

    public int getTemperatura() {
        return temperatura;
    }

    public boolean isAcceso() {
        return acceso;
    }
}

