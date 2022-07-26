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
public class Triangulo_Retan extends Figura {
    private double cat1;
    private double cat2;
    
    private double h;

    
   

    public double getCat1() {
        return cat1;
    }

    public void setCat1(double cat1) {
        this.cat1 = cat1;
    }

    public double getCat2() {
        return cat2;
    }

    public void setCat2(double cat2) {
        this.cat2 = cat2;
    }

    public double geth() {
        return h;
    }

    public void seth(double h) {
        this.h = h;
    }
 @Override

    public double area() {
        area = (cat1*h)/2;
        return area;
    }

    @Override
    public double perimetro() {
        perimetro = (cat1+cat2+h);
        return perimetro;
    }
}

    

