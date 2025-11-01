package Practicas_Rodrigo.Estructuras;

import java.util.HashMap;

public class Maps {
    static void main(){


        // Declaracion y creacion
        HashMap <String,String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        //Tamaño
        //IO.println(names.size());

        //Añadir elementos
        names.put("Rodrigo ", " emailderodrigo@ejemplo.com");
        names.put("Rodri ", " emailderodri@ejemplo.com");
        names.put("RodrigoDEV ", " emailderodriDEV@ejemplo.com");

        IO.println(names.size());
        IO.println(names);

        //Acceder a elementos
        //names.get(object key);
        //names.get("RodrigoDEV ");
        IO.println("names.get(\"RodrigoDEV \"); "+ names.get("RodrigoDEV "));
        /* Al ser Hash, pasa lo mismo q con HashSet, no se guarda ordenadamente en un indice sino por hashes.
        pero como HashMap funciona con clave:valor , sabiendo la clave (object key) podemos imprimir o saber su valor
        mediante el comando .get */

        //Verificar elementos
        /*Si queremos saber si una clave existe o no.
        * names.containsKey("Rodrigo ")    Devuelve true o false*/
        IO.println("(names.containsKey(\"Rodrigo \") "+ names.containsKey("Rodrigo "));
        //Lo mismo pero para verificar valores en vez de clave
        //names.containsValue(" emailderodriDEV@ejemplo.com");
        IO.println("names.containsValue(\" emailderodriDEV@ejemplo.com\") "+
                names.containsValue(" emailderodriDEV@ejemplo.com"));

        //Limpiar
        //names.clear();

        //Eliminar elementos
        //names.remove(object key);
        IO.println(names.remove("Rodri "));/*Elimina el elemento clave:valor, pero muestra en pantalla el valor de
        clave eliminada.*/
        //IO.println(names);  <-Lo compruebo

        //Modificar elementos
        /*Tengo creado la clave "Rodrigo ", al crear otro .put con el mismo nombre de clave, poner otro valor a la clave
        modifica el valor de la clave original. Y no crea otro elemento con la misma clave pero diferente valor como
        podriamos pensar en un primer momento.*/
        names.put("Rodrigo ", "helloworld@gmail.com");
        IO.println(names); /* <-- Compruebo aqui que efectivamente el valor de "Rodrigo " originalmente era
         {Rodrigo =emailderodrigo@ejemplo.com}
         y ahora es {Rodrigo =helloworld@gmail.com}*/

        names.replace ("RodrigoDEV ", "DEVWorld@java.com");//replace si modifica una clave:valor q ya exista en el array hashmap
        IO.println(names);






    }
}
