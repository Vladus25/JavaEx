package EsercizioGenerics;

public class Distributore {
	public void prendiBottgilia(Bottiglia<?> bottiglia) {
		System.out.println("Ho preso una bottiglia di " + bottiglia.getContenuto());
	}
}
