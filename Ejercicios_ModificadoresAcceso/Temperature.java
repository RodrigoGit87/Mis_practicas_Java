package Practicas_Rodrigo.Ejercicios_ModificadoresAcceso;

import java.util.Scanner;

// 5. Crea una clase Temperature con el atributo privado celsius.
// El metodo setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
public class Temperature {
    private double celsius;
    //Setter
    Scanner sc= new Scanner(System.in);
    public void setCelsius(double celsius) {
            while ( celsius < -100 || celsius > 100){
                IO.println("Valor no válido, ingrese de nuevo");
                celsius = sc.nextDouble();
            }
            this.celsius= celsius;
            IO.println("Temperatura introducida: "+ celsius);
    }
    //main
    public static void main (){
        var termometro = new Temperature();
        termometro.setCelsius(200);
        IO.println(termometro.celsius);
    }
}
