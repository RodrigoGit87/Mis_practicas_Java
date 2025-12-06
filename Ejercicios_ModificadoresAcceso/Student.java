package Practicas_Rodrigo.Ejercicios_ModificadoresAcceso;
// 9. Crea una clase Student con el atributo privado grade.
// Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
public class Student {
    private int grade;

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isPassed(){
        boolean aprobado= false;
        if (grade>= 60){
            boolean aprobrado = true;
            IO.println("aprobrado? " + aprobrado);
        } else {
            IO.print("aprobado? " + aprobado);
            aprobado = false;
        }
        return aprobado;
    }

    static void main (){
        var estudiante = new Student();
        estudiante.setGrade(70);
        estudiante.isPassed();
    }



}
