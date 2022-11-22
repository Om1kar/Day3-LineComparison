package Day3Line;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison ComputationProgram");
        int x1,x2,y1,y2;
        double lengthOfLine1;
        double lengthOfLine2;
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter co-ordinates of x1");
         x1 = sc.nextInt();
         System.out.println("Enter co-ordinates of x2");
         x2 = sc.nextInt();
         System.out.println("Enter co-ordinates of y1");
         y1 = sc.nextInt();
         System.out.println("Enter co-ordinates of y2");
         y2 = sc.nextInt();

         lengthOfLine1 = sqrt((x2-x1)*2.0+(y2-y1)*2.0);
         lengthOfLine2 = sqrt((x1-x2)*2.0+(y1-y2)*2.0);

        System.out.println(lengthOfLine1);
        System.out.println(lengthOfLine2);

    }
}
