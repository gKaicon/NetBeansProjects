package prova2tri;

/**
 *
 * @author KAICON
 */
public class Prova2Tri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Nome, Marca, modelo, cor, numero de marchas, numero de rodas, potencia do motor, velocidade, litros;
        Carro m = new Carro("C", "Fiat", "Siena", "Prata", 5, 4, 4, 39.2, 0, 50);
        System.out.println("Qual a distancia percorrida?");
        m.setDistancia(20);
        System.out.println(m.getDistancia());
        System.out.println(m.CalculaConsumo());
        m.acelerar(2);
        m.freiar(4);
        System.out.println(m);
    }

}

