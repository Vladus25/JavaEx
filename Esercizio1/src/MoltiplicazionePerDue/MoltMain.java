package MoltiplicazionePerDue;

public class MoltMain {

	public static void main(String[] args) {
		
		MoltiplicaiozneImpl n = new MoltiplicaiozneImpl();
		
		int result = n.EseguiOperazione(25);
		
		System.out.println("Il risultato: " + result);

	}

}
