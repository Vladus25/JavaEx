package EsercizioArticolo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Catalogo<Articolo> catalogo = new Catalogo<>();
        
        Articolo a1 = new ArticoloImpl("Prodotto 1", 8.0);
        Articolo a2 = new ArticoloImpl("Prodotto 2", 15.0);
        Articolo a3 = new ArticoloImpl("Prodotto 3", 33.0);
        
        catalogo.aggiungiArticolo(a1);
        catalogo.aggiungiArticolo(a2);
        catalogo.aggiungiArticolo(a3);
        
        System.out.println(catalogo); // stampa l'intero catalogo
        
        List<Articolo> sottoPrezzo = catalogo.getArticoliSottoPrezzo(25.0);
        
        System.out.println(sottoPrezzo); // stampa gli articoli sotto il prezzo passato
    }
}


