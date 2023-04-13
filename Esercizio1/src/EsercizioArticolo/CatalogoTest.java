package EsercizioArticolo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CatalogoTest {

	@Test
	void test() {
		System.out.println("Primo test");
		String string1 = "Qualcosa";
		assertEquals("Qualcosa", string1);
	}
	
	@Test
	void testCompare() {
		Confronto c = new Confronto();
		int value = c.compare(3, 2);
		assertEquals(1, value);
	}

}
