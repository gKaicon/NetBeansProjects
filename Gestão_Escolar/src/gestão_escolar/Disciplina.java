package gestão_escolar;



/**
 *
 * @author User
 */
public class Disciplina {

    private int idDisciplina;
    private String descricao;
    

    public Disciplina(int idDisciplina, String descricao) {
        
        this.idDisciplina = idDisciplina;
        this.descricao = descricao;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descrição) {
        this.descricao = descrição;
    }
    

    @Override
    public String toString() {
        String disciplina = "\tDisciplina:" + "\n\t\tidDisciplina:\t" + idDisciplina + "\n\t\tDescrição:\t" + descricao ;
        return disciplina;
    }

}
