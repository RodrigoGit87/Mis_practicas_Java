public class Condicionales {
    static void main() {
        /*
         * IF ELSE, ELSE IF. Aqui establecemos que se ejecute un código u otro segun la
         * condición que se cumpla
         */
        var age = 18;
        IO.println(age >= 18);
        if (age > 18) {
            IO.println("El usuario es mayor de edad ");
        } else if (age == 18) {
            IO.println("El usuario acaba de ser mayor de edad ! ");
        } else {
            IO.println("El usuario es menor de edad ");
        }

        /*
         * SWITCH. En los switch no establecemos una condicion como tal, sino que
         * inspeccionamos el valor de una
         * variable y asignando un codigo u otro según el 'case'
         */
        var day = 5;
        switch (day) {
            case 1:
                IO.println("Lunes");
                break;
            case 2:
                IO.println("Martes");
                break;
            case 3:
                IO.println("Miercoles");
                break;
            case 4:
                IO.println("Jueves");
                break;
            case 5:
                IO.println("Viernes");
                break;
            default:
                IO.println("Es finde !");
        }
    }
}