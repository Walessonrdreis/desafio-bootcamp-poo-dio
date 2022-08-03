package br.com.desafio;

import br.com.desafio.dominio.*;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        Curso curso1 = new Curso();
        curso1.setTitulo("ReactJs");
        curso1.setDescricao("Curso ReactJs");
        curso1.setCargaHoraria(16);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Javascript");
        curso2.setDescricao("Curso JavaScript");
        curso2.setCargaHoraria(8);
        System.out.println(curso2);


        Curso curso3 = new Curso();
        curso3.setTitulo("HTML");
        curso3.setDescricao("Curso HTML/CSS");
        curso3.setCargaHoraria(4);


        Curso curso4 = new Curso();
        curso4.setTitulo("Java");
        curso4.setDescricao("Curso Java básico ");
        curso4.setCargaHoraria(8);


        Curso curso5 = new Curso();
        curso5.setTitulo("Spring framework");
        curso5.setDescricao("Curso Tudo sobre Spring framework");
        curso5.setCargaHoraria(8);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição: Mentoria sobre Java na visão de um profissional com mais de 10 anos de experiência");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria Backend");
        mentoria2.setDescricao("Descrição: Mentoria sobre Backend, tudo sobre a carreira ");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Fullstack");
        bootcamp.setDescricao("Descrição Bootcamp fullstack");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(curso4);
        bootcamp.getConteudos().add(curso5);

        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(mentoria2);

        Dev devWalesson = new Dev();
        devWalesson.setNome("Walesson ReisBA");
        devWalesson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devWalesson.getConteudosInscritos());
        devWalesson.progredir();
        devWalesson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devWalesson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devWalesson.getConteudosConcluidos());
        System.out.println("XP:" + devWalesson.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());





       // Conteudo conteudo = new Curso(); posso insatanciar um objeto Curso atraves da classe conteudo porque ela é
        // classe mãe
    }
}
