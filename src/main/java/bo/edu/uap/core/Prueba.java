package bo.edu.uap.core;

import bo.edu.uap.utils.App;
import bo.edu.uap.utils.Persona;

/**
 * Hello world!
 *
 */
public class Prueba 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Llamando a api del proyecto conversor" );
        Persona persona = new Persona();
        persona.setNombre("Pablo Perez");
        persona.setEdad(34);
        persona.setPropiedad("xxxx");
        App app = new App();
        String resultado = app.obtenerJson(persona);
        System.out.println(resultado);
    }
}
