package basic.c09_exceptions;

/*
Clase 72 - Ejercicios: Excepciones
Vídeo: https://youtu.be/JOAqpdM36wI?t=29721
*/

import java.sql.Array;

public class ExceptionsExercises {

    public static void main(String[] args) {

        // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.
         int a, b;
         a = 20;
         b = 0;
         try {
         int division = a / b;
         System.out.println(division);
         } catch (ArithmeticException e) {
         System.err.println("Division por zero no permitida");
         } finally {
         System.out.println( " el finally entra y deja q el programa continue :P ");
         }

        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.
         int[] años = new int[3];
         try {
         IO.println(años[5]);
         } catch (IndexOutOfBoundsException e) {
         System.err.println(" Indice fuera del rango: " + e.getMessage());
         } finally {
         IO.println(" finally alcanzado ");
         }

        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el
        // NullPointerException.
         String nula = null;
         try {
         IO.println(nula.length());
         } catch (NullPointerException e) {
         System.err.println("ERROR, el String no puede ser null. " + e.getMessage());
         } finally {
         System.out.println(" el programa continua ");
         }

        // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).
         ExceptionsExercises ejercicio= new ExceptionsExercises();
         ejercicio.transformarTexto("123/321");

        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.
         String texto = null;
         try {
         texto.compareToIgnoreCase("vacio");
         } catch (NullPointerException e) {
         System.err.println("No se puede comparar un String null. " + e.getMessage());
         } finally {
         System.out.println(" finally alcanzado");
         }
        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido
        // es negativo.
         ExceptionsExercises ejercicio6 = new ExceptionsExercises();
         try {
         ejercicio6.comprobarNumeroNegativo(-2);
         } catch (ArithmeticException e) {
         System.err.println(" Error al revisar la edad; "+ e.getMessage());
         }

        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.
            var termometro1 = new TemperatureChecker();
        try {
            termometro1.registrarTemp(-70);
        } catch (CustomException e) {
            System.err.println ("ERROR Temperatura fuera de rango minimo/máximo. " + e.getMessage());
        } finally {
            System.out.println(" finally alcanzado");
        }

        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException,
        // otro para ArrayIndexOutOfBoundsException.
            int[] numParesArray = new int[8];
            int resultadoSuma;
            for ( int i = 0; i < numParesArray.length; i++) {
                resultadoSuma = i+2;
                numParesArray[i] = resultadoSuma;
            }
            try{
                System.out.println(numParesArray[9]);
            }catch (ArithmeticException e){
                System.err.println(" Error en el numero " + e.getMessage());
            } catch (IndexOutOfBoundsException e){
                System.err.println(" Error en el indice del array " + e.getMessage());
            } finally{
                System.out.println(" programa continua ");
            }

        // 9. Crea una función checkPassword(String pass) que lance una excepción si la
        // contraseña es demasiado corta.
            try {
                var usuario = new ExceptionsExercises();
                usuario.checkPassword("wasd");
            } catch (CustomException e) {
                System.err.println(" Error al crear contraseña; " + e.getMessage());
            } finally {
                System.out.println(" finally reached");
            }
        // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
                var log1 = new LoginSystem();
                try {
                    log1.loginFailedException("admin", "wasd691234**");
                }catch (CustomException e){
                    System.err.println (" Fallo al logear, user no puede ser '"+ log1.usuario  +"' . Contraseña debe tener + de 12 caracteres. " +e.getMessage());
                }
    }

        /*---------------  Clases y metodos para resolver ejercicios   ------------------------- */

    public void transformarTexto(String texto) {
        try {
            String entradaTexto = texto.trim();
            int textoEnInt = Integer.parseInt(texto);
            System.out.println("Texto convertido a int: " + textoEnInt);
        } catch (NumberFormatException e) {
            System.err.println(" ERROR. El formato del String no es válido");
        } finally {
            System.out.println(" Show must go on");
        }
    }

    public void comprobarNumeroNegativo(int numero) throws ArithmeticException {
        if (numero < 0) {
            throw new ArithmeticException("El numero no puede ser negativo.");
        } else
            System.out.println(" Numero '" + numero + "' válido ");
    }

    public static class TemperatureChecker {

        public TemperatureChecker(){};

        public void registrarTemp( int temp) throws CustomException {
            if (temp < -50 || temp > 50) {
                throw new CustomException("Error al registrar temperatura.");
            } else System.out.println( " temperatura"+ temp +"registrada correctamente. ");
        }
    }
    public void checkPassword (String pass) throws CustomException {
        if (pass.length() < 12){
            throw new CustomException("Numero de caracteres insuficientes.");
        } else System.out.println(" Contraseña correcta ");
    }

    public static class LoginSystem extends Exception {
        private String usuario;
        public String getUsuario() {
            return usuario;
        }
        public void loginFailedException(String user, String password) throws CustomException {
            usuario = user.trim();
            if (user.trim().equalsIgnoreCase("admin") || password.length() < 12) {
                throw new CustomException(" ERROR al logear ");
            } else System.out.println(" Logeo correcto.");
        }
    }
}
