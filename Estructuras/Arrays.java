package Practicas_Rodrigo.Estructuras;
/*un array es una variable q representa un conjunto de datos, del mismo tipo, e indexados (es decir, cada dato tiene una
"posición"en un indice dentro del array) a lo cual podemos acceder directamente a esa posicion.
 Acordarse siempre que los indices empiezan en 0.*/
public class Arrays {
    static void main(){

        //Declaracion y creacion
        int [] number = new int[3];/*Aqui estamos diciendo que el array number tenga 3 posiciones de indice. por tanto,
        la primera posicion es 0, la segunda posicion es 1, y la tercera posicion es 2. Acordarse siempre de restar uno.*/
        IO.print (number);

        //Creacion array tipo String
        String[] nombre = {"Rodri","Sandra","Lucia","Virgi"}; /*Aqui he asignado directamente los valores y automaticamente
        se han creado las posiciones en el indice.Hay 4 valores pués las posiciones van del 0 al 3.*/


        //Acceso
        IO.println(nombre[0]);
        //Creacion y Acceso en una linea
        IO.println((new String [3])[0]);

        //Modificar datos
        number [0]= 69;
        number [1]= 10;
        IO.println(number[0]);
        IO.println(number[1]);

        IO.println("\nCambiar el valor de una posicion en un array tipo string");
        IO.print (nombre[3]);
        nombre[3]= "\nVirGiNia";
        IO.print (nombre[3]);

        IO.println("\nCambiar el valor a null(vacio),de una posicion en un array tipo string");
        IO.print (nombre[3]+"\n");
        nombre [3] = null;
        IO.print (nombre[3] +"\n");
        IO.print (nombre.length);

        IO.println("\nNo se puede asignar valor null a tipos de datos primitivos");
        //number[0]= null; ERROR

    }
}
