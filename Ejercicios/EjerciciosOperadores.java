package Practicas_Rodrigo;

public class EjerciciosOperadores {
    public static void main (){
        /*
Clase 23 - Ejercicios: Operadores
Vídeo: https://youtu.be/JOAqpdM36wI?t=8085
*/
                    int a = 33;
                    int b = 6;
                    double num1= 37.37;
                    double num2 = 4.37;

                    IO.println ("Crea una variable con el resultado de cada operación aritmética.");
                    int suma = a + b;
                    int resta = (a-b);
                    int multi= (a*b);
                    int division=(a/b);
                    double resto= (num1 % num2);
                    IO.println("suma: "+ suma + " resta: "+ resta+ " multiplicacion: "+ multi+" division: "+division+" resto de divsion "+ resto);

                    IO.println ("Crea una variable para cada tipo de operación de asignación.");
                    var tomarvalordeotravariable =  a = b; //Ahora la variable a vale lo mismo que la b ( 6 en este caso)
                    var multiplicarvalorxnumero= a *5;
                    var añadir = a +=1;
                    var disminuir = a-=1;
                    var dividir = a /=1;
                    var restodivision = a %= 1;

                    IO.println("Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.");
                        IO.println ( true && true);
                        IO.println( false || true);
                        IO.println ( !false);
                    IO.println("Imprime 3 comparaciones falsas con diferentes operadores de comparación.");
                        IO.println(false || false);
                        IO.println (true && false);
                        IO.println(!true);

                    IO.println("Utiliza el operador lógico and.");
                        IO.println( a>b && a<b);

                    IO.println(" Utiliza el operador lógico or.");
                        IO.println ( 5 > 6 || 5 < 6 );

                    IO.println("Combina ambos operadores lógicos.");
                        IO.println ( 10>5 && 5<10 || 1==4);

                    IO.println ("Añade alguna negación.");
                        IO.println ( !(10>5 && 5<10 || 1==4));


                    IO.println("Imprime 3 ejemplos de uso de operadores unarios");
                        IO.println(++a);
                        IO.println(-b);
                        IO.println(++b);

                    IO.println("Combina operadores aritméticos, de comparación y lógicos");
                        IO.println(2+2 == 6-2 || b == a);
    }
}
