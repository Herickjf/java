package Alunos;
import java.util.Scanner;

public class CadrastroAluno {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        System.out.println("Insira o nome do aluno 1: ");
        aluno1.setNome(input.nextLine());
        System.out.println("Insira o curso do aluno 1: ");
        aluno1.setCurso(input.nextLine());
        System.out.println("Insira o período letivo do aluno 1(ex: 3): ");
        aluno1.setPeriodo(input.nextInt());
        System.out.println("Insira a idade do aluno 1: ");
        aluno1.setIdade(input.nextInt());
        System.out.println("Insira a 1ª nota do aluno 1: ");
        aluno1.setNota1(input.nextDouble());
        System.out.println("Insira a 2ª nota do aluno 1: ");
        aluno1.setNota2(input.nextDouble());
        aluno1.setMedia(aluno1.getNota1(), aluno1.getNota2());

        System.out.println("\n\nDados cadastrais do aluno 1:");
        System.out.println("\tNome: " + aluno1.getNome());
        System.out.println("\tCurso: " + aluno1.getCurso() + ", período " + aluno1.getPeriodo());
        System.out.println("\tIdade: " + aluno1.getIdade());
        System.out.println("\tNotas: \n\t\t1ª: " + aluno1.getNota1() + "\n\t\t2ª: " + aluno1.getNota2());
        System.out.println("\tMédia: " + aluno1.getMedia());
        if (aluno1.getMedia()>=7.0){
            System.out.println("\nSituação: Aprovado!!");
        }
        else{
            System.out.println("\nSituação: Reprovado.");

        }

    }
}

