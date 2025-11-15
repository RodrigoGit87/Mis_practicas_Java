package Practicas_Rodrigo;

import java.util.ArrayList;

public class EjerciciosFunciones {
     static void main(String[] args) {
        bienvenida();
        saludo("Guest");
        IO.println(resta(2000, 853));
        IO.println(calcularCuadrado(50, 25));
        IO.println(par_impar(2));
        IO.println(mayoriaEdad(11));
        IO.println(longitudString("Esta cadena de texto,String, es de la funcion longitudString, que sirve para saber la longitud de este String :P"));

        int[] numerosRandom = {11100,2220,38,1500,250,41,69}; //<--creo un array para pasarlo como parametro a la funcion Arraydeint
        IO.println("\n"+averageArrayInt(numerosRandom));

        IO.print("factorial de 12: ");
        IO.print(factorial(12));
        //creo un ArrayList
        var lista = new ArrayList<String>();
        lista.add("patatas");
        lista.add("snacks");
        lista.add("pepinillos");
        lista.add("tomates");

        IO.println("\nElementos en la lista: ");
        mostrarArrayList(lista);//<-- Llamada a la funcion de mostrar un ArrayList, con el parametro, el ArrayList creado 'lista'.
    }
        //-------------------------------------------------------------------------------------------------------------
        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        public static void bienvenida (){
            IO.println("¡Te doy la bienvenida al curso de Java desde cero!");
        }
        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        public static void saludo (String nombre){
            IO.println("Hola " + nombre +" !");
        }
        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        public static int resta (int n1, int n2){
        int restar = n1 - n2;
        return restar;
        }
        // 4. Crea un método que calcule el cuadrado de un número (n * n).
        public static int calcularCuadrado (int n1, int n2){
            int cuadrado = n1 * n2;
            return cuadrado;
        }
        // 5. Escribe una función que reciba un número y diga si es par o impar.
        public static int par_impar (int n1){
            int calculopar=0;
            if ( n1 % 2 == 0){
               calculopar = n1;
                IO.println("El numero es par.");
            } else {
                IO.println("El numero es impar.");
            }
            return calculopar;
        }
        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        public static boolean mayoriaEdad (int edad) {
            if (edad >= 18) {
                IO.println("Es mayor de edad");
                return true;
            } else {
                IO.println("Es menor de edad");
            }
            return false;
        }
        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        public static String longitudString (String p){
                return String.valueOf(p.length());
        }
        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
        public static int averageArrayInt (int[] numbers){
            if (numbers.length == 0) {
                return 0; // Si no hay números, la media es 0
            }
            int suma =0;
            for (int numero : numbers){
                suma += numero;
            }
            return suma / numbers.length;
        }
        // 9. Escribe un método que reciba un número y retorna su factorial.
    public static long factorial (long n) {
        if (n == 0){
        return 1;}

        return n * factorial(n - 1); } /*<--RECURSIVIDAD; Si n no es 0... Devolvemos n multiplicado por la llamada a si misma de la función. pero restando 1 para que llegue al caso if y pueda salir de llamarse a
        si misma*/

    /* lo mismo pero con un bucle for (llamada iterativa), mentalmente mas visual

    *   public static int factorialIterativo (int n1){
    *   int acumular = 1;
    *   for (int i = 1; i <= n ; i++){
    *        acumular *= i;   }
    *   return acumular;
    * }
    * */

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        public static void mostrarArrayList (ArrayList<String> lista){
                for (String item: lista){ //<--Se lee: "Por cada item (de tipo String) DENTRO DE lista..."
                    IO.println("- " + item);
                }
            }
        }


