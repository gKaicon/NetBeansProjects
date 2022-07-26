package pacoteTeste;
/**
 *
 * @author Neusa
 */
public class Main {

    /**
     * @paraxercicio2m args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();
       cc1.alteraGerente("João");
        System.out.println(cc1.Dados());
    }

}
