package model;

import java.util.ArrayList;

public class Turma {

    private String nome;
    public ArrayList<Aluno> alunos;

    public Turma() {}

    public Turma(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void percorrerLista() {
        System.out.println("Lista de alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }

    public void calcularMediaDeTurma() {
        System.out.println("Media da turma:");

        double media = 0;
        for (Aluno aluno : alunos) {
            media += aluno.calculaMedia();
        }
        media /= alunos.size();
        System.out.println("Média da turma: " + media);

    }
}
