package Practicas_Rodrigo.Fundamentos;

public class VariablesYConstantes {

    public static void main (){
        //Variables
        String name = "Rodrigo";
        IO.println (name);

        int age=38;
        IO.println (age);

        //Constantes

        final String EMAIL = "ejemplo@gmail.com"; // final es decirle a java que la variable es tipo constante


        IO.println ("email: "+ EMAIL);


        var email = "emailvar@gmail.com"; /*la tipo var, podemos cambiar el valor de string a int o
         boolean, pero solo un tipo por variable.*/

        IO.println ("email: "+ email);

    }




}
