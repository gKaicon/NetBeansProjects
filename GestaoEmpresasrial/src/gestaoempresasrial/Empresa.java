package gestaoempresasrial;
import java.util.ArrayList;
/**
 *
 * @author Antonio
 */
public class Empresa {

    ArrayList<Empregado> ListaEmpregados;
    ArrayList<Departamento> ListaDepartamento;

    public Empresa() {
        ListaEmpregados = new ArrayList<>();
        ListaDepartamento = new ArrayList<>();
    }

    public void addEmpregado(Empregado x) {
        ListaEmpregados.add(x);
    }

    public Empregado pesquisaEmpregado(String nome) {
        for (Empregado pesquisar : ListaEmpregados) {
            if (pesquisar.getNome().equals(nome)) {
                return pesquisar;
            }
        }
        return null;
    }

    public void addDepartamento(Departamento x) {
        ListaDepartamento.add(x);
    }

    public Departamento pesquisDepartamento(String nome) {
        for (Departamento pesquisar : ListaDepartamento) {
            if (pesquisar.getGerente().equals(nome)) {
                return pesquisar;
            }
        }
        return null;
    }

    public void ListaEmpregados() {
        for (Empregado ListaEmpregados : this.ListaEmpregados) {
            System.out.println(ListaEmpregados.toString());
        }
    }

    public void ListaDepartamento() {
        for (Departamento ListaDepartamento : ListaDepartamento) {
            System.out.println(ListaDepartamento.toString());
        }
    }
}
