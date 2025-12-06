package Practicas_Rodrigo.Ejercicios_Herencia;
// 2. Define una clase Person con los atributos name y age.
// Luego crea una clase Student que agregue el atributo grade y un metodo study().
public class Person {
    protected String name;
    protected int age;

public static class Student extends Person{
    protected String grade;

    public String study(boolean sn){
        if (sn == true) grade = " A";
        else grade = " suspenso";
        IO.print(grade);
        return grade;
    }
}
}
