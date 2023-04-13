package RubricaEX;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Rubrica {

	private List<Contatto> contatti;

	public Rubrica() {
		contatti = new ArrayList<>();
	}

	public void aggiungiContatto(String nome, String cognome, String telefono) {
		Contatto contatto = new Contatto(nome, cognome, telefono);
		contatti.add(contatto);
	}

	public void rimuoviContatto(String nome, String cognome) {
		Iterator<Contatto> iter = contatti.iterator();
		while (iter.hasNext()) {
			Contatto contatto = iter.next();
			if (contatto.getNome().equals(nome) && contatto.getCognome().equals(cognome)) {
				iter.remove();
				break;
			}
		}
	}

	public String cerca(String nome, String cognome) {
		for (Contatto contatto : contatti) {
			if (contatto.getNome().equals(nome) && contatto.getCognome().equals(cognome)) {
				return contatto.getTelefono();
			}
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Contatto contatto : contatti) {
			sb.append(contatto).append("\n");
		}
		return sb.toString();
	}
}

