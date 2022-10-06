package Week3Day4.Set;

public class UniqueRandNum {
    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        // 50 random numbers
        for (int i = 0; i < 50; i++) {
            // create random numbers within the range of 10
            int randNum = rng.create(10);
            System.out.println(randNum);
        }
    }
}
