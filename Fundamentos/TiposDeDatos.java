package Practicas_Rodrigo.Fundamentos;

public class TiposDeDatos {



    public static void main(){
        //Tipos de datos primitivos
        int myInt = 38;//Enteros
        IO.println(myInt +",");
        double myDouble = 1.77;//Reales
        //tambien existen float (mas corto q el double), long (numeros mas grandes que el double), byte
        IO.println(myDouble+",");

        char  myChar = 'a';//para un solo caracter. Va entre comillas simples.
        //Para cuando queresmo trabajar variables de un solo caracter.
        IO.println(myChar+",");

        boolean myBoolean = true;
        myBoolean = false;

        String myString = "Hola Java"; //Aunque en realidad String es una clase,
        //se usa tanto a nivel básico que se considera primitivo o del "core" del lenguaje
        IO.println(myString+".");
    }

}
