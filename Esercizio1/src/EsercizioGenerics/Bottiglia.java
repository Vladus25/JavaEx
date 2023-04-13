package EsercizioGenerics;

public class Bottiglia <T> {
	
	private T contenuto;

	public Bottiglia(T contenuto) {
		super();
		this.contenuto = contenuto;
	}

	public T getContenuto() {
		return contenuto;
	}
	
}
