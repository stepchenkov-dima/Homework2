import java.util.Scanner;

public class homework2 {
    public static void main (String[] args){
        /*Є прямокутник, в якого відома ширина w і висота h. Обчисліть і
        виведіть в консоль периметр і площу заданого прямокутника.*/
        System.out.println("Enter the width");
        Scanner w = new Scanner(System.in);
        int width = w.nextInt();
        System.out.println("Enter the height");
        Scanner h = new Scanner(System.in);
        int height = h.nextInt();
        System.out.printf("width = %d\nHeight = %d ",width, height);
        final int perimeter = 2 * (width + height);
        System.out.printf("\nperimeter = %d ",perimeter); //S = a x b
        final int square = width * height;
        System.out.printf("\nsquare = %d ",square);
    }
}
