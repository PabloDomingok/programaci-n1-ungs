package resolucion;

import java.util.*;

public class Fraccion {
    public int numerador;
    public int denominador;
    
    public Fraccion(int numerador, int denominador) {
    	
    	this.denominador=denominador;
    	this.numerador=numerador;

    }
    public void imprimir() {
    	System.out.print(numerador);
    	System.out.print("/");
    	System.out.print(denominador);
    }
    public void invertirSigno() {
    	this.numerador=numerador*-1;
    	this.denominador=denominador*-1;
    	
    }
    public void invertir() {
    	int aux=this.numerador;
    	this.numerador=this.denominador;
    	this.denominador=aux;
    }
    public double aDouble() {
        return (double) numerador / denominador;
    }
    public void reducir() {
    	int mcd = calcularMCD(this.numerador, this.denominador);
    	this.numerador/=mcd;
    	this.denominador/=mcd;
    	
    }
    public int calcularMCD(int a, int b) {
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static Fraccion producto(Fraccion q1, Fraccion q2) {
    	Fraccion fraccion=new Fraccion(q1.numerador*q2.numerador, q1.denominador*q2.denominador);
    	fraccion.reducir();
    	return fraccion;
    }
    public static Fraccion suma(Fraccion q1, Fraccion q2) {
    	
    	int multCruzada1=q1.numerador*q2.denominador;
    	int multCruzada2=q1.denominador*q2.numerador;
    	int multiplicacion=q1.denominador*q2.denominador;
    	Fraccion fraccion=new Fraccion(multCruzada1+multCruzada2,multiplicacion);
    	fraccion.reducir();
    	return fraccion;
    }
    
}
    

    

