import model.Aluno;
import model.Turma;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Aluno a1 = new Aluno();
        a1.setNome("Joao");
        a1.setNota1(10.0);
        a1.setNota2(8.0);
        a1.setNota3(6.0);

        Aluno a2 = new Aluno();
        a2.setNome("Maria");
        a2.setNota1(10.0);
        a2.setNota2(7.0);
        a2.setNota3(9.0);

        Aluno a3 = new Aluno();
        a3.setNome("Jose");
        a3.setNota1(2.0);
        a3.setNota2(4.0);
        a3.setNota3(1.0);

        var turma = new Turma();
        turma.setNome("Turma A");
        turma.alunos = new ArrayList<Aluno>();
        turma.alunos.add(a1);
        turma.alunos.add(a2);
        turma.alunos.add(a3);
        turma.percorrerLista();

        System.out.println("---------------");
        System.out.println(" ");
        System.out.println("---------------");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);


        System.out.println("---------------");
        System.out.println(" ");
        System.out.println("---------------");

        turma.calcularMediaDeTurma();


    }
}