package EsHashet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) {
		
//		HashSet<String> set = new HashSet<String>();
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for (int i = 0; i < 20; i++) {
			set.add("Oggetto bunero: " + i);
		}
		
		for(String elemento:set) {
			System.out.println(elemento);
		}
	}

}
