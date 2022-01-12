/* Create a ListOfWords class whose constructor receives
an arrayList of words and copies the list. Then write the
implementation of a method named getLongestWordLength() that
returns the length of the longest word. The runner below
checks to make sure things are working correctly.
*/
import java.util.ArrayList;
public class WarmUp9_3 {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("The");
		words.add("Quick");
		words.add("Red");
		words.add("Fox");

		ListOfWords myList1 = new ListOfWords(words);
		words.add("Jumped");
		ListOfWords myList2 = new ListOfWords(words);

		System.out.println( myList1.getLongestWordLength() );
		System.out.println( myList2.getLongestWordLength() );
	}

}


