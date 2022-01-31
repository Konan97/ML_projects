import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * DocumentIterator iterates over the words contained in some reader.
 * @author Sunyuting17
 *
 */

public class DocumentIterator implements Iterator<String> {

    private Reader r; // character stream
    private int    c = -1; // count
    
    

    public DocumentIterator(Reader r) {
    	// store the reader that we w'll use as the source of our data
        if (r == null) {
        	throw new IllegalArgumentException("null reader provided");
        }
        this.r = r;
        
        // get ready to start reading words from our document
        skipNonLetters();
    }

/**
 * read characters from the reader until we've read a character that is a letter
 */
    private void skipNonLetters() {
        try {
            this.c = this.r.read();
            while (!Character.isLetter(this.c) && this.c != -1) {
                this.c = this.r.read();
            }
        } catch (IOException e) {
            this.c = -1;
        }
    }

/**
 * check to see if there is still a word to be read from our reader
 */
    @Override
    public boolean hasNext() {
        return (c != -1);
    }
/**
 * return the next word in our reader and then advance the reader
 */
    @Override
    public String next() {
    	
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String answer = "";

        try {
        	
        	
        		
            while (Character.isLetter(this.c)) {
                answer = answer + (char)this.c;
                answer = answer.toLowerCase();
                this.c = this.r.read();
                
            }
            skipNonLetters();
        	
        } catch (IOException e) {
            throw new NoSuchElementException();
        }

        return answer;
    }

	

}
