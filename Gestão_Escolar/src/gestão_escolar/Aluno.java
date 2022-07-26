package gestão_escolar;

/**
 *
 * @author User
 */
public class Aluno {

    private int idMatricula = 0;
    private String nome;
    private String endereco;
    private static int id;

    public Aluno(String nome, String endereco) {
        this();
        this.nome = nome;
        this.endereco = endereco;
    }

    public Aluno() {
        Aluno.id++;
        this.idMatricula = Aluno.id;
    }

    public int getIdAluno() {
        return idMatricula;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {

        String aluno = "Aluno \n" + "\tMatricula: \t" + idMatricula + "\n\tNome:\t" + nome + "\n\tEndereço:\t" + endereco;
        return aluno;
    }

}