
package br.edu.ifmg.meiostransporte.dominio;

/**
 *
 * @author Kaicon
 */
public class Moto extends Automovel {

    private boolean partidaEletrica;

    public Moto( String marca, String modelo, int roda, double potenciaDoMotor, boolean partidaEletrica) {
        super(marca, modelo, roda, potenciaDoMotor);
        this.partidaEletrica = partidaEletrica;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public String toString() {
        String info = super.toString() + "\n"
                + "Partida Eletrica: " + (this.partidaEletrica?"Possui":"Não possui");
        return info;

    }

}
