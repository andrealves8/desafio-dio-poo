import br.com.dio.desafio.dominio.Curso;
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
    }
}