package br.com.dio.desafio;

import java.time.LocalDate;
import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso1);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.calcularTotalXP();
        System.out.println("---");
        System.out.println("Conteudos inscritos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluídos de " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXP());

        System.out.println("----------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        dev2.calcularTotalXP();
        System.out.println("---");
        System.out.println("Conteudos inscritos de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluídos de " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXP());
    }
}