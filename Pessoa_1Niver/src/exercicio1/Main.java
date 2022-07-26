/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

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
        Scanner k = new Scanner(System.in);
        String s;
        int x;
        System.out.println("Escreva o nome:");
        s = k.nextLine();
        System.out.println("Qual a idade:");
        x = k.nextInt();
        Pessoa niver = new Pessoa();
        niver.setNome(s);

        niver.setIdade(x);
        System.out.println("\n");

        System.out.println("Nome: " + niver.getNome() + "\nIdade: "
                + niver.getIdade() + " anos" + "\nFaz: "
                + niver.getfazAniversario(niver.getIdade()) + " anos");
        // TODO code application logic here
    }

}
