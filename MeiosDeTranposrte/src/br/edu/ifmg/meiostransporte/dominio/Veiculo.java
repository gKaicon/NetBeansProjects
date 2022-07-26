
package br.edu.ifmg.meiostransporte.dominio;

/**
 *
 * @author Kaicon
 */
public class Veiculo {

    private String marca;
    private String modelo;
    private int roda;
    private int velocidade;

    public Veiculo() {

    }

    public Veiculo(String marca, String modelo, int roda) {
        this.marca = marca;
        this.modelo = modelo;
        this.roda = roda;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRoda() {
        return roda;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(int Valor) {
        this.velocidade += Valor;
    }

    public int freiar(int Valor) {

        if (this.velocidade - Valor < 0) {
            return 0;
        } else {
            
        }

        return this.velocidade -= Valor;
    }

    @Override
    public String toString() {
        String info;
        info = "Marca:" + this.marca + "\nQuantidade de rodas:" + this.roda + "\nModelo:" + this.modelo + "\nVelocidade Atual:" + this.velocidade+" Km";

        return info;
    }

}
