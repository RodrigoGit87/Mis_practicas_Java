package Practicas_Rodrigo.Ejercicios_ModificadoresAcceso;
// 6. Crea una clase User con los atributos privados username y password. Implementa los métodos
// setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
public class User {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //metodo checkear passwords
    public void checkPassword(String inputPassword){
        IO.println("¿Son iguales(distinguiendo Mayus y minus)? " + password.equalsIgnoreCase(inputPassword));
        IO.println("Son iguales absolutamente? " + password.equals(inputPassword));
    }
    //main
    static void main(){
        var usuario1 = new User("rodri","wasd");
        usuario1.checkPassword("wAsD");
    }
}
