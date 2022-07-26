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
        Conta c0 = new Conta();
        Conta c1 = new Conta();
        c1.setQuantidade(c1.getQuantidade()+1);
        c1.setTitular("Hugo");
        c1.setNumero("123");
        c1.setAgencia("45678-9");
        c1.setDataDeAbertura("04/06/2015");
        c1.setSaldo(50.0);
        c1.deposita(100.0);
        c1.gerente="Márcio";
        
        System.out.println(c1.recuperaDadosParaImpressao());
        System.out.println("O codigo hashcode: "+c1.hashCode());
        System.out.println("\n");

        Conta c2 = new Conta();
        c2.setQuantidade(c2.getQuantidade()+1);
        c2.setTitular("Kaicon");
        c2.setNumero("210");
        c2.setAgencia("8562-x");
        c2.setSaldo(110.0);
        c2.setDataDeAbertura("21/03/2020");
        c2.deposita(70.0);
        
                
        System.out.println(c2.recuperaDadosParaImpressao());
        System.out.println("O codigo hashcode: "+c2.hashCode());
       
        System.out.println("\nO número de contas é:"+c0.getQuantidade());
        // TODO code application logic here
    }

}
