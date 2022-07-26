package Numero2;

/**
 *
 * @author Neusa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno a1 = new Aluno("Mario", "988783603", "Garcia", "Marcia", 400, 600, 400, 600, 500);
        Aluno a2 = new Aluno("Marya", "988936433", "marcelo", "Josimay", 500, 700, 500, 700, 600);
        Aluno a3 = new Aluno("Marcos", "973783303", "João", "Abigail", 500, 700, 500, 700, 600);
        System.out.println("Notas Médias:\n");
        System.out.println(a1.getNome()+":"+a1.getNotaMedia());
        System.out.println(a2.getNome()+":"+a2.getNotaMedia());
        System.out.println(a3.getNome()+":"+a3.getNotaMedia());
        
        Turma t1=new Turma();
        t1.addAluno(a1);
        t1.addAluno(a2);
        t1.addAluno(a3);
        System.out.println("\nNotas Médias dos alunos acima:");
        System.out.println("\t"+Aluno.getNotas()/Aluno.getQuantidadeAlunos());
        System.out.println("\nAlunos com a maior média:");
        t1.listaAlunosMaiorMedia();
        
    }

}
