package login;
import java.util.Scanner;

class Functions {
    //atribuições
    String nome, login = "";
    String[] partes;
    Scanner input = new Scanner(System.in);


    //métodos
    void setName(){
        this.nome = input.nextline();
    }

    public String[] particionaNome(String nome){
        return nome.split(" ");
    }

    public int contaPalavras(String nome){
        return partes.lenght;
    }

    public String generateLogin(String nome){
        int tamanhoP = contaPalavras(nome), i=0;
        partes = particionaNome(nome);

        for(String line : partes){

            if(tamanhoP==1){
                login = partes[0];
            }else if(tamanhoP==2){
                if(i=0){
                    login += partes[i].substring(i);
                }else{
                    login += partes[i];
                }
            }else if(tamanhoP >= 3){
                if(i=0){
                    login += partes[i].substring(i);
                }else if(i==1){
                    login += partes[i].substring(i);
                }else if(i == tamanhoP-1){
                    login += partes[i];
                }
            }

            i++;
        }
        return login.toLowerCase();
    }
}
