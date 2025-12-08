package Practicas_Rodrigo.Ejercicios_Herencia;
// 7. Haz una clase Device con un constructor que imprima “Device created”.
// Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
public class Device {
    protected String name;
    protected String brand;
    protected int width;
    protected int height;
    //constructor
    public Device(String name, String brand){
        this.name = name;
        this.brand = brand;
        IO.print (" Devive created,");
    }
    //setter
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }

    public static class Phone extends Device{

    //constructor
    public Phone(String name, String brand) {
        super(name, brand);
        IO.print( " Phone: " + name + "ready !");
    }
    //metodo (por practicar)
    public void mostrarDetalles(){
        IO.println("\n--Details--\nBrand: "+brand+"\nWidth: "+ width+ "\nHeight: "+ height);
    }


}
}
