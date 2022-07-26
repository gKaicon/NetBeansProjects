package gestaoempresasrial;
/**
 *
 * @author Antonio
 */
public class Empregado {

    private String nome;
    private static double salario = 1045.00;
    private String escolaridade;
    private String cargo;

    public Empregado(String nome, String cargo) {
        this();
        this.nome = nome;
        this.cargo = cargo;
    }

    public Empregado() {
        this.salario = Empregado.salario;
    }

    public double getSalarioEmpregado() {
        return Empregado.salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    @Override
    public String toString() {

        String empregado = "Empregado \n" + "\nNome:" + nome + "Salario: " + salario + "\nEscolaridade:" + escolaridade;
        return empregado;
    }
}
