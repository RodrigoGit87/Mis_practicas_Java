
// 1. Crea una clase Animal con el metodo makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban
//  ese metodo con sonidos diferentes. Llama al metodo desde una lista de Animal.


public class Animal {
    protected String name;
    protected String clase;
    private String type;
    //constructor
    public Animal(String name, String clase){
        this.name = name;
        this.clase = clase;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    //metodo
    public void makeSound(){
        IO.println(" Sonido indefinido ");
    }
//clase hija dog
    public static class Dog extends Animal{
        public Dog(String name, String clase){
            super(name, clase);
        }
        //metodo sobreescrito para dog
    @Override
    public void makeSound() {
        IO.println("El " +this.clase+", "+this.name +" hace: Woof, Woof!");
    }
}
//clase hija cat
public static class Cat extends Animal{
        public Cat (String name, String clase){
            super(name, clase);
        }
        //metodo sobreescrito para Cat
        @Override
    public void makeSound() {
            IO.println("El " +this.clase+", "+this.name +" hace: meoow");
    }
}
//clase hija Cow
public static class Cow extends Animal{

    public Cow(String name, String clase) {
        super(name, clase);
    }

    @Override
    public void makeSound() {
        IO.println("El " +this.clase+", "+this.name +" hace: Mooooo");
    }
}
//clase hija Horse
    public static class Horse extends Animal{
        public Horse (String name, String clase) {super(name, clase);}
    }
}
