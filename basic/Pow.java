import java.util.Scanner;
public class Pow {
    public static void main(String[] args) {
        //declare the scanner and the n variable
        Scanner scan = new Scanner(System.in);
        int n;
        //ask for the number and do the square
        System.out.println("Type a number you want the square: ");
        n = scan.nextInt();
        int square = n * n;
        //return the result
        System.out.println("The square of " + n + " is " + square + ".");
    }
}
