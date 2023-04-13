package EsercitazioneTryCatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainDue {
	
	public static long dimFile(String nomeFile) throws IOException{
		return Files.size(Paths.get(nomeFile));
	}
	
	public static void main(String[] args) {
		String nomeFile = "dati.txt";
		try {
			long dim = dimFile(nomeFile);
			System.out.println("I file" + nomeFile + " ha dimensione " + dim);
		}
		catch(IOException e) {
			System.out.println("Imposibile calcolare dimensione del file");
		}

	}

}
