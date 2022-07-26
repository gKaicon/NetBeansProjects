package gestaoempresasrial;
/**
 *
 * @author Antonio
 */
public class Gestão_Empresarial {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO codeapplicationlogichere
        Empresa a1 = new Empresa();
        Departamento d1 = new Departamento("Administração", 0707, "Ítalo");
        Empregado e1 = new Empregado("Ítalo", "12/02/2016");
        Empregado e2 = new Empregado("Antônio","31/01/2004");
        a1.addDepartamento(d1);
        a1.addEmpregado(e1);
        a1.addEmpregado(e2);
        a1.ListaEmpregados();
        a1.ListaDepartamento();
    }
}
