package Week5;

import java.util.Scanner;

public class RT {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int line = sc.nextInt();

        for(int i = 1; i < line; i++){
            for(int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}