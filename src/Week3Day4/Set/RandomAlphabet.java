package Week3Day4.Set;

import java.util.HashSet;
import java.util.Set;

public class RandomAlphabet {
    public static void main(String[] args) {
        RandomAlphabetGenerator rag = new RandomAlphabetGenerator();
        Set<Character> uniqueLetters = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            char randAlphabet = rag.create();
            uniqueLetters.add(randAlphabet);
        }
        System.out.println(uniqueLetters);
    }
}
