import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Options calcule = new Options();

        System.out.println("Type the first number: ");
        calcule.operator1 = input.nextDouble();

        System.out.println("Type the second number: ");
        calcule.operator2 = input.nextDouble();

        System.out.println("Now, type the operator: ");
        calcule.operation = input.nextCharAt();

        System.out.println("\n"+ calcule.operator1 + " " + calcule.operator + " " + calcule.operator2 + " = " + calcule.calculator(calcule.operator1, calcule.operator2));
    }
}
