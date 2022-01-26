import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class DocumentsProcessor implements IDocumentsProcessor {
	/**
     * @param directoryPath - the path to the directory
     * @param n    - the size of the sequence of words
     * @return collection of files with sequences of words
     */
	@Override
	public Map<String, List<String>> processDocuments(String directoryPath, int n) {
		try {
			Reader fis = new FileReader(directoryPath);
			DocumentIterator ws = new DocumentIterator(fis, n);
			
		} catch (FileNotFoundException e) {
			System.out.println("no file converted to string");
		}
		
		
		
		
		
		return null;
	}
	
	/**
     * We write nword sequences sequentially in the file. they are separated by
     * a space
     * 
     * @param docs - map of string with list of all nword sequences
     * @param nwordFilePath of the file to store the nword sequences
     * @return a list of file and size (in byte) of character written in file
     *         path
     */
	@Override
	public List<Tuple<String, Integer>> storeNWordSequences(Map<String, List<String>> docs, String nwordFilePath) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
     * @param nwordFilePath  of the file to store the nword sequences
     * @param fileindex - a list of tuples representing each file and its size
     *                  in nwordFile
     * @return a TreeSet of file similarities. Each Similarities instance
     *         encapsulates the files (two) and the number of nword sequences
     *         they have in common
     */
	@Override
	public TreeSet<Similarities> computeSimilarities(String nwordFilePath, List<Tuple<String, Integer>> fileindex) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
     * @param sims      - the TreeSet of Similarities
     * @param threshold - only Similarities with a count greater than threshold
     *                  are printed
     */
	@Override
	public void printSimilarities(TreeSet<Similarities> sims, int threshold) {
		// TODO Auto-generated method stub
		
	}

}
