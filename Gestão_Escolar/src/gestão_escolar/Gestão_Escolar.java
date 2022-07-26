package gestão_escolar;

/**
 *
 * @author User
 */
public class Gestão_Escolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Cursos
        Curso c1 = new Curso(0001, "Informática");
        
        //Disciplinas
        Disciplina d1 = new Disciplina(8623, "Linguagem de Programação II");
        Disciplina d2 = new Disciplina(8656, "Banco de dados I");
        
        //Professor
        Professor p1 = new Professor("Italo Magno", "652.355.873-21", "+55 31 95685 3246");
        Professor p2 = new Professor("Daylão", "796.352.843-11", "+55 33 98885 2636");
        
        //Alunos
        Aluno a1 = new Aluno("Káicon", "Rua X");
        Aluno a2 = new Aluno("Weslei", "Rua Y");
        Aluno a3 = new Aluno("Ana", "Rua Z");
        Aluno a4 = new Aluno("Marina", "Rua W");
        Aluno a5 = new Aluno("Bianca", "Rua F");
        
        
        c1.addDisciplina(d1);
        c1.addDisciplina(d2);
        
        p1.addDisciplina(d1);
        p2.addDisciplina(d2);
        
        c1.addAluno(a1);
        c1.addAluno(a2);
        c1.addAluno(a3);
        c1.addAluno(a4);
        c1.addAluno(a5);
       
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        c1.ListarAluno();
        
        
        
        System.out.println("Todas as disciplinas\n");
        
        c1.ListarDisciplina();
        
        System.out.println("Todas as disciplinas depois da pesquisa e remoção\n");
        c1.pesquisDisciplina("Banco de Dados I");
        c1.ListarDisciplina();
    }

}
