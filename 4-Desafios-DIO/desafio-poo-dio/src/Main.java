
import diodesafio.dominio.Bootcamp;
import diodesafio.dominio.Curso;
import diodesafio.dominio.Dev;
import diodesafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição do Curso de Javascript");
        curso2.setCargaHoraria(4);

        


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria sobre Java");
        mentoria.setData(LocalDate.now());



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCaroline = new Dev();
        devCaroline.setNome("Caroline");
        devCaroline.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos Inscristos Caroline" + devCaroline.getConteudosInscritos());
        devCaroline.progredir();
        System.out.println("-");
        System.out.println("Contéudos Inscristos Caroline:" + devCaroline.getConteudosInscritos());
        System.out.println("Contéudos Concluídos Caroline:" + devCaroline.getConteudosConcluidos());
        System.out.println("XP:" + devCaroline.calcularTotalXp());
        
        System.out.println("~~~~~~~~~~~~~~~~");

        Dev devVictor = new Dev();
        devVictor.setNome("Victor");
        devVictor.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos Inscristos Victor:" + devVictor.getConteudosInscritos());
        devVictor.progredir();
        devVictor.progredir();
        devVictor.progredir();
        System.out.println("-");
        System.out.println("Contéudos Inscristos Victor:" + devCaroline.getConteudosInscritos());
        System.out.println("Contéudos Concluídos Victor:" + devVictor.getConteudosConcluidos());
        System.out.println("XP:" + devVictor.calcularTotalXp());

    }
    
}
