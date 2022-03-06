import java.time.LocalDate;

import package1.Bootcamp;
import package1.Cursos;
import package1.Dev;
import package1.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {

        Cursos java =  new Cursos();
        java.setTitulo("Java");
        java.setDescricao("Curos de java para iniciantes");
        java.setCargahoraria(5);

        Cursos php =  new Cursos();
        php.setTitulo("PHP");
        php.setDescricao("Cuso de PHP para iniciantes");
        php.setCargahoraria(5);

        Cursos javascript =  new Cursos();
        javascript.setTitulo("JavaScript");
        javascript.setDescricao("Curos de JavaScript voltado para dev web");
        javascript.setCargahoraria(5);

        Cursos ruby =  new Cursos();
        ruby.setTitulo("Ruby");
        ruby.setDescricao("Curso de java para iniciantes");
        ruby.setCargahoraria(5);

        Cursos postgresql =  new Cursos();
        postgresql.setTitulo("PostgreSQL");
        postgresql.setDescricao("Curso de PostgreSQL para gerenciamento de banco de dados");
        postgresql.setCargahoraria(5);

        Mentoria linux = new Mentoria();
        linux.setTitulo("Linux");
        linux.setDescricao("Mentoria de especializacao em linux");
        linux.setData(LocalDate.now());

        Mentoria redes = new Mentoria();
        redes.setTitulo("Redes");
        redes.setDescricao("Mentoria relacionada a redes!");
        redes.setData(LocalDate.now());

        Bootcamp bootcamp_DBA = new Bootcamp();
        bootcamp_DBA.setNome("Bootcamp DBA");
        bootcamp_DBA.setDescricao("Bootcamp voltado para devs que querem se especializar em DBA");
        bootcamp_DBA.getConteudos().add(linux);
        bootcamp_DBA.getConteudos().add(redes);
        bootcamp_DBA.getConteudos().add(postgresql);

        Bootcamp bootcamp_web = new Bootcamp();
        bootcamp_web.setNome("Bootcamp DBA");
        bootcamp_web.setDescricao("Bootcamp voltado para devs que querem se especializar em desenvolvimento web");
        bootcamp_web.getConteudos().add(ruby);
        bootcamp_web.getConteudos().add(javascript);
        bootcamp_web.getConteudos().add(php);

        Bootcamp bootcamp_redes = new Bootcamp();
        bootcamp_redes.setNome("Bootcamp DBA");
        bootcamp_redes.setDescricao("Bootcamp voltado para devs que querem se especializar em analise de redes");
        bootcamp_redes.getConteudos().add(java);
        bootcamp_redes.getConteudos().add(redes);
        bootcamp_redes.getConteudos().add(php);

        System.out.println("==============================");

        Dev Jessica = new Dev();
        Jessica.setNome("Jessica");
        System.out.println(Jessica.getNome());
        Jessica.InscreverBootcamp(bootcamp_redes);
        Jessica.Progredir();
        System.out.println("CURSOS INSCRITOS: ");
        System.out.println(Jessica.getConteudoInscritos());
        System.out.println("CURSOS CONCLUIDOS: ");
        System.out.println(Jessica.getConteudoConcluido());
        System.out.println("XP: "+Jessica.calculodXP());

        System.out.println("==============================");

        Dev Leandro = new Dev();
        Leandro.setNome("Leandro");
        System.out.println(Leandro.getNome());
        Leandro.InscreverBootcamp(bootcamp_DBA);
        Leandro.Progredir();
        Leandro.Progredir();
        System.out.println("CURSOS INSCRITOS: ");
        System.out.println(Leandro.getConteudoInscritos());
        System.out.println("CURSOS CONCLUIDOS: ");
        System.out.println(Leandro.getConteudoConcluido());
        System.out.println("XP: "+Leandro.calculodXP());

        System.out.println("==============================");

        Dev Paloma = new Dev();
        Paloma.setNome("Paloma");
        System.out.println(Paloma.getNome());
        Paloma.InscreverBootcamp(bootcamp_web);
        Paloma.Progredir();
        Paloma.Progredir();
        Paloma.Progredir();
        System.out.println("CURSOS INSCRITOS: ");
        System.out.println(Paloma.getConteudoInscritos());
        System.out.println("CURSOS CONCLUIDOS: ");
        System.out.println(Paloma.getConteudoConcluido());
        System.out.println("XP: "+Paloma.calculodXP());



    }
}
