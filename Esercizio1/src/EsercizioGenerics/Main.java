package EsercizioGenerics;

public class Main {

	public static void main(String[] args) {
		Bottiglia<Aqua> acq = new Bottiglia<Aqua>(new Aqua());
		Bottiglia<Vino> vin = new Bottiglia<Vino>(new Vino());
		Distributore distributore = new Distributore();
		
		distributore.prendiBottgilia(vin);
		distributore.prendiBottgilia(acq);
	}

}
