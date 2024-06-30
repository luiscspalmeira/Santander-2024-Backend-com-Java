import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("curso de Java");
        curso1.setCargaHoraria(14);

        Curso curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("curso de java script");
        curso2.setCargaHoraria(20);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria do Java");
        mentoria1.setDescricao("descricao mentoria do java");
        mentoria1.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
