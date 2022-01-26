import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import org.junit.jupiter.api.Test;

class DocumentsProcessorTest {

	@Test
	void testProcessDocuments() throws FileNotFoundException {
		Reader fis = new FileReader("sm_doc_set");
		DocumentIterator ws = new DocumentIterator(fis, 3);
		assertTrue(ws.hasNext());
		assertEquals("smdocset", ws.next());
	}

	@Test
	void testStoreNWordSequences() {
		fail("Not yet implemented");
	}

	@Test
	void testComputeSimilarities() {
		fail("Not yet implemented");
	}

	@Test
	void testPrintSimilarities() {
		fail("Not yet implemented");
	}

}
