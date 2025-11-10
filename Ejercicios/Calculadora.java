
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        String wellcome = "Calculator App";
        System.out.print (wellcome);
        //obteniendo numeros
        Scanner numeroScann = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = numeroScann.nextDouble(); 
        System.out.println("Enter second number: ");
        double num2 = numeroScann.nextDouble();
        
        //Operaciones básicas
        double Sum = num1 +num2;
        double Difference= num1 - num2;
        double Product= num1 * num2;
        double Quotient= num1 / num2;

        //Salida formateada para que siempre imprima un valor double con dos decimales
        System.out.printf("Sum: %.2f\n", Sum);
        System.out.printf("Difference: %.2f\n", Difference);
        System.out.printf("Product: %.2f\n", Product);
        System.out.printf("Quotient: %.2f\n", Quotient);

        numeroScann.close();
    }
}