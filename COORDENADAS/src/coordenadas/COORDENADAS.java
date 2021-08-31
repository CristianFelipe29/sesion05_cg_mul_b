/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordenadas;

import java.awt.geom.AffineTransform;
import static java.lang.Math.*;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class COORDENADAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Defina y asigne dos objetos, un Cadrado y una Circunferencia
		// Solicite al usuario ingresar el valor de un vector de traslación 
		// Aplique el vector de traslación anterior a cada uno de los objetos referidos
		// Muestre las posiciones originales y finales de cada uno de los objetos referidos
		
	}
}

class Coord {
    private int x, y;
     public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Cuadrado {
    private Coord c;
    private int lado;
    private Object t;
    private Object r;
    public Cuadrado(Coord c, int lado) {
        this.c = c;
        this.lado = lado;
    }
    public void Traslacion() {  // Complete los parámetros requeridos
         c.setX(t.getX()+c.getX());
        c.setY(t.getY()+c.getY());
    }
    public void Escalado() {  // Complete los parámetros requeridos
        lado = (int)(lado*(1+s/100.0f));
    }
    public void Rotacion() {  // Complete los parámetros requeridos
   
    double d = sqrt(pow(r.getX()-0,2)+pow(r.getY()-0,2));
        double angulo = 0;
        int x = (int) (d*cos(angulo));
        int y = (int) (d*sin(angulo));   
        c.setX(x);
        c.setY(y);
    
    }
}

class Circunferencia {
    Coord c;
    float radio;
    // Implementar los métodos Traslacion, Escalado y Rotacion para ésta clase

    public Coord getC() {
        return c;
    }

    public void setC(Coord c) {
        this.c = c;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public int hashCode() {
        return c.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return c.equals(obj);
    }

    @Override
    public String toString() {
        return c.toString();
    }
    
    
    }
    
