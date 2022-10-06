package Week3Day4.Set;

import java.util.*;

public class UniqueRandNum {
    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        Set<Integer> unique = new HashSet<>();
        // 50 random numbers
        for (int i = 0; i < 50; i++) {
            // create random numbers within the range of 10
            int randNum = rng.create(10);

            // add the number to the set
            unique.add(randNum);
        }
        // print the set of random numbers
        System.out.println(unique);
        System.out.println(unique.size());
    }
}
