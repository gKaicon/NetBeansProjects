/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inst_banc;

/**
 *
 * @author JOSLAINE
 */
public class Conta_banc {

    private String numero_do_cartao;

    public String getNumero_do_cartao() {
        return numero_do_cartao;
    }

    public void setNumero_do_cartao(String numero_do_cartao) {
        this.numero_do_cartao = numero_do_cartao;
    }
    private String numero_da_agencia;

    public String getNumero_da_agencia() {
        return numero_da_agencia;
    }

    public void setNumero_da_agencia(String numero_da_agencia) {
        this.numero_da_agencia = numero_da_agencia;
    }
    private String deposito;

    public String getDeposito() {
        return deposito;
    }

    public void setDeposito(String deposito) {
        this.deposito = deposito;
    }
    private String saque;

    public String getSaque() {
        return saque;
    }

    public void setSaque(String saque) {
        this.saque = saque;
    }

}
