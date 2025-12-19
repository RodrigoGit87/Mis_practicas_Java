//Abstracción: 'Blinda' la superclase, no permitiendo hacer instancias (objetos) de esa clase.
/*En este caso, la clase animal abstracta está definiendo el funcionamiento por defecto, pero no
permite el animal objeto instanciable (un new Animal).
 */
public class Abstracion {
    static void main(String[] args) {
        /*
         * var animal = new Animal(); // <-- no se permite instanciar de la superclase
         * abstracta
         */
        var dog = new Dog();// la clase Dog si se permite por q no es abstracta, pero es heredada de
        // la superclase abstracta Animal
        dog.sleep();/*
                     * Aunq el metodo sleep es propio de la superclase, gracias a la hederacion,
                     * se puede usar en la instancia de la clase hija(tmb heredada)
                     */
        dog.sound();

        var cat = new Cat();
        cat.sleep();
        cat.sound();

        var bat = new Bat();
        bat.sound();
        bat.fly();
        bat.fly2();
        bat.sleep();

    }

    // Clase Abstracta
    public static abstract class Animal {
        public abstract void sound(); /*
                                       * Metodo con abstraccion. ESte metodo indica q todos los animales pueden tener
                                       * sonido, pero no especifica cual (es abstracto) por lo q cada clase hija debe
                                       * definir el metodo sonido
                                       */

        public void sleep() { // metodo sin abstracción
            System.out.println(" El animal esta durmiendo ");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println(" Guau ");
        }

        @Override
        public void sleep() {
            System.out.println(" El perro duerme ");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void sound() {
            System.out.println(" meow ");
        }

        @Override
        public void sleep() {
            System.out.println(" el gato duerme");
        }
    }

    // Interface - Tipo de abstracción
    /*
     * La interfaz permite una 'plantilla' de un metodo especifico q queramos
     * implementar en ciertas
     * clases hijas
     */
    /*
     * Las interfaces, a diferencia de la herencia q solo permite heredar de uan
     * superclase, si que permiten implementar
     * varias interfaces en la clase hija. Eso da la posibilidad de especializar, un
     * animal en este ejemplo,
     * todo lo q queramos
     */
    public interface Flying {
        void fly();
    }

    public interface Flying2 {
        void fly2();
    }

    public static class Bird extends Animal implements Flying { // palabra reservada implements + nombre Interfaz

        @Override
        public void sound() {
            System.out.println(" pio pio");
        }

        @Override
        public void fly() { // al usar implements nos dirá el IDe de agregar el metodo q viene con la
                            // interfaz. lo hacemos
            // y ya lo definimos.
            System.out.println(" El pajaro vuela ");

        }
    }

    public static class Bat extends Animal implements Flying, Flying2 { // <-- 2 interfaces en la misma clase

        @Override
        public void sound() {
            System.out.println(" I'm Batman ");
        }

        @Override
        public void fly() {
            IO.println(" Murcielago vuela ");
        }

        @Override
        public void fly2() {
            IO.println(" Murcielago vuela en picado ");
        }
    }
}
