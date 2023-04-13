package EsTermosifone;

public class Main {

	public static void main(String[] args) {
		
		Termosifone termosifone = new Termosifone();
		
        termosifone.setTemperatura(18);
        System.out.println("Stato termosifone: " + termosifone.isAcceso());
        termosifone.setTemperatura(25);
        System.out.println("Stato termosifone: " + termosifone.isAcceso());
        termosifone.setTemperatura(32);
        System.out.println("Stato termosifone: " + termosifone.isAcceso());

	}

}
