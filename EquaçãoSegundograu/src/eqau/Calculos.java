/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eqau;

import java.util.Scanner;

/**
 *
 * @author JOSLAINE
 */
public class Calculos extends Equação2grau {

    double a, b, c, delta;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public void calcularDelta() {
        Scanner k = new Scanner(System.in);
        Calculos e = new Calculos();
        double a, b, c, x1, x2;
        System.out.println("Mê dê o valor de a:");
        a = k.nextDouble();
        System.out.println("Mê dê o valor de b:");
        b = k.nextDouble();
        System.out.println("Mê dê o valor de c:");
        c = k.nextDouble();
        e.setA(a);
        e.setB(b);
        e.setC(c);
        delta = (Math.pow(e.getB(), 2) - 4 * e.getA() * e.getC());

        if (delta >= 0) {
            x1 = (-(e.getB()) - Math.sqrt(delta)) / 2 * (e.getA());
            x2 = (-(e.getB()) + Math.sqrt(delta)) / 2 * (e.getA());
            System.out.println("As soluções são: \n" +"x1:\t"+ x1 + "\n"+ "x2:\t"+ x2);
        } else if (delta == 0) {
            x1 = (-b - 0) / 2 * a;
            System.out.println("A solução é: " + x1);
        } else {
            System.out.println("Não tem solução real");
        }
    }
}
