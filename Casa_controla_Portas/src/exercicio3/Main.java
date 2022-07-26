/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import exercicio2.Porta;
import java.util.Scanner;

/**
 *
 * @author JOSLAINE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner k = new Scanner(System.in);
        String s;
        s = k.nextLine();
        Casa c = new Casa();
        c.pinta(s);
        System.out.println("A cor da casa é " + c.cor);

        Porta p1 = new Porta();
        Porta p2 = new Porta();
        Porta p3 = new Porta();
        Porta p = new Porta();
        c.porta1=p1;
        c.porta2=p2;
        c.porta3=p3;
        
        c.porta1.abre();
        c.porta1.fecha();
        c.porta2.abre();
        c.porta3.abre();
        System.out.println(c.quantasPortasEstaoAbertas()+" portas estão abertas");
        // System.out.println(c.quantasPortasEstaoAbertas());
    }

}
