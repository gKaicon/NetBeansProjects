/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import exercicio2.Porta;

/**
 *
 * @author JOSLAINE
 */
public class Casa {
//Atributos: cor, porta1, porta2, porta3
//Método: void pinta(String s),
//int quantasPortasEstaoAbertas()

    public String cor;
    public Porta porta1;
    public Porta porta2;
    public Porta porta3;

    public void pinta(String s) {
        this.cor = s;
    }

    public int quantasPortasEstaoAbertas() {
        int qtd = 0;
        if (porta1.aberta == true) {
            qtd += 1;
        }
        if (porta2.aberta == true) {
            qtd += 1;
        }
        if (porta3.aberta == true) {
            qtd += 1;
        } else {
            
        }
        return qtd;
    }
}
