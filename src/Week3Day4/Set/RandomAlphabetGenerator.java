package Week3Day4.Set;

public class RandomAlphabetGenerator {
    public char create() {
        int randNum = (int)(Math.random() * 26);
        return (char) (randNum + 97);
    }
}
