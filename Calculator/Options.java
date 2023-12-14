
public class Options {
    int operator1, operator2;
    char operation;

    public double calculator(int a, int b){
        switch(operation){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            default:
                System.out.println("This operation isn't valid.");
        }
    }
}
