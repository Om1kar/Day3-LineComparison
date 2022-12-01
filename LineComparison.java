package LineComputation;

import java.util.Scanner;

public class LineComparison {
    int x1 = 0;
    int x2 = 0;
    int y1 = 0;
    int y2 = 0;
    double lengthOfLine1;
    double lengthOfLine2;

    void valueOfLength() {
        /*
        created scanner object to get user input
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ordinates of x1");
        x1 = sc.nextInt();
        System.out.println("Enter co-ordinates of x2");
        x2 = sc.nextInt();
        System.out.println("Enter co-ordinates of y1");
        y1 = sc.nextInt();
        System.out.println("Enter co-ordinates of y2");
        y2 = sc.nextInt();
    }

    void calculateLength() {
        lengthOfLine1 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("Length of first line= " + lengthOfLine1);
        lengthOfLine2 = Math.sqrt((x1 - x2) ^ 2 + (y1 - y2) ^ 2);
        System.out.println("Length of second line= " + lengthOfLine2);
    }

    /*
    Method is created to check two lines are equal or not
     */
    void checkEquals() {
        if (lengthOfLine1 == lengthOfLine2) {
            System.out.println(lengthOfLine1 + " & " + lengthOfLine2 + " Both lines are Equal");
        } else System.out.println("Lines are Not Equal");
    }

    /*
    Method is created to compare length of two lines
     */
    void greaterLengthOfLine() {
        if (lengthOfLine1 > lengthOfLine2) {
            System.out.println(lengthOfLine1 + " =>Length of first line is Greater");
        } else System.out.println(lengthOfLine2 + " =>Length of second line is Greater");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison ComputationProgram");
        /*
        made an object of class to call a non-static methods
         */
        LineComparison lineComparison = new LineComparison();
        lineComparison.valueOfLength();
        lineComparison.calculateLength();
        lineComparison.checkEquals();
        lineComparison.greaterLengthOfLine();
    }
}
