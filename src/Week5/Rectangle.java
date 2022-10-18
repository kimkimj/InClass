package Week5;

public class Rectangle {
    public static void main(String[] args) {
        square(4);
        System.out.println();
        rectangle(4, 6);
    }

    public static void square(int width){
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rectangle(int width, int height){
        for (int i = 0; i < height; i++) {
            System.out.println("*".repeat(width));
        }
    }

}
