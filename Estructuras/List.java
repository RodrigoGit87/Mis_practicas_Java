package Practicas_Rodrigo.Estructuras;

import java.util.ArrayList;

public class List {
    static void main (){
        //Declaración y creación
        ArrayList<String> names = new ArrayList<>();//Hay que definir el tipo de array; <String> en este caso

        var numbers = new ArrayList<Integer>();/*
                                                * Para crear un arrayList de números enteros, tenemos q indicar
                                                * <Integer>
                                                * porque con los datos primitivos da error.
                                                */


        //Añadir elementos
        names.add("Rodrigo ");
        names.add ("sandra ");
        names.add("lucia ");
        names.add("virginia ");

        //tamaño del array
        //names.size();
        IO.println("tamaño del array: " + names.size());

        //Acceder a elementos
        //names.get(posicion));
        IO.println(names.get(1));
        // otras formas
        // names.getFirst()); y names.getLast());
        IO.println(names.getFirst() + "\n");
        IO.println(names.getLast() + "\n");

        //modificar elementos
        names.set(1, "orco de mordor ");
        IO.println(names.get(1));

        //Eliminar elementos
        names.remove(1);
        IO.println(names.get(1));/*Cuando eliminas un elemento, todos los elementos que estaban después se desplazan una
        posición hacia la izquierda para llenar el hueco, y el tamaño de la lista se reduce.En este caso a 3posiciones.*/

        /*
         * names.remove(3);
         * IO.println(names.get(3));
         * Aquí da error (IndexOutOfBoundsException) porque intento acceder a
         * un índice que ya no existe. Al eliminar el índice 1 de antes, ya tenemos 3
         * elementos (0,1,2)
         */

        IO.println(names.size());//<--debe dar 3

        //Buscar elementos
        //names.contains("valor que busquemos");
        IO.println(names.contains("Rodrigo "));

        //Limpiar ArrayList
        //names.clear();
        IO.println(names);

        // Iterar sobre el ArrayList
        // 1. Usando bucle for-each (la forma más común)
        IO.println("1. Usando bucle for-each:");
        for (String name : names) {
            IO.println(name);
        }

        // 2. Usando bucle for con índice
        IO.println("\n2. Usando bucle for con índice:");
        for (int i = 0; i < names.size(); i++) {
            IO.println(names.get(i));
        }

        // 3. Usando el método forEach con lambda (Java 8+)
        IO.println("\n3. Usando forEach con lambda:");
        names.forEach(name -> IO.println(name));

        // 4. Usando un Iterator
        IO.println("\n4. Usando Iterator:");
        java.util.Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            IO.println(iterator.next());
        }

    }
}
