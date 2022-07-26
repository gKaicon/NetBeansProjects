package gestão_escolar;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Curso {

    private int codCurso;
    private String nome;
    ArrayList<Aluno> ListaAlunos;
    ArrayList<Disciplina> ListaDisciplina;

    public Curso(int codCurso, String nome) {
        ListaAlunos = new ArrayList<>();
        ListaDisciplina = new ArrayList<>();
        this.codCurso = codCurso;
        this.nome = nome;

    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addAluno(Aluno e) {
        ListaAlunos.add(e);
    }

    public Aluno pesquisaAluno(String nome) {
        for (Aluno pesquisado : ListaAlunos) {
            if (pesquisado.getNome().equals(nome)) {
                return pesquisado;
            }
        }
        return null;
    }

    public void addDisciplina(Disciplina e) {
        ListaDisciplina.add(e);
    }

    public Disciplina pesquisDisciplina(String nome) {
        for (Disciplina pesquisada : ListaDisciplina) {
            if (pesquisada.getDescricao().equals(nome)) {
                return pesquisada;
            }
        }
        return null;
    }
   

    

    public void ListarAluno() {

        ListaAlunos.forEach((listar) -> {
            System.out.println(listar.toString());
        });
    }

    public void ListarDisciplina() {

        ListaDisciplina.forEach((listar) -> {
            System.out.println(listar.toString());
        });
    }

}
