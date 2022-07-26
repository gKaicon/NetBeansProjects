
package br.edu.ifmg.meiostransporte.dominio;

/**
 *
 * @author Kaicon
 */
public class Carro extends Automovel {

    private int portas;

    public Carro(String marca, String modelo, int roda, double potenciaDoMotor, int portas) {
        super(marca, modelo, roda, potenciaDoMotor);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        String info = super.toString() + "\n"
                + "Número de Portas: " + this.portas;
        return info;
    }
}
