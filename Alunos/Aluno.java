package Alunos;

public class Aluno {

    //atributos
    private String nome, curso;
    private int periodo, idade;
    private float media;
    private double nota1, nota2;

    //metodos
    void setMedia(double nota1, double nota2){
        media = (float)((nota1 + nota2)/2);
    }

    //gets e sets de todos os atributos.
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getPeriodo() {
        return periodo;
    }
    public void setPeriodo(int periodo) {
        if(periodo>0 && periodo<12){
            this.periodo = periodo;
        }else{
            System.out.println("Período inválido e não cadastrado.");
        }
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if(idade>0 && idade<130){
            this.idade = idade;
        }else{
            System.out.println("Idade inválida e não cadastrada.");
        }
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota) {
        if(nota>0.0 && nota<10.0){
            nota1 = nota;
        }else{
            System.out.println("Nota inválida e não cadastrada.");
        }
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota) {
        if(nota>0.0 && nota<10.0){
            nota2 = nota;
        }else{
            System.out.println("Nota inválida e não cadastrada.");
        }
    }
    public float getMedia() {
        return media;
    }
}