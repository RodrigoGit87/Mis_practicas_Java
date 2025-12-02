package Practicas_Rodrigo.Ejercicios_Classes_POO;
// 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
public class Student {
    int score;

    public void setScore(int score) {
        this.score = score;
        if (score >= 60) IO.println("El estudiante: " + " , aprobó con calificación: "+score );
        else IO.println("El estudiante no ha aprobado.");
    }

    //main
    static void main (){
        var estudiante1 = new Student();
        estudiante1.setScore(59);
    }
}

