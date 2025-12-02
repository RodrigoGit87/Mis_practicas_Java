package Practicas_Rodrigo.Ejercicios_Classes_POO;
//1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
public class Book {
    String author;
    String title;
    // 3. Añade un constructor a la clase Book que reciba title y author.
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
static void main (){
        var libro1 = new Book("Mr.books","un Titulo" );
        IO.println("titulo: "+ libro1.title);
        IO.println ("Autor: "+ libro1.author);
}
}