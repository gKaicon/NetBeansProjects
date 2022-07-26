
package br.edu.ifmg.meiostransporte.dominio;

/**
 *
 * @author Kaicon
 */
public class Bicicleta extends Veiculo {

    private String numerodemarchas;
    private boolean bagageiro;

    public Bicicleta() {

    }

    public Bicicleta( String marca, int roda, String modelo,String numerodemarchas, boolean bagageiro) {
        super(marca, modelo, roda);
        this.numerodemarchas = numerodemarchas;
        this.bagageiro = bagageiro;
    }

    public String getNumerodemarchas() {
        return numerodemarchas;
    }

    public void setNumerodemarchas(String numerodemarchas) {
        this.numerodemarchas = numerodemarchas;
    }

    public boolean isBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

    @Override
    public String toString() {
        String info = super.toString() + "\n"
                + "Numero de marchas: " + this.numerodemarchas + 
                " \nBagageiro:" + (this.bagageiro ? "Possui" : "Não Possui");
        return info;
    }
}
