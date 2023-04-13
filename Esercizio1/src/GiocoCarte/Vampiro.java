package GiocoCarte;

public class Vampiro extends Personaggio implements Azzannatore {
    public Vampiro() {
        super(15);
    }
    
    @Override
    public String getTipo() {
        return "Vampiro";
    }
    
    @Override
    public void descrivi() {
        System.out.println("Sono un Vampiro con forza fisica " + getForzaFisica());
    }
    
    @Override
    public void azzanna() {
        setForzaFisica(getForzaFisica() - 2);
        System.out.println("Il Vampiro ha azzannato!");
    }
}

