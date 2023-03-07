
package claseabstractas;

public class Cuadrado implements Figura, Dibujable {

    private double lado;
    
    public Cuadrado() {
        
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    
    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujable() {
        System.out.println("Dibujando cuadrado");
    }
    
}
