
package Numero2;

import java.util.ArrayList;

/**
 *
 * @author Neusa
 */
public class Turma {

    private ArrayList<Aluno> ListaAlunos;

    public Turma() {
        ListaAlunos = new ArrayList<>();
    }

    public void addAluno(Aluno novo) {
        ListaAlunos.add(novo);
    }

    public double getMediaTurma() {
        double notas=0;
        for (Aluno aluno : ListaAlunos) {
            notas+=aluno.getNotaMedia();
        }
        return notas/ListaAlunos.size();
    }


    public void listaAlunosMaiorMedia() {
        double notaMediaTurma = this.getMediaTurma();
        for (Aluno aluno : ListaAlunos) {
            if (aluno.getNotaMedia() > notaMediaTurma) {
                System.out.println(aluno.getNome());
            }

        }

    }

}
