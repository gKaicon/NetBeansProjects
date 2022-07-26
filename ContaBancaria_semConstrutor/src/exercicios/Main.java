package exercicios;

/**
 *
 * @author Neusa
 */
public class Main {

    /**
     * @paraxercicio2m args the command line arguments
     */
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.titular = "Hugo";
        c1.numero = "123";
        c1.agencia = "45678-9";
        c1.saldo = 50.0;
        c1.dataDeAbertura = "04/06/2015";
        c1.deposita(100.0);
        System.out.println(c1.recuperaDadosParaImpressao());

        System.out.println("\n");

        Conta c2 = new Conta();
        c2.titular = "Kaicon";
        c2.numero = "210";
        c2.agencia = "8562-x";
        c2.saldo = 110.0;
        c2.dataDeAbertura = "21/03/2020";
        c2.deposita(70.0);
        System.out.println(c2.recuperaDadosParaImpressao());

        if (c1 == c2) {
            System.out.println("\nElas são iguais");
        } else {
            System.out.println("\nElas são diferentes");
        }

        // TODO code application logic here
    }

}
