package login;
public class NameToLogin {
    public static void main(String[] args) {
        Functions name = new Functions(System.in);
        System.out.println("Type your name to generate your login");
        name.setName();
        System.out.println("\n\nYour login is:\n\t" + name.generatelogin(name.nome));
    }
}