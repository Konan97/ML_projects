import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class DocumentsProcessorTest {

	
	@Test
	void testProcessDocuments() throws FileNotFoundException {
		DocumentsProcessor DocumentsMap = new DocumentsProcessor();
		Map<String, List<String>> testMap = DocumentsMap.processDocuments("sm_doc_set", 3);
		System.out.println(testMap);
		
		
		
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
