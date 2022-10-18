package Week5;

public class Rectangle {
    public static void main(String[] args) {
        square(4);
    }

    public static void square(int width){
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
