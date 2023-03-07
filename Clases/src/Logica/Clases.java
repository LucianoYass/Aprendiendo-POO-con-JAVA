
package Logica;

//CLASE MAIN
public class Clases {
    
    public static void main(String[] args) {
        //LLAMO A LOS CONSTRUCTORES / OBJETOS
        //VACIO
        Alumno alumnoUno = new Alumno ();
        //OCUPANDO TODOS LOS PARAMETROS EN ORDEN
        Alumno alumnoDos = new Alumno (14, "Luciano", "Cordoba");
        
        System.out.println("Id alumno 2: " + alumnoDos.getId());
        System.out.println("El nombre es: " + alumnoDos.getNombre());
        System.out.println("El apellido es: " + alumnoDos.getApellido());
        System.out.println("---------------------------");
        //Set para "setear" datos al objeto vacio
        alumnoUno.setId(10);
        alumnoUno.setNombre("Juan Roman");
        alumnoUno.setApellido("Riquelme");
        //Get para adiquirir los datos del objeto
        System.out.println("Id alumno 1: " + alumnoUno.getId());
        System.out.println("El nombre es: " + alumnoUno.getNombre());
        System.out.println("El apellido es: " + alumnoUno.getApellido());
        System.out.println("---------------------------");
        //En este caso con set cambio un valor que ya estaba puesto
        alumnoDos.setId(6);
        System.out.println("Id alumno 2: " + alumnoDos.getId());
        System.out.println("El nombre es: " + alumnoDos.getNombre());
        System.out.println("El apellido es: " + alumnoDos.getApellido());
    }
    
}
