package prova2tri;

/**
 *
 * @author KAICON
 */
public class MeioDeTransporte {

    private String nome;
    private String marca;
    private String modelo;
    private String cor;
    private int num_marchas;
    private int num_rodas;
    private double velocidade;

    public MeioDeTransporte(String nome, String marca, String modelo, String cor, int num_marchas, int num_rodas, double velocidade) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.num_marchas = num_marchas;
        this.num_rodas = num_rodas;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNum_marchas() {
        return num_marchas;
    }

    public void setNum_marchas(int num_marchas) {
        this.num_marchas = num_marchas;
    }

    public int getNum_rodas() {
        return num_rodas;
    }

    public void setNum_rodas(int num_rodas) {
        this.num_rodas = num_rodas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double acelerar(double Valor) {

        if (Valor < 0) {
            return 0;
        } else {
            return this.velocidade += Valor;
        }

    }

    public double freiar(double Valor) {

        if ((Valor - this.velocidade ) < 0) {
            double valor;
            valor = 0;
            return valor;
        } else {
            double valor;
            valor = this.velocidade -= Valor;
            return valor;
        }

    }

    @Override
    public String toString() {
        String dados;
        dados = "Meio de Transporte: \n" + "\tNome:\t" + nome + "\n"
                + "\tMarca:\t" + marca + "\n" + "\tModelo:\t" + modelo + "\n" + "\tCor:\t" + cor + "\n"
                + "\tNúmero de marchas:\t" + num_marchas + "\n" + "\tNúmero de rodas:\t" + num_rodas + "\n"
                + "\tAtual Velocidade:\t" + velocidade + " km/h" + "\n";
        return dados;
    }

}
