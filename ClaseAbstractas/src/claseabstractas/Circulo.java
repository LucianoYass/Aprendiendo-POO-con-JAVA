
package claseabstractas;

public class Circulo implements Figura, Dibujable, Rotable {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    
    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }

    @Override
    public void dibujable() {
        System.out.println("Estoy dibujando un circulo");
    }

    @Override
    public void rotable() {
        System.out.println("Estoy girando el circulo");
    }
    
}
