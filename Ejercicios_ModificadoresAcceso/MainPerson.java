package Practicas_Rodrigo.Ejercicios_ModificadoresAcceso;

public class MainPerson {
    public static void main(String[] args){

        var persona = new Person();
        persona.setName("rodri");
        persona.setAge(20);
        IO.println("nombre: "+persona.getName()+" edad: "+ persona.getAge());
        
    }
}
