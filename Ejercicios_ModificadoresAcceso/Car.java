package Practicas_Rodrigo.Ejercicios_ModificadoresAcceso;
// 10. Crea una clase Car con el atributo privado speed. Agrega los métodos
// accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
public class Car {
    private int speed;
    String brand;
    private int maxSpeed = 120;
    //setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    //acelerar
    public void accelerate (int amount){
        int velocidadActual= speed += amount;
        if( velocidadActual > maxSpeed){
            speed = maxSpeed;
        }
    }
    //frenar
    public void brake (int amount){
        int velocidadActual = speed -= amount;
        if( velocidadActual < 0){
            speed= 0;
        }
    }
    //main
    static void main(){
        var coche1 = new Car();
        coche1.brand= "Honda";
        coche1.speed = 50;
//        coche1.accelerate(100);
        coche1.brake(170);
        IO.println("Velocidad del coche de la marca " + coche1.brand+ ", " + coche1.speed + " km/h");
    }


}
