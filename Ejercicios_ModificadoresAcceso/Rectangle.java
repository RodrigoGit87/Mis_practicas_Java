package Practicas_Rodrigo.Ejercicios_ModificadoresAcceso;
// 8. Crea una clase Rectangle con los atributos privados width y height.
// Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
public class Rectangle {
    private double width;
    private double height;
    //Setters
    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    //Metodo
    public void calculateArea(){
        var area = height*width;
        IO.println("El area es: " + area);
    }
    //main
    static void main(){
        var rectangulo = new Rectangle();
        rectangulo.setHeight(5);
        rectangulo.setWidth(10);
        rectangulo.calculateArea();
    }
}
