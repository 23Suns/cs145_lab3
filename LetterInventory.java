import java.lang.String;
import java.lang.Character;

public class LetterInventory {
    
    private String originalWord = "";
    private int[] letterCounts; // array to hold count of letters
    private int totalLetters; // total number of letters across all counts
    private static final int NUM_LETTERS = 26; // number of letters constant

    // constructor
    public LetterInventory(String data) {
        originalWord = data;
        letterCounts = new int[NUM_LETTERS];
        totalLetters = 0;

        for (int i = 0; i < data.length(); i++) {
            char letter = Character.toLowerCase(data.charAt(i));
            if (letter >= 'a' && letter <= 'z') {
                int index = letter - 'a';
                letterCounts[index]++;
                totalLetters++;
            }
        }
    }

    public String getOriginalWord() {
        return "[ " + originalWord + " ]";
    }

    // Get count for a given letter
    public int get(char letter) {
        int index = Character.toLowerCase(letter) - 'a';
        return letterCounts[index];
    }

    public void set(char letter, int value) {
        int index = letter - 'a';
        letterCounts[index] = value;
    }

    public int size() {
        return totalLetters;
    }

    public boolean isEmpty() {
        return totalLetters == 0;
    }

    public String toString() {
        String result = "[ ";
        for (int i = 0; i < NUM_LETTERS; i++) {
            char letter = (char)('a' + i);
            for (int j = 0; j < letterCounts[i]; j++) {
                result += letter;
                if (j < letterCounts[i] - 1) {
                    result += ",";
                }
                result += " ";
            }
        }
        result += "]";
        return result;
    }

    public LetterInventory add(LetterInventory other) {
        LetterInventory sum = new LetterInventory("");

        for (int i = 0; i < NUM_LETTERS; i++) {
            sum.letterCounts[i] = this.letterCounts[i] + other.letterCounts[i];
        }
        sum.totalLetters = this.totalLetters + other.totalLetters;

        return sum;
    }

    public LetterInventory subtract(LetterInventory other) {
        
        LetterInventory diff = new LetterInventory("");
        
        for(int i=0; i<NUM_LETTERS; i++) {
            int count = this.letterCounts[i] - other.letterCounts[i];
            if(count < 0) {
                return null; // negative count found
            }
            diff.letterCounts[i] = count; 
        }
        diff.totalLetters = this.totalLetters - other.totalLetters;
        
        return diff;
    }
}
