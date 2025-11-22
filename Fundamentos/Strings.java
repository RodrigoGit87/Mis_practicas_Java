
public class Strings {
    static void main(String[] args) {
        String name = "\nSandra";
        String surname = "Romero";
        // Operaciones con strings
        // Concatenar
        IO.println(name + " " + surname);

        // Longitud (length)
        IO.println(name.length());// length retorna la longitud del string

        // obtener caracter
        IO.println(name.charAt(3)); // en los parentesis pongo la posicion del indice (recordar siempre empieza en
                                    // 0).

        IO.println(name.charAt(name.length() - 1));/*
                                                    * Si quiero el último caracter del string y no sé el numero de
                                                    * posicion
                                                    * del indice, entre los parentesis pongo el length del string -1.
                                                    */

        // Subcadena
        IO.println("Substring que empieza desde una posicion en el indice\n" + name.substring(5));
        IO.println("Substring desde la posicion 0 a la 5\n" + name.substring(0, 5));

        // toLowerCase y toUpperCase
        IO.println("En minusculas\n" + name.toLowerCase());
        IO.println("En mayusculas\n" + name.toUpperCase());

        // Comprobar si contiene
        IO.println("'Hola,Java'.contains 'ola' " + "Hola, Java ".contains("ola"));
        IO.println("'Hola,Java'.contains 'rodri' " + "Hola, Java ".contains("rodri"));
        IO.println("Hola java".toUpperCase().contains("AVA"));/*
                                                               * El resultado es true por que aunque el string original
                                                               * está en minuscula, he "forzado con toUpperCase y luego
                                                               * el valor en contains lo escribo en mayus para comprobar
                                                               */

        // Comparacion
        IO.println(name.equals("rodrigo"));
        IO.println(name.equals("RoDrigO"));// False por que el equals solo, si diferencia entre mayus y minus
        IO.println(name.equalsIgnoreCase("RoDrigO"));// Este atributo ignora mayus y minusculas
        IO.println("\n");

        /*
         * Buenas practicas
         * == versus .equals
         * Se usa el equals en strings
         */
        var a = "Rodri";
        var b = "Rodri";
        var c = new String("Rodri");
        IO.println(a == b);// Aqui da true
        IO.println(a == c);/*
                            * Aqui da false por que aunque tiene el mismo valor, entiende que es un objeto
                            * creado de
                            * otra forma (con new String) y no lo da por bueno o igual. Por eso se usa el
                            * equals.
                            */

        IO.println(a.equalsIgnoreCase(c));// Aquí la demostración, con equals da true.

        // TRIM
        IO.println(" Hola, me llamo Rodri ".trim());// limpia los espacios en blanco al principio y al final

        // Replace
        IO.println(" Hola, me llamo Rodri ".replace("Rodri", "Señor del Averno"));
        IO.println(" ");

        // Format
        // El formateo de un texto se hace con %s y el formateo de un entero con %d
        var age = 38;
        /*
         * Aplicando el formateo se consigue que el valor de una variable que
         * tengamos(string o entero o decimal %f) se
         * utilize en el texto que estemos haciendo. Y asi si cambia el valor de la
         * variable, cambiará en el texto automa
         * ticamente
         */
        IO.println(String.format("Soy %s. Tengo %d años. ", name, age));
    }
}
