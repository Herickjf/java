package login;
public class NameToLogin {
    public static void main(String[] args) {
        Functions name = new Functions();
        name.setName();
        System.out.println("\n\nYour login is:\n\t" + name.generateLogin(name.nome));
    }
}
