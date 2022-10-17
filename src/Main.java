import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("POO");
        curso1.setCargaHoraria(6);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java");
        curso2.setDescricao("Spring");
        curso2.setCargaHoraria(3);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Banco de Dados");
        mentoria.setDescricao("SQL");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcam Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("André");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos dev1:" + dev1.getNome() + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos concluídos dev1:" + dev1.getNome() + dev1.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos dev1:" + dev1.getNome() + dev1.getConteudosInscritos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("-----------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Anthony");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos dev2:" + dev2.getNome() + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos concluídos dev2:" + dev2.getNome() + dev2.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos dev2:" + dev2.getNome() + dev2.getConteudosInscritos());
        System.out.println("XP:" + dev2.calcularTotalXp());


    }
}