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
public class Retangulo extends Figura {
private double b;
    private double h;

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override

    public double area() {
        area = (b*h);
        return area;
    }

    @Override
    public double perimetro() {
        perimetro = (b*2)+(h*2);
        return perimetro;
    }

}


    

