package Practicas_Rodrigo.Ejercicios_Classes_POO;
// 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
public class Rectangle {
    private double base;
    private double altura;

    //metodos
    public double calcularArea(double base, double altura){
        this.base=base;
        this.altura=altura;
        return base * altura;
    }
    public double calcularPerimetro(double base, double altura){
        this.base=base;
        this.altura=altura;
        return 2 * (base * altura);
    }
    //main
    static void main (){
        var rectangulo1 = new Rectangle();
        IO.println(rectangulo1.calcularArea(1,5));
        IO.println(rectangulo1.calcularPerimetro(5,8));
    }

}
