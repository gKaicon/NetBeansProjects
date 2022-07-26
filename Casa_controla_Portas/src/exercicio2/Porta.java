/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author 0048609
 */
public class Porta {
//    Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ
//Métodos: void abre()
//void fecha()
//void pinta(String s)
//boolean estaAberta()

    private String cor;
    public boolean aberta;
    private int dimensaoX;
    private int dimensaoY;
    private int dimensaoZ;

    public void abre() {
        this.aberta = true;
    }

    public void fecha() {
        this.aberta = false;
    }

    public void pinta(String s) {
        this.cor = s;
    }

    public boolean estaAberta() {
        if (this.aberta == true) {
            System.out.println("A porta esta aberta");
            return true;
        } else {
            System.out.println("A porta ta fechada");
            return false;
        }
    }

    public int getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(int dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public int getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(int dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public int getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(int dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

}
