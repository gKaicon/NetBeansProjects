package gestão_escolar;

import java.util.ArrayList;
import gestão_escolar.Disciplina;

/**
 *
 * @author User
 */
public class Professor {

    String nome;
    String CPF;
    String telefone;
    ArrayList<Disciplina> AtribuirDisciplina;
    String Disiciplina;

    public Professor(String nome, String CPF, String telefone) {
        AtribuirDisciplina = new ArrayList<>();
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
    }

    public void addDisciplina(Disciplina e) {
        AtribuirDisciplina.add(e);
    }

    public void AtribuirDisciplina() {

        AtribuirDisciplina.forEach((listar) -> {
            System.out.println(listar.toString());
        });
    }

    @Override
    public String toString() {
        
        
        
        String professor = "Professor:" + "\n\tNome:\t" + nome + "\n\tCPF:\t" + CPF + "\n\tTelefone:\t" + telefone;
        
        professor+="\n";
         

        for (Disciplina atri : AtribuirDisciplina) {
            return professor += atri;
        }

        return professor;
    }

}
