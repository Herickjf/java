package Abbreviating;

public class Main {
    public static void main(String[] args) {
        Abbreviate name = new Abbreviate();
        name.setName();
        System.out.println("\n\nYour abbreviating is:\n\t" + name.generateAbbreviation(name.nome));
    }
}
