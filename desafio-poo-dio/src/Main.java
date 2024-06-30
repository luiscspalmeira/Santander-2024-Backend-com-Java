import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLuis = new Dev();
        devLuis.setNome("Luis");
        devLuis.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devLuis.getConteudosInscritos());
        devLuis.progredir();
        devLuis.progredir();
        System.out.println("Conteúdos inscritos" + devLuis.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" + devLuis.getConteudosConcluidos());
        System.out.println("xp" + devLuis.calcularTotalXp());

        System.out.println("--------------------------------------------------------");

        Dev devClaudio = new Dev();
        devClaudio.setNome("Claudio");
        devClaudio.increverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devClaudio.getConteudosInscritos());
        devClaudio.progredir();
        System.out.println("Conteúdos inscritos" + devClaudio.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" + devClaudio.getConteudosConcluidos());
        System.out.println("xp" + devClaudio.calcularTotalXp());
    }
}
