import java.util.ArrayList;
public class ListOfWords {
    private ArrayList<String> words;

    public ListOfWords(ArrayList<String> words){
        this.words = new ArrayList<String>(words);

    }
    public String getLongestWordLength() {
        String longestWord = words.get(0);
        for (int x = 0; x < words.size(); x++) {
            if (words.get(x).length() > words.get(x + 1).length()) {
                return words.get(x);
            }
        }
        return null;
    }
}
