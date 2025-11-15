package Practicas_Rodrigo;

public class EjerciciosBucles {
    static void main(String[] args) {
        IO.println("Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18)");
        var votante = 22;
        if (votante >= 18) {
            IO.println("El usuario puede votar");
        } else {
            IO.println("El usuario no puede votar");
        }
        IO.println("\nDeclara dos números y muestra cuál es mayor, o si son iguales");
        var a = 80;
        var b = 38;
        if (a > b) {
            IO.println("El nº " + a + " es mayor que " + b);
        } else if (b > a) {
            IO.println("El nº " + b + " es mayor que " + a);
        } else
            IO.println("los numeros son iguales" + a + ", " + b);

        IO.println("\nDado un número, verifica si es positivo, negativo o cero.");
        if (a == 0) {
            IO.println("El valor de a es: " + a);
        } else if (a < 0) {
            IO.println("El numero " + a + " es negativo. ");
        } else {
            IO.println("El numero es positivo: " + a);
        }

        IO.println("\nCrea un programa que diga si un número es par o impar.");
        int numero = 0;
        if (numero % 2 == 0) {
            IO.println("El numero " + numero + " es par.");
        } else {
            IO.println("El numero " + numero + " es impar.");
        }

        IO.println("\nVerifica si un número está en el rango de 1 a 100.");
        var n1 = 101;
        if (n1 < 100 && n1 > 0) {
            IO.println("el numero está en rango de 1 a 100");
        } else {
            IO.println("el numero está fuera del rango 1 a 100");
        }

        IO.println("\nDeclara una variable con el día de la semana (1-7) y muestra su nombre con switch.");
        var diasemana = 5;
        switch (diasemana) {
            case 1:
                IO.println("Lunes");
                break;
            case 2:
                IO.println("Martes");
                break;
            case 3:
                IO.println("Miercoles");
                break;
            case 4:
                IO.println("Jueves");
                break;
            case 5:
                IO.println("Viernes");
                break;
            case 6:
                IO.println("Sabado");
                break;
            case 7:
                IO.println("Domingo");
                break;
            default:
                IO.println("el numero no coincide con el dia de la semana");
        }

        IO.println("\nSimula un sistema de notas: muestra \"Sobresaliente\", \"Aprobado\" o \"Suspenso\" según la nota (0-100).");
        var notas = 80;
        IO.print("nota: " + notas + "\n");
        if (notas < 0 || notas > 100) {
            IO.println("Error en las notas");
        } else {
            if (notas <= 100 && notas >= 90) {
                IO.println("Sobresaliente");
            } else if (notas < 90 && notas >= 50) {
                IO.println("Aprobado");
            } else {
                IO.println("Suspenso");
            }
            if (notas < 0 || notas > 100) {
                IO.println("Error en las notas");
            }
            IO.println("\nEscribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.");
            var p1 = 10;
            boolean acompanied = true;

            if (p1 >= 15 || acompanied) {
                IO.println("\nPuede entrar en el cine.");
            } else {
                IO.println("\nNo puede entrar en el cine");
            }


            IO.println("\nCrea un programa que diga si una letra es vocal o consonante.");
            var letra= "A";
            if (letra.equalsIgnoreCase("a")|| letra.equalsIgnoreCase("e")|| letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
                IO.println("la letra "+ letra+ ", es una vocal. ");
            }else {
                IO.println("la letra "+ letra+ ", es una consonante. ");
            }


            IO.println("\nUsa tres variables a ,b , c y muestra cuál es el mayor de las tres.");
            int z=100; int x = 100; int c=86;
            if (z>=x && z >= c){
                IO.println(z+" es el mayor");
            }else if (x>=z && x>=c){
                IO.println(x+ " es el mayor");
            }else{
                IO.println(c+ " es el mayor");
            }

        }
    }
}
