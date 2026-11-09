import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la nota de Examenes: ");
        double examenes = scanner.nextDouble();
        System.out.print("Ingrese la nota de Tareas: ");
        double tareas = scanner.nextDouble();
        System.out.print("Ingrese la nota de Proyecto: ");
        double proyecto = scanner.nextDouble();
        
        double calificacionFinal = (examenes * 0.40) + (tareas * 0.30) + (proyecto * 0.30);
        
        System.out.println("La calificacion final es: " + calificacionFinal);
        scanner.close();
    }
}