package ex_3;

import java.util.Scanner;

/**
 *
 * @author JOSLAINE
 */
public class Distancia {

    private double x1;
    private double y1;
    private double z1;
    private double x2;
    private double y2;
    private double z2;
    private double distancia;

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getZ1() {
        return z1;
    }

    public void setZ1(double z1) {
        this.z1 = z1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getZ2() {
        return z2;
    }

    public void setZ2(double z2) {
        this.z2 = z2;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void calc_dist_3d() {
        Distancia d = new Distancia();
        Scanner k = new Scanner(System.in);
        double xa, xb, ya, yb, za, zb;
        System.out.println("X:");
        //Posição em X
        xa = k.nextDouble();
        xb = k.nextDouble();
        d.setX1(xa);
        d.setX2(xb);

        System.out.println("Y:");
        //Posição em Y
        ya = k.nextDouble();
        yb = k.nextDouble();
        d.setY1(ya);
        d.setY2(yb);

        System.out.println("Z:");
        //Posição em Z
        za = k.nextDouble();
        zb = k.nextDouble();
        d.setZ1(za);
        d.setZ2(zb);
        
        //Calculo da distancia
        d.setDistancia(Math.sqrt(Math.pow(d.getX2() - d.getX1(), 2) + Math.pow(d.getY2() - d.getY1(), 2) + Math.pow(d.getZ2() - d.getZ1(), 2)));
        System.out.println("A distância é: " + d.getDistancia());

    }

}
