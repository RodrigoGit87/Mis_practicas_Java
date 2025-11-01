package Practicas_Rodrigo.Estructuras;

import java.util.ArrayList;
/*En el caso de los ArrayList no tenemos q definir cuantas posiciones de indice queremos,
    asi que es mas flexible y es lo mas común para trabajar*/
public class List {
    static void main (){
        //Declaracion y creacion
        ArrayList<String> names = new ArrayList<>();//Hay que definir el tipo de array con <String> en este caso

        var numbers = new ArrayList<Integer>();/*Para crear un arrayList de numeros enteros, tenemos q indicar <Integer>
        por que con los datos primitivos da error. Integer es como int pero en clase objeto. Y con los objetos si podemos
        dar más instrucciones*/

        //tamaño del array
        //names.size();

        //Añadir elementos
        names.add("Rodrigo ");
        names.add ("sandra ");
        names.add("lucia ");
        names.add("virginia ");

        IO.println("tamaño del array: "+ names.size());

        //Acceder a elementos
        //names.get(posicion));
        IO.println(names.get(0));
        //otras formas
        //names.getFirst()); y names.getLast());
        IO.println(names.getFirst()+"\n");
        IO.println(names.getLast()+"\n");

        //modificar elementos
        names.set(1, "orco de mordor ");
        IO.println(names.get(1));

        //Eliminar elementos
        names.remove(1);
        IO.println(names.get(1));/*Cuando eliminas un elemento, todos los elementos que estaban después se desplazan una
        posición hacia la izquierda para llenar el hueco, y el tamaño de la lista se reduce.En este caso a 3posiciones.
        */
        /*names.remove(3);
        IO.println(names.get(3));
        Aqui da error (IndexOutOfBoundsException) porque intento acceder a
        un índice que ya no existe*/
        IO.println(names.size());

        //Buscar elementos
        //names.contains("valor que busquemos");
        IO.println(names.contains("Rodrigo "));

        //Limpiar ArrayList
        //names.clear();
        IO.println(names);

    }
}
