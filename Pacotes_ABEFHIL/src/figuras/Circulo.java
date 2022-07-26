/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author JOSLAINE
 */
public class Circulo extends Figura {

    private double r;
    private double p;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    @Override

    public double area() {
        area = (r * r) * (3.14);
        return area;
    }

    @Override
    public double perimetro() {
        perimetro = 2 * 3.14 * r;
        return perimetro;
    }

}
