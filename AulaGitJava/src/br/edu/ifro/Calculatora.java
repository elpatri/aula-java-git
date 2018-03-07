package br.edu.ifro;
/**** @author Neris, Patrick*/
public class Calculatora {

    public double soma (double x, double y){
        return x+y;
    }
    
    public double subtracao (double x, double y) {
        return x-y;
    }
    
    public double divisao (double x, double y) {
        return x/y;
    }
    
    public double multiplicacao (double x, double y) {
        return x*y;
    }
    public static void main (String []args){
        double x = 10;
        double y = 20;
        Calculatora c = new Calculatora () ;
        System.out.println("soma: " + c.soma (x, y));
        System.out.println("subtracao: " + c.subtracao (x, y));
        System.out.println("divisao: " + c.divisao (x, y));
        System.out.println("multiplicacao: " + c.multiplicacao (x, y));
    }
}