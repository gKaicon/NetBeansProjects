package exercicios;


        
/**
 *
 * @author Neusa
 */
public class Conta {
    private static int Quantidade=0;

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    private String titular;
    private String numero;
    private String agencia;
    private String dataDeAbertura;
    private double saldo;
    protected String gerente;
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(String dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public static int getQuantidade() {
        return Quantidade;
    }
   
    public static void setQuantidade(int quantidade) {
        Conta.Quantidade = quantidade;
    }

    public String getGerente() {
        return gerente;
    }


    public void saca(double valor) {

        this.saldo = saldo - valor;

    }

    public void deposita(double valor) {
        this.saldo = saldo + valor;

    }

    public double calculaRendimento() {

        return saldo * 0.1;
    }

    String recuperaDadosParaImpressao() {

        String dados;
        dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nData de abertura: " + this.dataDeAbertura;
        dados += "\nSaldo autal: R$" + this.saldo;
        dados += "\nRedimento mensal: R$" + this.calculaRendimento();

        return dados;
    }

    

}
