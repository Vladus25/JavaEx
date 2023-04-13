package Esercitazione;

public class Main {

	public static void main(String[] args) {
		
		Triangolo t = new Triangolo(4,4);
		System.out.println(t.calcolaArea());
		
		Rettangolo r = new Rettangolo(2,2);
		System.out.println(r.calcolaArea());
	}

}
