public class Herencia {
    // La herencia permite q una clase 'herede' atributos y metodos de otra clase
    // (de la clase 'padre').

    // Clase animal
    public static class Animal {
        // atributos
        String name;

        // constructor. Al crear un constructor en la superclase, si en las subclases no
        // se crea uno, da error. Y habrá q crear el constructor de la subclase.
        // q al pasar el raton en la clase con el subrallado rojo nos lo dirá y podemos
        // hacer click para generar dicho constructor.
        public Animal(String name) {
            this.name = name;
        }

        // metodo comer
        public void eat() {
            IO.println("El animal con nombre " + name + " está comiendo");
        }
    }

    // Clase perro
    public static class Dog extends Animal { // la clase hija "Dog" extiende (hereda) de la clase "Animal".
          int age;
        //constructor Dog (podemos especializarlo, usando metodos y o atributos de la superclase y añadiendo propios)
        public Dog(String name, int age){ //el parametro age es propio de la subclase Dog
            super(name);// super. hace referencia a la superclase.
            this.age = age; //this.age hace referencia al atributo age de la subclase Dog
        }
    
        public void eat() { // Podemos sobreescribir un metodo de la clase padre (el eat) en las subclases y
                            // modificarlas/'especializarlas'
            IO.println("El perro con nombre " + name + " está comiendo");// En las subclases donde no halla un metodo
                                                                         // sobreescrito, heredará el del padre.
        }
    }

    // Clase gatuna
    public static class Cat extends Animal {
        @Override // otra opción de sobreescribir es con @Override
        public void eat() {
            // super.eat(); //super hace referencia a la superclase (clase padre)
            IO.println("el gato con nombre " + super.name + " está comiendo"); // super. hace referencia a la superclase
        }
        
        public Cat(String name){
            super(name);
        }
    }

    // clase pajaro
    public static class Bird extends Animal {

        public void fly() {
            IO.println("el pajaro está volando");
        }

        public Bird(String name){
            super(name);
        }
    }

    static void main(String[] args) {

        var animal = new Animal("Este Animal");
        animal.eat();

        var dog = new Dog("Agallas", 5);
        dog.eat();

        var cat = new Cat("Garfield");
        cat.eat();

        var bird = new Bird("gorrión");
        bird.eat();
        bird.fly(); // <-- Es metodo es algo q solo hace el pajaro por q solo existe en su clase

    }
}
