import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
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
			DocumentIterator ws = new DocumentIterator(fis);
			
			List<String> word = new ArrayList<>();
			List<List<String>> element = new ArrayList<>();
			
			for (int i = 0; i < n; i++) {
				word.add(ws.next());
			}
			element.add(word);
			
			
			int i = 1;
			while(ws.hasNext()) {
			//create a copy of previous element and add to the ArrayList
			@SuppressWarnings("unchecked")
			ArrayList<String> newword = (ArrayList<String>) ((ArrayList<String>) element.get(i-1)).clone();
			element.add(newword);
			newword.add(ws.next());
			newword.remove(0);
			newword.get(0);
			i++;
			}
			
			//To save space, concatenate the words in each sequence
			int j = 0;
			List<String> savespace = new ArrayList<>();
			while(j < element.size()) {
				String s = "";
				for (int k = 0; k < n; k++) {
					
				s = s + element.get(j).get(k); // concatenate each word
				
				}
				savespace.add(s);
				j++;
			}
			
			Map<String, List<String>> DocumentsMap = new TreeMap<String,List<String>>();
			DocumentsMap.put(directoryPath, savespace);
			
			return DocumentsMap;
			
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
