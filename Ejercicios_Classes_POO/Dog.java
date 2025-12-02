package Practicas_Rodrigo.Ejercicios_Classes_POO;
//Crea una clase Dog con un método bark() que imprima su sonido.
public class Dog {
    String name;

public void bark(){
    IO.println("!Guau, Guau, Guau !");
}

//main
static void main(){
    var perro1 = new Dog();
    perro1.name="Tom";
    IO.println("El perro "+ perro1.name+" hace: ");
    perro1.bark();
}
}