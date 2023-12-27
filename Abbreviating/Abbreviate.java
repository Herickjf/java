package Abbreviating;
import java.util.Scanner;

public class Abbreviate {
    
    //atribuições
    String nome, abb = "";
    String[] partes;
    Scanner input = new Scanner(System.in);

    //métodos
    void setName(){
        System.out.println("Type your name to generate your abbreviated name: ");
        this.nome = input.nextLine();
    }

    public String[] particionaNome(String nome){
        return nome.split(" ");
    }

    public int contaPalavras(String nome){
        return particionaNome(nome).length;
    }

    public String generateAbbreviation(String nome){
        int tamanhoP = contaPalavras(nome), i=0;
        partes = particionaNome(nome);

        for(String line : partes){

            if(tamanhoP==1){
                abb += partes[0];
            }else if(tamanhoP==2){
                abb += partes[i];
                if(i == tamanhoP-1){
                    return abb;
                }else {
                    abb+=" ";
                }
            }else if(tamanhoP >= 3){
                if(i==0){
                    abb += partes[i];
                    abb += " ";
                }else if(i == tamanhoP-1){
                    abb += partes[i];
                    return abb;
                }else {
                    abb += partes[i].toUpperCase().charAt(0);
                }

                if (i!=0){
                    abb+=". ";
                }
            }
            i++;
        }
        return abb;
    }
}
