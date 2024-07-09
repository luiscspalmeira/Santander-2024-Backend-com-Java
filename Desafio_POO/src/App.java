import java.time.LocalDate;

import br.com.desafio.dominio.BootCamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) {

        Curso curso1 = new Curso();        
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao de curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao de curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descricao de mentoria de Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descricao de bootcamp Java Developer");
        bootCamp.getConteudo().add(curso1);
        bootCamp.getConteudo().add(curso2);
        bootCamp.getConteudo().add(mentoria1);

        Dev luis = new Dev();
        luis.setNome("Luis");
        luis.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos"+luis.getConteudosInscritos());
        System.out.println("-");
        luis.progredir();
        luis.progredir();
        System.out.println("Conteúdos Inscritos"+luis.getConteudosInscritos());
        System.out.println("Conteúdos concluidos"+luis.getConteudosConcluidos());
        System.out.println("XP"+luis.calcularTotalXp());

        System.out.println("-----------------------");

        Dev claudio = new Dev();
        claudio.setNome("Claudio");
        claudio.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos"+claudio.getConteudosInscritos());
        System.out.println("-");
        claudio.progredir();
        System.out.println("Conteúdos Inscritos"+claudio.getConteudosInscritos());
        System.out.println("Conteúdos concluidos"+claudio.getConteudosConcluidos());
        System.out.println("XP"+claudio.calcularTotalXp());


    }
}
