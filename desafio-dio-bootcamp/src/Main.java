import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("curso java","curso de poo",8);


        Curso curso2 = new Curso("curso js", "curso front-end", 4);


        Mentoria mentoria = new Mentoria("mentoria de java", "aperfeicoamento");


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "bootcamp para backend");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosIncritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("==================");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        devCamila.calcularTotalXp();

        System.out.println("------------------");

        Dev devBreno = new Dev("Breno");

        devBreno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Breno:" + devBreno.getConteudosIncritos());
        devBreno.progredir();
        devBreno.progredir();
        System.out.println("==================");
        System.out.println("Conteúdos Inscritos Breno:" + devBreno.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos Breno:" + devBreno.getConteudosConcluidos());
        devBreno.calcularTotalXp();
        devBreno.progredir();
        System.out.println("==================");
        System.out.println("Conteúdos Inscritos Breno:" + devBreno.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos Breno:" + devBreno.getConteudosConcluidos());
        devBreno.calcularTotalXp();

    }

}