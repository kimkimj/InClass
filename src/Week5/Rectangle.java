package Week5;

public class Rectangle {
    public static void main(String[] args) {
        /*
        square(4);
        System.out.println();
        rectangle(4, 6);*/
        recursiveSquare(4, 0);
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

    public static void recursiveSquare(int width, int count){
        if (count == width){
            System.out.print("");
        } else{
            for (int i = 0; i < width ; i++) {
                System.out.print("*");
            }
            System.out.println();
            recursiveSquare(width, count + 1);
        }

    }
}
