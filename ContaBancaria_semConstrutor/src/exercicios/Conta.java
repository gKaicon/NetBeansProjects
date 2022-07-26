
package exercicios;

/**
 *
 * @author Neusa
 */
public class Conta {

    String titular;
    String numero;
    String agencia;
    String dataDeAbertura;

    double saldo;

    public void saca(double valor) {

        this.saldo = saldo - valor;
// o que fazer aqui dentro?pegar o saldo e subtrair a valor
    }

    public void deposita(double valor) {
        this.saldo = saldo + valor;
// o que fazer aqui dentro? pegar o saldo e somar a valor
    }

    public double calculaRendimento() {
// o que fazer aqui dentro? multiplicar o saldo existente por 0.1,
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
