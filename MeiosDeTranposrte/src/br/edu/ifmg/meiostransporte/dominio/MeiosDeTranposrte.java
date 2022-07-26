package br.edu.ifmg.meiostransporte.dominio;

/**
 *
 * @author Kaicon
 */
public class MeiosDeTranposrte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Veiculo v1 = new Bicicleta("Marca", 2, "MTB", "21", true);
        v1.acelerar(100);
        System.out.println(v1);
        System.out.println("\n");

        Veiculo v2 = new Automovel("Fiat", "Uno", 4, 320);
        v2.acelerar(100);
        v2.acelerar(100);
        System.out.println(v2);
        System.out.println("\n");

        Veiculo v3 = new Moto("Yamaha", "M3", 2, 100, true);
        v3.acelerar(100);
        v3.acelerar(50);
        System.out.println(v3);
        System.out.println("\n");

        Veiculo v4 = new Carro("Audi", "A8", 4, 4, 500);
        v4.acelerar(100);
        v4.acelerar(80);
        v4.freiar(175);
        System.out.println(v4);
        System.out.println("\n");

        Veiculo v5 = new Moto("BMW", "xTitan", 2, 50, false);
        v5.acelerar(1000000);
        System.out.println(v5);
        System.out.println("\n");

        Veiculo v6 = new Carro("Volkswagem", "Gol", 4, 320, 4);
        v6.acelerar(251);
        v6.freiar(50);
        System.out.println(v6);
        System.out.println("\n");
    }

}
