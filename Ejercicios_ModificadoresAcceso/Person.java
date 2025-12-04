package Practicas_Rodrigo.Ejercicios_ModificadoresAcceso;
// 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() 
// para asignar y mostrar valores desde otra clase.

public class Person {
    private String name;
    private int age;

    //getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        if(age >18){
        this.age = age;
        } else IO.println("\nEdad no válida");
    }



}
