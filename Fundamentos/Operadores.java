package Practicas_Rodrigo;

public class Operadores {
    public static void main() {
        //Operadores Aritmeticos
        IO.println("Operaciones aritmeticas básicas: ");
         var a = 5;
         var b = 3; // En el momento q una de las variables es de tipo real (double en java), ya el resultado lo
        //va a entregar en decimales.

        IO.println ("Suma a + b: " + (a + b)); //suma
        IO.println("Resta a - b: " + (a-b)); //resta
        IO.println("Multiplicar a * b: " +  (a * b)); //multiplicar
        IO.println ("Division a / b: " + (a / b)); //Division
        IO.println ("Resto division a % b: "+ (a % b)); //Resto division

        // Asignación
        IO.println("----------------------");
        IO.println ("Las asignaciones, que son el simbolo aritmetico al lado del igual. +=, -=, *=, /=, %=");
        a = b;
        IO.println("Si a igual a b, entonces a vale: " + a);

        a = b * 2;
        IO.println ("Si a vale b y multiplico b por 2, a vale: " + a);

        a += 1;
        IO.println ("Al nuevo valor de a, le sumamos uno con ' a =+ 1 ': " + a);

        a -= 1;
        IO.println("a -= 1: " + (a));
        a *= 2;
        IO.println("a *= 2: "+(a));
        a /= 2;
        IO.println("a /= 2: "+ (a));
        a %= 2;
        IO.println("a % 2: "+ (a));

        //Operadores de comparacion ( Relacionales)
        IO.println ("----------------------");
        IO.println ("Comparacion");
        // comparan el valor de una variable con otra variable o con otro dato, y lo imprime como true o false)
        IO.println("a == b: " + (a == b)); // Es falso por que el ultimo valor que se asigno a 'a' fue 0 y 'b' sigue valiendo 3)
        //lo comprobamos->
        IO.println("a == 0: "+ ( a == 0));// imprime un true por que comparar 0 con 0, efectivamente es 0

        IO.println(" a != b:" + (a != b)); // a es distinto de b?

        IO.println("otros comparadores(faciles de entender a simple vista)");
        IO.println(" a > b:" + (a > b));
        IO.println(" a >= b:" + (a >= b));
        IO.println(" a < b:" + (a < b));
        IO.println(" a <= b:" + (a <= b));

        // Lógicos

        //Y (AND)
        IO.println("Tabla de verdad con el operador Y &&");
        //Solo es verdad cuando los dos valores son verdad
        IO.println (true && true);
        IO.println (true && false);
        IO.println (false && true);
        IO.println (false && false);

        IO.println( "Ejemplo, 3 > 1 && 5 == 8: " + ( 3 > 1 && 5 == 8));

        //O (OR)
        IO.println("Tabla de verdad con el operador O ||");
        //Solo es falso cuando los dos valores son falsos
        IO.println (true || true);
        IO.println (true ||  false);
        IO.println (false || true);
        IO.println (false || false);
        IO.println( "Ejemplo, 3 > 1 || 5 == 8: " + ( 3 > 1 || 5 == 8));

        //NO (NOT)
        //Se usa el signo de admiracion
        IO.println("El operador NOT ! Niega algo q es verdad, por tanto será falso y viceversa");
        IO.println( "Ejemplo, (!(3 > 1) || 5 == 8): " + ( !(3 > 1) || 5 == 8));

        //Unarios
        IO.println("Unarios, valor de b=3");

        IO.println("+b" + (+b));//lo hace positivo
        IO.println("-b" + (-b));//lo hace negativo
        IO.println("++b" + (++b));//Incremento; si esta delante va a incrementar el valor antes de imprimirlo
        IO.println("b++" + (b++));/*Si el incremento va detrás, se imprime el valor actual y el valor final queda
        guardado hasta la proxima iteracion.*/
        IO.println("Valor de b despues de la iteracion b++: "+(b));
        IO.println("--b" + (--b));//Decremento, igual q con el incremento





    }
}
