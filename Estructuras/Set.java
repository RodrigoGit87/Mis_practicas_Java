package Practicas_Rodrigo.Estructuras;
/*La principal diferencia con el ArrayList es que en vez de guardarse en posiciones dentro de un indice,
se guardan con un hash. ESto hace que se guarde de manera desordenada pero que se puede acceder de
manera  mas rápida.
 */

import java.util.HashSet;

public class Set {
    static void main (){
        //Declaracion y creacion
        HashSet<String> names = new HashSet<>();//una manera
        var numbers = new HashSet<Integer>();//otra manera

        //tamaño
        IO.println(names.size());


        //Añadir elementos
        names.add("Hornet ");
        names.add ("Slayer ");
        names.add("Gandalf ");
        names.add("Rosa melano ");
        IO.println("tamaño del Set: "+ names.size());

        //Eliminar elementos
        //names.remove("Rosa melano ");


        //Acceder a elementos
        /*En los HashSet no sabemos el orden en el que se guardan, por tanto no podemos usar el modo de
        acceder como con los ArrayList (.get(posicion), .getFirst(), .getLast() )
         Entonces trabajar con HashSet es util si no vamos a modificar el orden dentro del array, la forma de
         buscar un elemento en el array es con el metodo contains*/


        //Buscar elementos
        IO.println("HashSet contiene Gandalf ?: "+ names.contains("Gandalf ")); //<-True
        IO.println("HashSet contiene rodrigo?: " + names.contains("rodrigo"));//<- False

        /*Otra cualidad de los HashSet, es q no permite repetir el mismo elemento, en un Arrraylist si se puede pro que
        el elemento con el mismo valor simplemente tiene una posicion nueva en el indice.

        - ejemplo, añado 3 Hornet, pero no existen 4 Hornet,se queda en 1, y como se ve, el size del array sigue
          siendo los 4 iniciales:*/
        names.add("Hornet ");
        names.add("Hornet ");
        names.add("Hornet ");
        IO.println(names);
        IO.println(names.size());

        //Conjuntos
        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("EEUU");
        countries.add("Japon");

        names.addAll(countries); //Al HashSet names, le he añadido el HashSet countries con el metodo .addAll
        IO.println(names);//Ahora names tiene sus valores más los de countries [EEUU, Slayer , Gandalf , España, Japon,
        // Hornet , Rosa melano ]

        /*Si en el countries añado un elemento que tambine existe en el de names y luego hago un removeAll
        del conjunto countries en names, se va a borrar de los dos conjuntos (names y countries).
        Esto es secuencialmente asi:
        countries.add ("Slayer ");

        names.removeAll(countries);

        IO.println(names);
        Resultado de names: [Gandalf , Hornet , Rosa melano ] Ya no existe Slayer ni en countries ni en names
         */
    }
}
