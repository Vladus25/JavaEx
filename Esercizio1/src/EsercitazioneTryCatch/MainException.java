package EsercitazioneTryCatch;

public class MainException {

	public static void main(String[] args) {
		try{
			Utente u = new Utente("Gianpiero");
			u.setPassword("abc");
		}
		catch(PasswordException | NullPointerException e) {
			System.out.println(e);
		}
		

	}

}
