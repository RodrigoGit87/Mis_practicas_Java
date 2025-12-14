package Practicas_Rodrigo.Funciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Funciones {
        void main () {
            Scanner scanner = new Scanner(System.in); //<-- La clase scanner si se pide dentro del main.
            System.out.println("Introduce el ID de usuario:");
            int id= scanner.nextInt();
            scanner.close();

            //Llamadas
            sendEmail();
            sendEmailToUser("fulanito_de_copas@java.com");
            sendEmailToUser("pepito@gmail.com", id);/*Utilizo la clase scanner para pedir
            variable id, y la paso como parametro ( en vez de escribir la id manualmente).*/
            sendEmailWithState("mengano@java.es");

        }
        //---------------------------------------------------------------------------------------------------
        //------Metodos (funciones) se crean fuera del main. Pero si se llaman dentro del metodo main------
        //Crear función sin parametros
        public static void sendEmail () {
            IO.println("se envia el correo");
        }
        //Crear funcion con párametros
        public static void sendEmailToUser (String email){
            IO.println("Enviado correo a: " + email);
        }

    //Sobrecarga de funciones

    /* En Java, sobrecarga de métodos permite definir múltiples métodos con el mismo nombre
    pero con diferentes parámetros (distinta firma).
    Las reglas clave para la sobrecarga de métodos:
    -Mismo Nombre: Todos los métodos sobrecargados deben tener el mismo nombre.
    -Parámetros Diferentes: Cada versión del mét0do debe tener un número diferente de parámetros,
     tipos diferentes de parámetros, o ambos.*/

    public static void sendEmailToUser(String email, int id) {
        IO.println("Se envia email a: "+ email+" con ID:"+ id);
    }
    public static void sendEmailToUser(ArrayList<String> emails){
        IO.println("Iniciando envio de "+ emails.size()+" correos.");
        for (String email: emails){
        sendEmailToUser(email);//Imaginar código q envie mails (complejo)
        }
    }//<-Creada la función, dentro de main hay q crear un ArrayList de tipo String q contenga los mails para pasárselo
    // como parametro

    //Funciones con retorno
    public static boolean sendEmailWithState (String email) {
        if(email.isEmpty()){
            IO.println("Email está vacio, inserte un mail válido.");
            return false;
        }
        IO.println("se envia el correo a:"+ email);
        return true;
    }

}