import java.util.Scanner;
public class PowerOfANumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number: ");
        int x = scan.nextInt();
        System.out.println("Now, type the power you want this number be raised to: ");
        int pow = scan.nextInt();
        int result = 1;
        for(int  i = 0; i<pow; i++){
            result *= x;
        }
        System.out.println("The " + pow + "nd/rd/th power of " + x + " equals to " + result + ".");
    }
}
