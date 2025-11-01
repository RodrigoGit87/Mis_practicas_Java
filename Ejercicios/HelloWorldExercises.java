package Practicas_Rodrigo;
import javax.swing.plaf.synth.SynthDesktopPaneUI;

public class HelloWorldExercises {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
         static void main(){
            IO.println ("Rodrigo");//System.out. ahora se acorta a IO (Inputo Output)
            // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println
            IO.println("Hola \n mundo");// \ indica q el siguiente caracter hace algo. n hace referencia a newline. \n es salto de linea
            // 3. Añade un comentario sobre lo que hace cada línea del programa.
            // 4. Crea un comentario en varias líneas.
            /*
            Comentario en varias lineas
            ..
            ..
             */
            // 5. Imprime tu edad, tu color favorito y tu ciudad.
            int edad = 30;
            String nombre = "rodrigo";
            String ciudad = "Granada";
            IO.println (nombre + "\n" + edad +"\n"+ ciudad);
            // 6. Explora los diferentes System.XXX.println(); más allá de "out"
            //System.in -> equivalente a readln(); y System.err.println();

            // 7. Utiliza varios println para imprimir una frase.
            IO.print("1º frase:frase comun y estandar " + "sin salto. ");
            IO.println("2ª frase: Frase con \nsalto de linea");
            IO.println ("3 frase: frase concatenando el string nombre"+ ":"+ nombre);

            // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).

                IO.println("   -----");
                IO.println("  ( o o )");
                IO.println("   \\ _ /");
            }
            // 9. Intenta ejecutar el programa sin el méto do main y observa el error.

            //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
}