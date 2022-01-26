import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.io.Reader;
import java.io.StringReader;

import org.junit.jupiter.api.Test;

class DocumentIteratorTest {

	@Test
	public void testNullInputToConstructor() {
		assertThrows(IllegalArgumentException.class, ()->{
			new DocumentIterator(null, 0);
		});
	}

	@Test
	public void testHasNext() {
		Reader r = new StringReader("one");
		DocumentIterator ws = new DocumentIterator(r, 1);
		assertTrue(ws.hasNext());
	}

	
	@Test
	public void testNextNext() {
		Reader r = new StringReader("one two three four");
		DocumentIterator ws = new DocumentIterator(r,4);
		assertTrue(ws.hasNext());
		assertEquals("onetwothreefour", ws.next());
		assertFalse(ws.hasNext());

	}
}
