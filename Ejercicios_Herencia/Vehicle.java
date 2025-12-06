package Practicas_Rodrigo.Ejercicios_Herencia;
// 1. Crea una clase Vehicle con un metodo move().
//  Luego crea una subclase Car que herede de Vehicle y agrega el metodo honk().
public class Vehicle {
    protected String brand;

    public void move(){
        IO.println("El vehiculo "+ this.brand + "se mueve");
    }
public static class Car extends Vehicle{
        public void honk(){
            IO.println("El coche " + super.brand + "toca la bocina");
        }
}

}
