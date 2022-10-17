package Week5;

public class Pyramid {
    public static void main(String[] args) {
        int numLine = 4;
        for(int i = 0; i < numLine; i++){
            for(int spaces = 0; spaces < numLine - 1 - i; spaces++){
                System.out.print(" ");
            }
            for(int star = 0; star < 2 * i + 1; star++){
                System.out.print("*");
            }
            for(int spaces = 0; spaces < numLine - 1 - i; spaces++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

