

public class Persona {
    // Atributos
    String name;
    int age;

    // Constructor, mecanismo de instanciación con valores predefinidos.
    /*
     * Por ejemplo la entidad Usuario, debería estar definida si o si por un usuario
     * y contraseña.
     */
    public Persona(String name, int age) { // meter como parametros los atributos de la clase, obliga a q
        // cada vez que se instacia la clase Person, se defina dichos atributos (name y
        // age en este caso)

        this.name = name; // this. hace q los parametros hagan referencia a los atributos de la clase,
        this.age = age;// por que si solo definimos los parametros y no tenemos this.X en el
                       // constructor... No se definirían al llamar a la clase
    }

    // Funciones
    public void sayHello() {
        IO.println("Hola, soy " + name + " y tengo " + age + " años.");
    }

}
