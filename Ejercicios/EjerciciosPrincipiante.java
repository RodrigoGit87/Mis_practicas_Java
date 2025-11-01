package Practicas_Rodrigo.Fundamentos;

public class EjerciciosPrincipiante {
    public static void main() {


        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Rodrigo";
        IO.println("nombre " + name);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age=38;
        IO.println ("edad " + age);

        // 3. Crea una variable double con tu altura en metros.
        double height=1.80;
            IO.println("altura: " + height);
        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean LikeProgramming= true;
            IO.println("le gusta programar? "+ LikeProgramming);
        // 5. Declara una constante con tu email.
        final String EMAIL = "rodrigo@java.es";

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char inicial = 'r';
            IO.println("inicial " + inicial);
        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        var location = "Españistan";
                IO.println("localidad: " + location);
        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a=8;
        int b=12;
        int suma= a+b;
        IO.println("suma de a + b: " + suma);
        // 9. Imprime el tipo de dos variables creadas anteriormente.
        IO.println ("tipo de variable de location: " + location.getClass().getSimpleName());//No se puede con variables primitivas.
        IO.println ("Tipo de variable de email:" + EMAIL.getClass().getSimpleName());
        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.

                // 1. Declarar la variable (la "caja" está vacía)
                int miVariable;

                // ... podrías hacer otras cosas en tu programa ...

                // 2. Asignarle un valor (metes algo en la "caja")
                miVariable = 150;

                // 3. Imprimirla (miras qué hay en la "caja")
                System.out.println("El valor de mi variable es: " + miVariable);

        }

    }

