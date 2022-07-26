/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_3;

import java.util.Scanner;

/**
 *
 * @author JOSLAINE
 */
public class Main {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        Distancia d = new Distancia();
        System.out.println("Entre com as coordenadas x, y e z dos pontos nesta ordem:");
        d.calc_dist_3d();
    }
}
