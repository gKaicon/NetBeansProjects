/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author 0048609
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        int x, y, z;
        String s1;
        boolean porta;
        System.out.println("Escreva a cor");
        s1 = k.nextLine();
        System.out.println("Escreva a Altura");
        x = k.nextInt();
        System.out.println("Escreva a Largura");
        y = k.nextInt();
        System.out.println("Escreva a expessura");
        z = k.nextInt();

        Porta portax = new Porta();
        porta = portax.estaAberta();

        portax.pinta(s1);
        portax.setDimensaoX(x);
        portax.setDimensaoY(y);
        portax.setDimensaoZ(z);
        System.out.println(porta);
        System.out.println("\nA altura " + portax.getDimensaoX() + "cm"
                + "\nLargura " + portax.getDimensaoY() + "cm"
                + "\nExpessura " + portax.getDimensaoZ() + "cm");
        // TODO code application logic here
    }

}
