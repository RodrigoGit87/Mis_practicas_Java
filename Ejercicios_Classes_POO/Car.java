package Practicas_Rodrigo.Ejercicios_Classes_POO;
// 4. Crea una clase Car con atributos brand y model y un método showData().
public class Car {
    String brand;
    String model;

public void showData(){
    IO.println("Marca: "+ this.brand);
    IO.println("Modelo: "+ this.model);
    }
}