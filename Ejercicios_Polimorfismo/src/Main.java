import java.util.ArrayList;
import java.util.List;

public class Main {
    //Función para el ejercicio 6 Notification
    public static void sendNotification(Notification n) { //Notification n significa "Acepto cualquier cosa que sea hija de Notification".
        System.out.println(" ");
        n.send();
    }
    // Función para el ejercicio 7
    public static void showAnimalType (Animal animal, Animal animal2, Animal animal3) {
        IO.println("tipo de animal: " +  animal.getType() + ", " + animal2.getType() + ", " +  animal3.getType());
    }
    // main
    void main(String[] args) {
        IO.println("Hello Polimorfismo");

        //Ejercicio 1
        // Crear una lista cuyo TIPO sea la Superclase (Animal).
//        List<Animal> zoo = new ArrayList<>();
        // Añadir instancias de las subclases a la lista de Animal.
//        zoo.add(new Animal.Dog("cancerbero","perro"));
//        zoo.add(new Animal.Cat("Garfield","gato"));
//        zoo.add(new Animal.Cow("Lola","Vaca"));
//        //llamada a metodo
//        for (Animal animal : zoo){
//            animal.makeSound();
//        }
        //Ejercicio 2
//        List<Shape> figurasList = new ArrayList<>();
//        figurasList.add(new Shape.Circle(3.69));
//        figurasList.add(new Shape.Rectangle(2 ,6.10));
//        figurasList.add(new Shape.Circle(9.10));
//        figurasList.add(new Shape.Rectangle(5.55,12));
//        //Llamada a calcularArea
//        for ( Shape item : figurasList){
//            IO.println(item.calcularArea());
//        }
//        //Inicializo el objeto forma1
//        var forma1 = new Shape.Rectangle(5,20);
//        //pruebo el metodo calcular perímetro (al ser metodo unico de la clase hija rectangle, no puedo usar el metodo
//        //en el ciclo for del ArrayList)
//        System.out.println("perimetro de forma 1= " + forma1.calcularPerimetro());

        //Ejercicio 3
//        var printer1 = new Printer();
//        printer1.print("impresora HP");
//        printer1.print(12323);
//        printer1.print(true);
        //Ejercicio 4
//        var saludo = new Greeter();
//        saludo.greet();
//        saludo.greet("Sandra");
        //Ejercicio 5
//        Vehicle coche = new Vehicle.Car();
//        var moto = new Vehicle.Bike();
//        Vehicle camion = new Vehicle.Truck();
//        coche.setName(" coche SUV Cupra");
//        camion.setName(" camion Volvo");
//        moto.setName( " moto Kawasaki Z900");
//        moto.start();
//        camion.start();
//        coche.start();
        //Ejercicio 6
//        var email =new Notification.EmailNotification();
//        email.setMensaje("En este email encontrarás tus datos de acceso a....");
//        var sms = new Notification.SMSNotification();
//        sms.setMensaje("PUBLI SMS...");
//        var mensajeDeWeb = new Notification();
//        mensajeDeWeb.setMensaje(" Bienvenido usuario X...");
//
//        sendNotification(email);
//        sendNotification(sms);
//        sendNotification(mensajeDeWeb);
        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal.
        // Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
//        var perro = new Animal.Dog(" tom"," labrador");
//        perro.setType(" perro");
//
//        Animal gato = new Animal.Cat("garfield"," gatuna ");
//        gato.setType(" gato ");
//
//        var caballo = new Animal.Horse(" Rocinante ", " alguna clase");
//        caballo.setType(" caballo ");
//
//        showAnimalType(perro,gato,caballo);






    }
}