package Practicas_Rodrigo.Estructuras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    static void main(String[] args) {
        // For - contador
        for (int i = 1; i <= 5; i++) {
            IO.println("\nAttack: " + i);
        }
        IO.println("------------------");
        // recorrer un Array
        String[] familia = { "Rodri", "Sandra", "Lucia", "Virgi", "Tom" };
        for (int n = 0; n < familia.length; n++) {
            IO.println("Nombre: " + familia[n]);
        }
        IO.println("------------------");
        // Recorrer con for-each
        for (String miembro : familia) {
            IO.println(miembro);
        }
        IO.println("------------------");
        // Recorrer un HashSet
        // Declaramos un HashSet y añadimos elementos con un ciclo for
        HashSet<Integer> mazo = new HashSet<>();
        for (int i = 1; i <= 12; i++) {
            mazo.add(i);
        }
        // Recorremos el HashSet con un for-each

        for (Integer carta : mazo) {
            IO.println("Carta del Mazo:" + carta);
        }
        IO.println("------------------");
        /*
         * Para recorrer un Map (Que funciona como clave:valor) necesitamos una manera
         * de que cada par clave:valor sea único.
         * La manera es con Map.Entry y la funcion .entrySet() Veamos;
         */
        // Tenemos un hashmap
        HashMap<String, String> email = new HashMap<>();
        email.put("Doom", "doomslayer@bethesda.com");
        email.put("Gandal", "el_gris_69@lotr.com");
        email.put("Elver", "galarga@gmail.com");
        email.put("Susa", "nahoria@tinder.com");
        // el ciclo for each para un HashMap tiene que quedar;
        for (Map.Entry<String, String> correos : email.entrySet()) {
            IO.println("Correos de: " + correos);
        }
        IO.println("------------------");

        for (Map.Entry<String, String> correos : email.entrySet()) {
            IO.println("Correos de: " + correos.getKey());// Si solo queremos recorrer la clave

            IO.println("Correos de: " + correos.getValue()); // Si solo queremos recorrer el value
        }
        IO.println("------------------");
        // Loop While
        int index = 1;
        while (index <= 10) {
            IO.println("While: " + index);
            index++;
        }
        IO.println("------------------");
        // While - Array (usamos el array de antes)
        int i = 0;
        while (i < familia.length) {
            IO.println("Nombre: " + familia[i]);
            i++;
        }
        IO.println("------------------");

        /*
         * podemos hacer que mientras recorre el array si encuentra algo q queremos, que
         * haga algo. Ejemplo:
         */
        i = 0;
        boolean encontrar = false; //bandera de guardia
        while (!encontrar) {
            if (familia[i].equals("Tom")) {
                IO.println("Hay un perro en el array !");
                encontrar = true;
            }
            i++;
        }
        IO.println("------------------");

        // Loop Do-While (Asegura al menos una iteración)
        i = 0;
        do {
            IO.println("Do while: " + i);
            i++;
        } while (i <= 6);
    }
}