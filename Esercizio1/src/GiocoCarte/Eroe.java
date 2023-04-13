package GiocoCarte;

public class Eroe extends Personaggio implements Combattente {
    public Eroe() {
        super(10);
    }
    
    @Override
    public String getTipo() {
        return "Eroe";
    }
    
    @Override
    public void descrivi() {
        System.out.println("Sono un Eroe con forza fisica " + getForzaFisica());
    }
    
    @Override
    public void combatti() {
        setForzaFisica(getForzaFisica() - 3);
        System.out.println("L'Eroe ha combattuto!");
    }
}

