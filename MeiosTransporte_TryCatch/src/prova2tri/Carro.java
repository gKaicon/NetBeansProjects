package prova2tri;

/**
 *
 * @author KAICON
 */
public class Carro extends MeioDeTransporte {

    private int num_portas;
    private double potencia_motor;
    private double distancia;
    private double litros;

    public Carro(String nome, String marca, String modelo, String cor, int num_machas, int num_rodas, int num_portas, double potencia_motor, double velocidade, double litros) {
        super(nome, marca, modelo, cor, num_machas, num_rodas, velocidade);
        this.num_portas = num_portas;
        this.potencia_motor = potencia_motor;
        this.litros = litros;
    }

    public double getPotencia_motor() {
        return potencia_motor;
    }

    public void setPotencia_motor(double potencia_motor) {
        this.potencia_motor = potencia_motor;
    }

    public int getNum_portas() {
        return num_portas;
    }

    public void setNum_portas(int num_portas) {
        this.num_portas = num_portas;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double CalculaConsumo() {

        try {
            double consumo = this.getDistancia() / this.getLitros();
        } catch (ArithmeticException c) {
            System.out.println("Exceção aritimetica");
        }
        double vans = this.getDistancia() / this.getLitros();
        return vans;

    }

    @Override
    public String toString() {
        double f = 0;
        String dados;
        dados = super.toString()
                + "\tNúmero de portas:\t" + num_portas + "\n"
                + "\tPotência do motor:\t" + potencia_motor + " W" + "\n";
        return dados;
    }

}
