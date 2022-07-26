package gestaoempresasrial;
/**
 *
 * @author Antonio
 */
public class Projeto {

    private int codProjeto;
    private String nome;
   
    public Projeto(int codProjeto, String nome) {
        this.codProjeto = codProjeto;
        this.nome = nome;
    }

    public int getCodProjeto() {
        return codProjeto;
    }

    public void setCodProjeto(int codProjeto) {
        this.codProjeto = codProjeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}