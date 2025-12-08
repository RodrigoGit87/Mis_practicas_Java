package Practicas_Rodrigo.Ejercicios_Herencia;
/*Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly()
pero también llame al método original con super.fly().*/
public class Bird {
    protected String name;
    protected int wings;
    //Constrcutor
    public Bird(String name, int wings){
        this.name = name;
        this.wings = wings;
    }
    //metodo fly
    public void fly(){
        IO.print("El  " + this.name +" vuela con sus "+ this.wings+ " alas.");
    }
public static class Eagle extends Bird{
    //constructor
    public Eagle(String name, int wings) {
        super(name, wings);
    }
    //metodo fly
    @Override
    public void fly() {
        super.fly();
        IO.print(" y el "+name+ " vuela sobre la montaña");
    }

}
}


