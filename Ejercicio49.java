import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el promedio academico: ");
        double promedio = scanner.nextDouble();
        System.out.print("Ingrese el ingreso familiar mensual: ");
        double ingreso = scanner.nextDouble();
        System.out.print("Ingrese el numero de hermanos estudiantes: ");
        int hermanos = scanner.nextInt();
        
        boolean otorgaBeca = ((promedio >= 9.5) || ((ingreso < 8000.0) && (hermanos > 2)));
        
        System.out.println("¿Se otorga la beca universitaria?: " + otorgaBeca);
        scanner.close();
    }
}