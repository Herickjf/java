package ConjDados;
import java.util.Scanner;

public class Dados {
    static Scanner input = new Scanner(System.in);
    static class Pessoa{
        double[] altura = new double[ 10 ];
        char[] sexo = new char[10];
    }
    static Pessoa pessoas = new Pessoa();

    public static void main(String[] args) {
        String a;
        // Recebendo dados
        for(int i=0; i<10; i++){
            System.out.println("Digite a altura da pessoa "+i);
            pessoas.altura[i] = input.nextDouble();
            System.out.println("Digite a sexo (m/f) da pessoa "+i);
            a = input.next();
            pessoas.sexo[i] = a.charAt(0);
        }
        float media = 0;
        int mc=0, fc=0;
        double ma = pessoas.altura[0], me = pessoas.altura[0];
        for(int i = 0; i<10; i++){
            ma = Math.max(ma, pessoas.altura[i]);
            me = Math.min(me, pessoas.altura[i]);

            if(pessoas.sexo[i] == 'm'){
                media += pessoas.altura[i];
                mc++;
            }
            if(pessoas.sexo[i] == 'f') fc++;
        }
        System.out.println("a.1:  Maior altura: "+ma+"\na.2 Menor altura: "
                +me+"\nb. Média da altura dos homens: "+media/mc+
                "\nc. Número de mulheres: "+fc);
    }

}
