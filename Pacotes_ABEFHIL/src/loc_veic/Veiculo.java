/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loc_veic;

/**
 *
 * @author 0048609
 */
public class Veiculo {

    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    private String machas;

    public String getMachas() {
        return machas;
    }

    public void setMachas(String machas) {
        this.machas = machas;
    }
    private String num_rodas;

    public String getNum_rodas() {
        return num_rodas;
    }

    public void setNum_rodas(String num_rodas) {
        this.num_rodas = num_rodas;
    }

    public Veiculo(String marca, String modelo, String machas, String num_rodas) {
        this.marca = marca;
        this.modelo = modelo;
        this.machas = machas;
        this.num_rodas = num_rodas;
    }

}
