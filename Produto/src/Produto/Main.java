/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto;

/**
 *
 * @author Neusa
 */
public class Main {

    public static void main(String[] Args) {
        Produto p1 = new Produto("Sabão", "omo", 20.00);
        Produto p2 = new Produto();
        Produto p3 = new Produto();

        System.out.println(p1.getIdproduto());
        System.out.println(p2.getIdproduto());
        System.out.println(p3.getIdproduto());
    }

}
