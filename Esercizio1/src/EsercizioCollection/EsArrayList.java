package EsercizioCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class EsArrayList {

	public static void main(String[] args) {
		ArrayList <String> nomi = new ArrayList<String>();
		nomi.add("Paola");
		nomi.add("Luca");
		nomi.add("Carlo");
		
		System.out.println(nomi.size());
		
		String[] altriNomi = {"Gigi","Monica"};
		
		nomi.addAll(Arrays.asList(altriNomi));
		
//		nomi.addAll(Arrays.asList("Gigi","Monica"));
		
		String quartoNome = nomi.get(3);
		
		System.out.println(quartoNome);
		
		String elimina = nomi.remove(2);
		
		System.out.println(elimina);
		
		for (int i = 0; i < nomi.size(); i++) {
			System.out.println(nomi.get(i));
		}
		
		for(String s: nomi) {
			System.out.println(s);
		}
		
		Iterator<String> it = nomi.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		
	}

}
