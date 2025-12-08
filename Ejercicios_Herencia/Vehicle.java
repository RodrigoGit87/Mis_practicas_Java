package Practicas_Rodrigo.Ejercicios_Herencia;
// 1. Crea una clase Vehicle con un metodo move().
//  Luego crea una subclase Car que herede de Vehicle y agrega el metodo honk().
// 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un metodo describe() sobrescrito.
public class Vehicle {
    protected String brand;
    protected String name;
    protected int wheels;
    protected String type;
    //constructor
    public Vehicle(String brand, String name, int wheels, String type) {
        this.brand = brand;
        this.name = name;
        this.wheels = wheels;
        this.type = type;
    }
    //metodos
    public void move(){
        IO.println("\nEl vehiculo "+ this.name + " se mueve");
    }
    public void describe(){
        IO.print("\nMarca: " +brand+"\nNombre: "+name+"\nRuedas: "+wheels+"\nTipo: "+type);
    }
public static class Car extends Vehicle{
    public Car(String brand, String name, int wheels, String type) {
        super(brand, name, wheels, type);
    }
    public void honk(){
            IO.println("El coche " + super.brand + " toca la bocina");
    }
    @Override
    public void describe() {
        super.describe();
    }
}
public static class Bike extends Vehicle{
        //constructor
        public Bike(String brand, String name, int wheels, String type) {
        super(brand, name, wheels, type);
    }
    //metodo describe sobreescrito
    @Override
    public void describe() {
        super.describe();
    }
}
public static class Truck extends Vehicle{
    public Truck(String brand, String name, int wheels, String type) {
        super(brand, name, wheels, type);
    }
    @Override
    public void describe() {
        super.describe();
    }
}
}
