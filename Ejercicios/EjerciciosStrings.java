package Practicas_Rodrigo;

public class EjerciciosStrings {
    static void main (String[] args){
    // 1. Concatena dos cadenas de texto.
            IO.println ("hola " + "mundo\n");

    // 2. Muestra la longitud de una cadena de texto.
            var a = "Cadena de texto a";
            IO.println (a.length());
    // 3. Muestra el primer y último carácter de un string.
            IO.println (".charAt(0); " + a.charAt(0));
            IO.println ("a.charAt(a.length()-1)); " + a.charAt(a.length()-1));
    // 4. Convierte a mayúsculas y minúsculas un string.
            IO.println(a.toUpperCase());
            IO.println(a.toLowerCase());
    // 5. Comprueba si una cadena de texto contiene una palabra concreta.
            IO.println(a.toUpperCase().contains("DE"));
    // 6. Formatea un string con un entero.
        var player = " Edgar Allan Powned ";
        var frags = 53;
        var deaths = 12;
        IO.println(String.format("Player statistics: Name = %s, Total Frags= %d, y un total de muertes= %d",player, frags,deaths ));

    // 7. Elimina los espacios en blanco al principio y final de un string.
        IO.println(player.trim());

    // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        IO.println(player.replace(" " , "-"));

    // 9. Comprueba si dos strings son iguales.
        IO.println( player.equalsIgnoreCase("Edgar allan Poe"));

    // 10. Comprueba si dos strings tienen la misma longitud.
        IO.println(player.length() == a.length());

 }
}
