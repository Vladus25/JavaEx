package GiocoCarte;

public class Licantropo extends Personaggio implements Combattente {
    private boolean notteDiLunaPiena;

    public Licantropo() {
        super(15);
        notteDiLunaPiena = false;
    }

    public boolean isNotteDiLunaPiena() {
        return notteDiLunaPiena;
    }

    public void setNotteDiLunaPiena(boolean notteDiLunaPiena) {
        this.notteDiLunaPiena = notteDiLunaPiena;
    }

    @Override
    public String getTipo() {
        return "Licantropo";
    }

    @Override
    public void descrivi() {
        System.out.println("Sono un Licantropo " + (notteDiLunaPiena ? "di tipo Mostro" : "di tipo Umano") + " con forza fisica " + getForzaFisica());
    }

    @Override
    public void combatti() {
        setForzaFisica(getForzaFisica() - (notteDiLunaPiena ? 2 : 3));
        System.out.println("Il Licantropo " + (notteDiLunaPiena ? "da Mostro" : "da Umano") + " attacca il nemico con una forza di " + (notteDiLunaPiena ? 2 : 3));
    }

//    @Override
//    public void azzanna() {
//        setForzaFisica(getForzaFisica() - (notteDiLunaPiena ? 4 : 5));
//        System.out.println("Il Licantropo " + (notteDiLunaPiena ? "da Mostro" : "da Umano") + " attacca il nemico con una forza di " + (notteDiLunaPiena ? 2 : 3));
//    }
}


