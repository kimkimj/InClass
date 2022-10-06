package Week3Day4;

import java.util.Scanner;

public class HW1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1021
        System.out.println(sc.next());

        // 1022
        System.out.println(sc.nextLine());

        // 1023
        // Split with a dot
        String str = sc.next();
        String numbers[] = str.split("\\.");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        // 1024
        // Seperate every letter in a astring
        String str = sc.next();
        String[] letters = str.split("");
        for(int i = 0; i < str.length(); i++) {
            System.out.println("'" + letters[i] +"'");
        }

        // 1025
        String num = sc.next();
        String[] digit = num.split("");

        for (int i = 0; i < num.length(); i++) {
            int number = Integer.parseInt(digit[i]);
            number = number * (int) Math.pow(10, (digit.length -1 - i));
            System.out.printf("[%d]", number);
            System.out.println();
        }

        // 1026
        String time = sc.next();
        String[] times = time.split(":");
        System.out.println(Integer.parseInt(times[1]));

        // 1027
        String date = sc.next();
        String[] dt = date.split("\\.");
        System.out.printf("%s-%s-%s", dt[2], dt[1], dt[0]);

        // 1028
        // numbers greater than 2m is a long
        long num = sc.nextLong();
        System.out.println(num);

        // 1029
        // Print to 11th decimal place

        double num = sc.nextDouble();
        System.out.printf("%.11f", num);

        // 1030
        long num = sc.nextLong();
        System.out.println(num);
    }
}
