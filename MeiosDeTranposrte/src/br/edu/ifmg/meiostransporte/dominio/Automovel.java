
package br.edu.ifmg.meiostransporte.dominio;

/**
 *
 * @author Kaicon
 */
public class Automovel extends Veiculo{
    
private double potenciaDoMotor;

    public Automovel(String marca, String modelo, int roda, double potenciaDoMotor) {
        super(marca, modelo, roda);
        this.potenciaDoMotor = potenciaDoMotor;
    }

    public double getPotenciaDoMotor() {
        return potenciaDoMotor;
    }

    public void setPotenciaDoMotor(double potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }

    @Override
    public String toString() {
         String info = super.toString() + "\n"
                + "Potencia do motor: " + this.potenciaDoMotor+" Cilidradas";
        return info;
    }
    
}
