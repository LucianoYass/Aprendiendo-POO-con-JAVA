
package Logica;


//CLASE
public class Alumno {
    
    int id;
    String nombre;
    String apellido;

    //CONSTRUCTOR VACIO
    public Alumno() {
    }

    //CONSTRUCTOR CON TODOS LOS PARAMETROS
    public Alumno(int id, String nombre, String apellido) {
        //THIS. METODO PARA INVOCAR LAS "CARACTERISTICAS" Y ASIGNARSELAS A LAS QUE SON EXCLUSIVAMENTE DE ESTE CONSTRUCTOR
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    //METODO (EN ESTE CASO VOID, PORQUE NO DEVUELVE NADA, SOLO MUESTRA)
    public void mostrarNombre() {
        System.out.println("Hola, soy alumno y puedo decir mi nombre");
        
    }
    
}
