package Week3Day4.Map;

import java.util.HashMap;

public class CountAlphabet {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "aaabbbccdefg";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isAlphabet(c)){
                if(map.containsKey(c)) {
                    int count = map.get(c);
                    map.put(c, count + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
        System.out.println(map);
    }

    public static boolean isAlphabet(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}

