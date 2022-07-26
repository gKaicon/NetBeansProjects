package gestaoempresasrial;

/**
 *
 * @author Antonio
 */
public class Departamento {

    private int idDepartamento;
    private String nomeD;
    private String gerente;
    private String inicio;

    public Departamento(String nomeD ,int idDepartamento, String gerente) {

        this.idDepartamento = idDepartamento;
        this.nomeD = nomeD;
        this.gerente = gerente;
        this.inicio = inicio;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getNomeD() {
        return nomeD;
    }

    public void setNomeD(String nomeD) {
        this.nomeD = nomeD;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    @Override
    public String toString() {
        String departamento = "Departamento:" + nomeD + "\nidDepartamento:" + idDepartamento + "\nGerente:" + gerente + "\nGerente desde:" + inicio;
        return departamento;
    }
}
