package Practicas_Rodrigo.Ejercicios_ModificadoresAcceso;
// 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no
//  modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
public class Book {
     private String title;
    //Constructor
    public Book(String title) {
        this.title = title;
    }
    //Getter
    public String getTitle() {
        return title;
    }
    //Setter
    public void setTitle(String title) {
        this.title = title;
    }

    //main
    public static void main(){
        var libro1 = new Book("Programación en Java");
        IO.println("\n");
        IO.println(libro1.getTitle());
        libro1.setTitle("Don Quijote");
        IO.println("nuevo titulo :" + libro1.getTitle());
    }

}
