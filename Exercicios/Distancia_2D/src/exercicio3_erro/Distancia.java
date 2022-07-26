/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3_erro;

import java.util.Scanner;

/**
 *
 * @author JOSLAINE
 */
public class Distancia {

    public void Calc_distancia(){
        Scanner k = new Scanner(System.in);
        double x1, y1, x2, y2, distancia;

        System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
        //Coordenadas em X
        System.out.println("X:\t");
        x1 = k.nextDouble();
        x2 = k.nextDouble();
        //Coordenadas em Y
        System.out.println("Y:\t");
        y1 = k.nextDouble();
        y2 = k.nextDouble();
        //Calculo
        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("A distância é: " + distancia);
    }

}

